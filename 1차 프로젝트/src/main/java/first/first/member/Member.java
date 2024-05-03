package first.first.member;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long member_id;
        @Column(unique = true, nullable = false)
        @Size(min = 5, max = 50)
        private String email;
        @Column(nullable = false)
        private String nickname;
        @Column(nullable = false)
        private String username;
        @Column(nullable = false)
        private String password;
        @Column(nullable = false)
        private String birth;

        @CreatedDate
        private LocalDateTime cdate;

        @LastModifiedDate
        private LocalDateTime udate;
    }


