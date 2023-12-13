package com.deean.dnmall.interceptor;

import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: Deean
 * Date: 2023-12-13 22:40
 * FileName: api/src/main/java/com/deean/dnmall/interceptor
 * Description:
 */

@Component
public class CheckTokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("### 启动拦截器CheckTokenInterceptor ###");
        String method = request.getMethod();
        if ("OPTIONS".equalsIgnoreCase(method)) {
            return true;
        }

        String token = request.getHeader("token");
        if (token == null) {
            ResultVO resultVO = new ResultVO(ResStatus.fail, "请先登录！", null);
            doResponse(response, resultVO);
        } else {
            try {
                JwtParser parser = Jwts.parser();
                parser.setSigningKey("deean");
                //如果token正确（密码正确，有效期内）则正常执行，否则抛出异常
                Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                return true;
            } catch (ExpiredJwtException e) {
                ResultVO resultVO = new ResultVO(ResStatus.fail, "登录过期，请重新登录", null);
                doResponse(response, resultVO);
            } catch (UnsupportedJwtException e) {
                ResultVO resultVO = new ResultVO(ResStatus.fail, "Token不合法", null);
                doResponse(response, resultVO);
            } catch (Exception e) {
                ResultVO resultVO = new ResultVO(ResStatus.fail, "请先登录", null);
                doResponse(response, resultVO);
            }
        }
        return false;
    }

    private void doResponse(HttpServletResponse response, ResultVO resultVO) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String s = new ObjectMapper().writeValueAsString(resultVO);
        out.print(s);
        out.flush();
        out.close();
    }
}
