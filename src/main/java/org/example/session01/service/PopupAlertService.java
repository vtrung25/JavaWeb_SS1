package org.example.session01.service;

import org.springframework.stereotype.Component;

@Component("popup")
public class PopupAlertService implements AlertService {
    @Override
    public void alert(String message) {
        System.out.println("Popup: " + message);
    }
}

