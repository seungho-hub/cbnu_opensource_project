package cbnuopen10.server.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

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
    private int supporter_id;

    @Column(length = 20, nullable = false)
    private String product_name;

    @Column(nullable = false)
    private int product_id;

    @Column(nullable = false)
    private int price;

    public SupportEntity(int supporter_id, String product_name, int product_id, int price){
        this.supporter_id = supporter_id;
        this.product_name = product_name;
        this.product_id = product_id;
        this.price = price;
    }
}