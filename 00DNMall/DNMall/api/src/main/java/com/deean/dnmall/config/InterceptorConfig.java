package com.deean.dnmall.config;

import com.deean.dnmall.interceptor.CheckTokenInterceptor;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author: Deean
 * Date: 2023-12-13 23:07
 * FileName: api/src/main/java/com/deean/dnmall/config
 * Description:
 */

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    private CheckTokenInterceptor checkTokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(checkTokenInterceptor)
                .addPathPatterns("/shoppingcart/**")
                .addPathPatterns("/orders/**")
                .addPathPatterns("/useraddr/**")
                .addPathPatterns("/user/check");
    }
}
