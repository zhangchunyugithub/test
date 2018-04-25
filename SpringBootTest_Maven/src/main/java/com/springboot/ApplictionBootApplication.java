package com.springboot;

import com.springboot.banner.MyBanner;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther zhangchy
 * @create 2018/1/10
 */

@SpringBootApplication
public class ApplictionBootApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(ApplictionBootApplication.class);
        //set banner
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.setBanner(new MyBanner());

        app.run(args);
//        SpringApplication.run(ApplictionBootApplication.class, args);
//        SpringApplication.
    }

  /*  @Bean
    public FilterRegistrationBean initFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new InitFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }*/

    /**
     * freemarker 设置
     * @return
     */
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        Map<String, Object> variables = new HashMap<>();
        variables.put("feAddress", "1222");
        configurer.setTemplateLoaderPaths("classpath:/templates/");
        configurer.setFreemarkerVariables(variables);
        return configurer;
    }


}
