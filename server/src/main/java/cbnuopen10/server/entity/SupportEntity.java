package cbnuopen10.server.entity;

import lombok.*;

import javax.persistence.*;

@ToString //클래스 정보 출력해주는 Annotation
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "support_tb")
@Entity
public class SupportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //MySQL의 AUTO_INCREMENT를 사용
    private int id;

    @Column(nullable = false)
    private int support_id;

    @Column(length = 20, nullable = false)
    private String product_name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int product_id;
}
