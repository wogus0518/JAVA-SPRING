package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //Repository에서의 4가지 기능

    Member save(Member member);                // save를 하면 저장소에 Member가 저장

    Optional<Member> findById(Long id);        // id를 이용해서 저장된 Member에서 찾아준다. null인 경우 Optional
    Optional<Member> findByName(String name);  // name을 이용해서 저장된 Member에서 찾아준다. null인 경우 Optional

    List<Member> findAll();                    // 지금까지 저장된 모든 Member를 불러온다.
}
