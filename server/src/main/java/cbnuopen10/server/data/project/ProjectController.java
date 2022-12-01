package cbnuopen10.server.data.project;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("")
public class ProjectController {
    private final ProjectService projectService;

    /* CREATE */
//    @PostMapping("/create")
//    public String createProject(ProjectDTO project) {
//
//
//        return "";
//    }

    /*Open project create page*/
//    @GetMapping("/product/detail")
//    public List<ProjectEntity> showDetail(Long id) {
//        return projectService.getUserProject(id);
//    }

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