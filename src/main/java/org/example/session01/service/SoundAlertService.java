package org.example.session01.service;
import org.springframework.stereotype.Component;

@Component("sound")
public class SoundAlertService implements AlertService {
    @Override
    public void alert(String message) {
        System.out.println("Phát âm thanh: " + message);
    }
}

