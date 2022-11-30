package cbnuopen10.server.data.project;

import java.sql.Date;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("project")
public class ProjectController {

    private final ProjectRepository projectRepository;

    /* CREATE */
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

    /*Open project create page*/
    @GetMapping("/detail")
    public String showDatail(ProjectDTO project) {


        return "/showdetail";
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