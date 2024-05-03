package first.first.member;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    @Transactional
    public Member update(@RequestParam String nickname, Member member) {
        Member update = memberRepository.findByEmail(member.getEmail());
        if (update == null){
            throw new IllegalStateException("해당없음");
        }
        update.setNickname(nickname);

        return update;
    }
}
