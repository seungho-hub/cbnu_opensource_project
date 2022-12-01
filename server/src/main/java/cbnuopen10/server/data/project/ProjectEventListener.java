package cbnuopen10.server.data.project;

//import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
//@Slf4j
public class ProjectEventListener {

    @EventListener
    public void alarm(ProjectEvent event) {
//        log.info("어드민 서비스: {}님이 회원으로 등록되었습니다.", event.getUsername());
        System.out.println("testetstestsetsetsts");
    }
}
