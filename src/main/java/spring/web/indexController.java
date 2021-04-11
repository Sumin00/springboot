package spring.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import spring.service.PostsService;

@RequiredArgsConstructor
@Controller
public class indexController {

    private final PostsService postsService; // 서비스 연결

    @GetMapping("/") // 메인 페이지 get
    public String index(){
        return "index";
    }

    @GetMapping("/posts/save") // 등록 페이지 get
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(){
        return "posts-update";
    }
}
