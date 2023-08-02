package cn.xuqg.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced 自己手写了
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}