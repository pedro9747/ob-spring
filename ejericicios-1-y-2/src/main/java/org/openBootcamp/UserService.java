package org.openBootcamp;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    //1. Atributos
    public NotificationService notificationService;
    //2. Constructor
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
