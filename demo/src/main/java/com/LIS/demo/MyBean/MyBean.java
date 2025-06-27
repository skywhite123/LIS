package com.LIS.demo.MyBean;

import com.LIS.demo.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBean {
    @Bean
    User getUserBean(){
        User user=new User();
        return user;
    }

}
