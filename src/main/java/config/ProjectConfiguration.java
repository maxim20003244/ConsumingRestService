package config;

import feign.RequestInterceptor;
import feign.auth.BasicAuthRequestInterceptor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
public class ProjectConfiguration {
    @Bean
    public BasicAuthRequestInterceptor basicAuthenticationInterceptor(){
        return new BasicAuthRequestInterceptor("maxim2000324@gmail.com","password");
    }


}
