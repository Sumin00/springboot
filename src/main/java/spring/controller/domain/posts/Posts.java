package spring.controller.domain.posts;

import lombok.*;

import javax.persistence.*;

@Getter // get 메소드 자동 사용
@NoArgsConstructor // 깡통[빈] 생성자 생성//@RequiredArgsConstructor : 생성자 자동 생성
@Entity // 해당 클래스를 관계형 데이터베이스 클래스 사용 : JPA DB 클래스
public class Posts { // DB 테이블 설계

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 오토키
    private Long id;

    @Column(length = 500, nullable = false) // 열[필드] 속성
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) // 열[필드] 속성
    private String content;

    private String author;

    @Builder // 객체 생성시 안정성 보장 => 인수 순서 구분x // null 제외 등
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
