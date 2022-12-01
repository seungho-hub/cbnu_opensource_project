package cbnuopen10.server.data.project;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
    private final ApplicationEventPublisher publisher;

    public ProjectService(ProjectRepository projectRepository, ApplicationEventPublisher publisher) {
        this.projectRepository = projectRepository;
        this.publisher = publisher;
    }

    public void create(ProjectEntity projectEntity) {

        LocalDateTime now = LocalDateTime.now();
        projectEntity.setStart_date(now);

        projectRepository.save(projectEntity);

        publisher.publishEvent(new ProjectEvent("dg"));
    }
}
