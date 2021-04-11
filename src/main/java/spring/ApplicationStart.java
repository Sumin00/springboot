package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication // 해당클래스를 스프링부트 사용 선언
public class ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class,args);
    }
}