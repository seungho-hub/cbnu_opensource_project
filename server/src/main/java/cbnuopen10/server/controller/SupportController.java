package cbnuopen10.server.controller;

import java.util.List;

import cbnuopen10.server.dto.ProjectDTO;
import cbnuopen10.server.dto.SupportDTO;
import cbnuopen10.server.entity.ProjectEntity;
import cbnuopen10.server.entity.SupportEntity;
import cbnuopen10.server.repository.SupportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/support")
public class SupportController{

    private final SupportRepository supportRepository;

    @PostMapping("/product")
    public String supportProduct(SupportDTO support) {
        //1. Dto를 Entity로 변환
        SupportEntity entity = support.toEntity();

        //2. Repository에게 Entity를 DB에 저장하게 함.
        SupportEntity saved = supportRepository.save(entity);
        System.out.println(saved.toString());

        return "";
    }



//    @GetMapping("support")
//    public List<SupportEntity> findAllMember() {
//        return supportRepository.findAll();
//    }
//
//    @PostMapping("support")
//    public SupportEntity signUp() {
//        final SupportEntity user = SupportEntity.builder()
//                .support_id(1)
//                .product_id(1)
//                .product_name("test name")
//                .price(999999999)
//                .build();
//        return supportRepository.save(user);
//    }
}