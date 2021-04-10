package spring.controller.domain.posts;

import lombok.*;

import javax.persistence.*;

@Entity // 해당 클래스를 관계형 데이터베이스 클래스 사용 : JPA DB 클래스
@Getter // get 메소드 자동 사용
@NoArgsConstructor
//@RequiredArgsConstructor : 생성자 자동 생성
public class Posts { // DB 테이블 설계

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI = 오토 키 부여
    private Long id; //게시물 번호

    // column 설정=> 필드 설정= 기본값 =>
    @Column(length = 500, nullable = false) // varchar(len)
    private String title; //게시물 제목

    @Column(columnDefinition ="TEXT",nullable = false)
    private String content; // 게시물 내용


    private String author; // 게시물 작성자

    @Builder // 생성자의 안전성 보장: 1. JPA 인수 순서 구분x 2. null 값 자동 제한 등
    //생성자
    public Posts(String title, String content, String autohor){

        this.title=title;
        this.content=content;
        this.author=autohor;

    }

}
