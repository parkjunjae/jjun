package first.first.coldStorage;

import first.first.foodinfo.FoodInfo;
import first.first.member.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ColdStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long coldstroage_id;
    @Column
    private int quantity;


    // 등록일
    private Date regdate;

    // 만료일
    private LocalDate exp_date;



    @Enumerated(EnumType.STRING)
    private Foodtype foodtype;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "foodinfo_id")
    private FoodInfo foodInfo;
}
