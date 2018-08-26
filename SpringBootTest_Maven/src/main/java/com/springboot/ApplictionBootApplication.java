package com.springboot;

import com.springboot.banner.MyBanner;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther zhangchy
 * @create 2018/1/10
 */
@EnableScheduling
@SpringBootApplication
//@ImportResource({ IMiddlerWare.MWCLIENT_CONFIG_XML })
@ServletComponentScan
public class ApplictionBootApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(ApplictionBootApplication.class);
        //set banner
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.setBanner(new MyBanner());
//        app.setListeners(new MwClientLoader());

        app.run(args);
//        SpringApplication.run(ApplictionBootApplication.class, args);
//        SpringApplication.
    }

   /* @Bean
    public ServletListenerRegistrationBean listener (){
        ServletListenerRegistrationBean<MwClientLoader> bean = new ServletListenerRegistrationBean();
        bean.setListener(new MwClientLoader());
        return bean;
    }*/



  /*  @Bean
    public FilterRegistrationBean initFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new InitFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }*/

//    @Bean
//    public FilterRegistrationBean RequestListener() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new DiworkRequestListener());
//        registrationBean.addUrlPatterns("/*");
//        return registrationBean;
//    }


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

    /**
     * springboot  自定义数据源
     * @return
     */
    //@Bean
    public DataSource dataSource() {

        return DataSourceBuilder.create().build();

//       DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl("123123");
//        dataSource.setUsername(env.getProperty("spring.datasource.username"));
//        dataSource.setPassword(env.getProperty("spring.datasource.password"));
//        try {
//            dataSource.init();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return dataSource;
    }


}
