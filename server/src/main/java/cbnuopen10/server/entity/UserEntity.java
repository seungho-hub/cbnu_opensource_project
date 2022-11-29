package cbnuopen10.server.entity;

import lombok.*;

import javax.persistence.*;

@ToString //클래스 정보 출력해주는 Annotation
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_tb")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //MySQL의 AUTO_INCREMENT를 사용
    private int id;

    @Column(length = 20, nullable = false)
    private String user_name;

    @Column(length = 50, nullable = false)
    private String user_hp;

    @Column(length = 200,   nullable = false)
    private String billingkey;

    /* user_name과 user_hp 받아서 DB에 저장 */
    public UserEntity(String user_name, String user_hp) {
        this.user_name = user_name;
        this.user_hp = user_hp;
    }

}
