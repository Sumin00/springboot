package spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 클래스 JSON 반환하는 컨트롤러를 사용
public class HelloController {

    @GetMapping("/") // 해당 메소드를 http get 요청을 받을 수 있는 이노테이션 :'/'=> 기본 port 주소
    public String hello(){
        return "main";
    }

}
