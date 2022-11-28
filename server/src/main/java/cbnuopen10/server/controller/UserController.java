package cbnuopen10.server.controller;

import java.util.List;

import cbnuopen10.server.entity.UserEntity;
import cbnuopen10.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/v1")
public class UserController{

    private final UserRepository userRepository;

    /**
     * 멤버 조회
     * @return
     * */
    @GetMapping("user")
    public List<UserEntity> findAllMember() {
        return userRepository.findAll();
    }

    /**
     * 회원가입
     * @return
     */
    @PostMapping("user")
    public UserEntity signUp() {
        final UserEntity user = UserEntity.builder()
                .user_name("dongu")
                .user_hp("010-3907-5845")
                .billingkey("test billingKey")
                .build();
        return userRepository.save(user);
    }
}