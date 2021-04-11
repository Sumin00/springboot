package spring.controller.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.controller.domain.posts.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {
                                        // JpaRepository<도메인명 , 기본킨의 자료형(없으면 첫번째 필드 자료형)> => DAO 역할 : DB 접근 인터페이스
}
