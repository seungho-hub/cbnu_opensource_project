package cbnuopen10.server.controller;

import java.sql.Date;

import cbnuopen10.server.dto.ProjectDTO;
import cbnuopen10.server.entity.ProjectEntity;
import cbnuopen10.server.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("project")
public class ProjectController {

    private final ProjectRepository projectRepository;

    @PostMapping("/create")
    public String createProject(ProjectDTO project) {
        System.out.println(project.toString());

        //1. Dto를 Entity로 변환
        ProjectEntity entity = project.toEntity();
        System.out.println(entity.toString());

        //2. Repository에게 Entity를 DB에 저장하게 함.
        ProjectEntity saved = projectRepository.save(entity);
        System.out.println(saved.toString());

        return "";
    }

    //CREATE TEST
    @PostMapping("v1/Rtest")
    public ProjectEntity signUp() {
        final ProjectEntity product = ProjectEntity.builder()
                .product_name("product_name test")
                .product_url("url test")
                .price(10000000)
                .user_id(0)
                .start_date(Date.valueOf("2022-11-22"))
                .end_date(Date.valueOf("2023-11-22"))
                .receiver_name("HongGilDong")
                .receiver_hp("010-1234-5678")
                .addr("addr test")
                .build();
        return projectRepository.save(product);
    }

    /*Open project create page*/
//    @GetMapping("/project/start")
//    public String start (HttpSession session) {
//        String loginok = (String)session.getAttribute("loginok");
//        if(loginok == null) {
//            return "redirect:/login/main";
//        }
//        return "/project_create/projectStart";
//    }

//    @PostMapping("/project/insert")
//    public String inert(@ModelAttribute ProjectEntity dto,HttpSession session) {
//        String id = (String)session.getAttribute("sessionId");
//        String loginok = (String) session.getAttribute("loginok"); // session check
//        if(loginok == null) {
//            return "redirect:/login/main";
//        }
//        String name = memberMapper.getName(id);
//        dto.setName(name);
//        dto.setId(id);
//        service.insertCategory(dto);
//        return "redirect:editor?idx=" + service.getMAxIdx();
//    }
}