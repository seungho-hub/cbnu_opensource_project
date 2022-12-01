package cbnuopen10.server.data.project;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Entity
public class ProjectEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String product_name;

    @Column
    private String product_url;

    @Column
    private int price;

    @Column
    private LocalDateTime start_date;

    @Column
    private LocalDateTime end_date;

    @Column
    private Long user_id;

    @Column
    private String receiver_name;

    @Column
    private String receiver_hp;

    @Column
    private String addr;

    public void setStart_date(LocalDateTime start_date) {
        this.start_date = start_date;
    }
}
