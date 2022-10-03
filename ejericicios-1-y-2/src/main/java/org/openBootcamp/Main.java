package org.openBootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Ej 1
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = (Saludo) applicationContext.getBean("saludo");
        saludo.imprimirSaludo();

        //Ej 2
        UserService servicioDeUsuario = (UserService) applicationContext.getBean("userService");
        servicioDeUsuario.notificationService.imprimirSaludo2();
    }
}