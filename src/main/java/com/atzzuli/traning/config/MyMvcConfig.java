package com.atzzuli.traning.config;

import com.atzzuli.traning.component.LoginHandlerIntereptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Bean//注册组件
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            public void addViewController(ViewControllerRegistry registry){
                registry.addViewController("/login.html").setViewName("login");
            }
        //注册拦截器
            @Override
        public void addInterceptors (InterceptorRegistry registry){
            //super.addInterceptors(registry);
            //静态资源拦截
            registry.addInterceptor(new LoginHandlerIntereptor()).addPathPatterns("/**")
                    .excludePathPatterns("/login.action","/login", "/dashbord.html","/login.html", "/registry,html","/registry","/", "/asserts/**");
        }
        };
        return  adapter;
    }
}






