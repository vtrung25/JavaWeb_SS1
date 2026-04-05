package org.example.session01.service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PlaySessionService {
    private final AlertService alertService;
    public PlaySessionService(@Qualifier("sound") AlertService alertService) {
        this.alertService = alertService;
    }

    public void checkBalance(String username, double balance) {

        if (username == null || username.trim().isEmpty()) {
            System.out.println("Lỗi: username không hợp lệ");
            return;
        }

        if (balance < 0) {
            System.out.println("Lỗi: số dư không hợp lệ");
            return;
        }

        if (balance < 5000) {
            alertService.alert("Tài khoản " + username + " sắp hết tiền!");
        } else {
            System.out.println("Tài khoản vẫn đủ tiền");
        }
    }
}

