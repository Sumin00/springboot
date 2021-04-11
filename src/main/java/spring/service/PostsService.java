package spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.controller.domain.posts.PostsRepository;
import spring.web.dto.PostsSaveRequestDto;


@RequiredArgsConstructor // 자동 생성자
@Service // 현재 클래스는 서비스 역할 => db접근된 데이터를 java 로직 : 서비스에 관련된 데이터 제공.
public class PostsService {

    private final PostsRepository postsRepository; // Repository :  db접근

    ///// 저장 로직
    @Transactional // db접근된 병렬 처리
    public Long save(PostsSaveRequestDto requestDto) {

        return postsRepository.save(  requestDto.toEntity() ).getId();
    }


}

