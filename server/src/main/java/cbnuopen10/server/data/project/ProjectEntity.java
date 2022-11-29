package cbnuopen10.server.data.project;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@ToString //클래스 정보 출력해주는 Annotation
@Getter //getter, setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "project_tb")
@Entity
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20, nullable = false)
    private String product_name;

    @Column(length = 200, nullable = false)
    private String product_url;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private Date start_date;

    @Column(nullable = false)
    private Date end_date;

    @Column(length = 20, nullable = false)
    private String receiver_name;

    @Column(length = 50, nullable = false)
    private String receiver_hp;

    @Column(length = 200, nullable = false)
    private String addr;

    public ProjectEntity(String product_name, String product_url, int price, Date end_date ,String receiver_name, String receiver_hp, String addr){
//        this.id = id;
        this.user_id = -1;
        this.start_date = Date.valueOf(LocalDate.now());
        this.end_date = end_date;
        this.product_name = product_name;
        this.product_url = product_url;
        this.price = price;
        this.receiver_name = receiver_name;
        this.receiver_hp = receiver_hp;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "product_name='" + product_name + '\'' +
                ", product_url='" + product_url + '\'' +
                ", price='" + price + '\'' +
                ", end_date='" + end_date + '\'' +
                ", reciever_name='" + receiver_name + '\'' +
                ", reciever_hp='" + receiver_hp + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

}
