package spring.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import spring.controller.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto { // 저장 객체

    private String title;
    private String content;
    private String author;

    @Builder
    PostsSaveRequestDto(String title, String content, String author){

        this.title=title;
        this.content=content;
        this.author=author;
    }

    public Posts toEntity(){
        return Posts.builder().title(title).content(content).author(author).build(); // 인수는 순서 구분 필요x
    }
}
