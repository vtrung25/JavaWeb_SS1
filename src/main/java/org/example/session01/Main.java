package org.example.session01;
import org.example.config.AppConfig;
import org.example.session01.service.PlaySessionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PlaySessionService service = context.getBean(PlaySessionService.class);
        service.checkBalance("user", 4000);
        service.checkBalance("user", 10000);
        service.checkBalance("", 2000);
        service.checkBalance("user", -2000);
    }
}


