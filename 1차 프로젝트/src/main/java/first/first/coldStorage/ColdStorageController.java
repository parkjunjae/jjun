package first.first.coldStorage;

import first.first.member.Member;
import first.first.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class ColdStorageController {

    private final MemberRepository memberRepository;
    private final ColdStorageService coldStorageService;

    @GetMapping("/cold/")
    public List<ColdStorage> getColdStorage(@RequestParam Long memberid) {
        Optional<Member> member = memberRepository.findById(memberid);
        return coldStorageService.getColdStorage(memberid);
    }

    @PutMapping("/update/")
    public ColdStorage Upcoldsto(@RequestParam int quantity, @RequestParam Long coldstroage_id, ColdStorage coldStorage) {
        ColdStorage update = coldStorageService.Upcoldsto(quantity, coldstroage_id, coldStorage);
        System.out.println(update);
        return update;
    }

    @DeleteMapping("/delete/")
    public ColdStorage delecole(@RequestParam Long coldstorage_id) {
        ColdStorage dele = coldStorageService.delecolde(coldstorage_id);
        return dele;
    }

    @GetMapping()
    public ResponseEntity<List<ColdStorage>> Expiration(ColdStorage coldStorage) {
        List<ColdStorage> get = coldStorageService.Expiration(coldStorage);
        return ResponseEntity.ok(get);
    }

    @PostMapping("/cold/add")
    public ResponseEntity<ColdStorage> addcold( ColdStorage coldStorage) {
        ColdStorage add = coldStorageService.regist(coldStorage);
        return ResponseEntity.ok(add);
    }
}
