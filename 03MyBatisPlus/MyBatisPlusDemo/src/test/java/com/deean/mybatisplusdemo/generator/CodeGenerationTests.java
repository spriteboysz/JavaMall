package com.deean.mybatisplusdemo.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

/**
 * Author: Deean
 * Date: 2023-11-26 22:23
 * FileName: src/test/java/com/deean/mybatisplusdemo/generator
 * Description:
 */


@SpringBootTest
@ExtendWith(ExecutionCondition.class)
public class CodeGenerationTests {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/bookmall?characterEncoding=UTF-8&useUnicode=true&useSSL=false", "root", "abc123")
                // 全局配置
                .globalConfig(builder -> {
                    builder.author("deean") // 设置作者
                            .commentDate("yyyy-MM-dd hh:mm:ss")   //注释日期
                            .outputDir(System.getProperty("user.dir") + "/src/main/java") // 指定输出目录
                            .disableOpenDir(); //禁止打开输出目录，默认打开
                })
                // 包配置
                .packageConfig(builder -> {
                    builder.parent("demo.generator") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "/src/main/resources/mappers")); // 设置mapperXml生成路径
                })
                // 策略配置
                .strategyConfig(builder -> builder.addInclude("sys_menu") // 设置需要生成的表名
                        .addTablePrefix("sys_") // 设置过滤表前缀
                        // Entity 策略配置
                        .entityBuilder()
                        .enableLombok() //开启 Lombok
                        .enableFileOverride() // 覆盖已生成文件
                        .naming(NamingStrategy.underline_to_camel)  //数据库表映射到实体的命名策略：下划线转驼峰命
                        .columnNaming(NamingStrategy.underline_to_camel)    //数据库表字段映射到实体的命名策略：下划线转驼峰命
                        // Mapper 策略配置
                        .mapperBuilder()
                        .enableFileOverride() // 覆盖已生成文件
                        // Service 策略配置
                        .serviceBuilder()
                        .enableFileOverride() // 覆盖已生成文件
                        .formatServiceFileName("%sService") //格式化 service 接口文件名称，%s进行匹配表名，如 UserService
                        .formatServiceImplFileName("%sServiceImpl") //格式化 service 实现类文件名称，%s进行匹配表名，如 UserServiceImpl
                        // Controller 策略配置
                        .controllerBuilder()
                        .enableFileOverride()
                ).execute();
    }
}
