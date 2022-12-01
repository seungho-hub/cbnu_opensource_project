package cbnuopen10.server.data.project;

import org.springframework.context.ApplicationEvent;

public class ProjectEvent {
    private String username;

    public ProjectEvent(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
