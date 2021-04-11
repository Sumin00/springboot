package spring.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.service.PostsService;
import spring.web.dto.PostsSaveRequestDto;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService; // 서비스 연결

    // 저장 컨트롤 = postmapping
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    // 수정 컨트롤

    // 삭제 컨트롤

    // 조회 컨트롤
}
