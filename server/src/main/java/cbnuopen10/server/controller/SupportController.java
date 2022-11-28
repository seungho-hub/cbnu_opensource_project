package cbnuopen10.server.controller;

import java.util.List;

import cbnuopen10.server.entity.SupportEntity;
import cbnuopen10.server.repository.SupportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/v1")
public class SupportController{

    private final SupportRepository supportRepository;

    

    @GetMapping("support")
    public List<SupportEntity> findAllMember() {
        return supportRepository.findAll();
    }

    @PostMapping("support")
    public SupportEntity signUp() {
        final SupportEntity user = SupportEntity.builder()
                .support_id(1)
                .product_id(1)
                .product_name("test name")
                .price(999999999)
                .build();
        return supportRepository.save(user);
    }
}