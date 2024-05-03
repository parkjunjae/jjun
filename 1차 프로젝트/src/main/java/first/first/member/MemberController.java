package first.first.member;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MemberController {

    private final MemberService memberService;


    @PutMapping("/update")
    public Member update(@RequestParam String nickname, Member member){
        Member dbmember = memberService.update(nickname,member);
        return dbmember;
    }
}
