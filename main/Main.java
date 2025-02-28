package main;

import service.LoginService;
import config.DependencyInjection;

public class Main {
    public static void main(String[] args) {
        LoginService loginService = DependencyInjection.createLoginService();

        loginService.login("admin", "1234");
        loginService.login("kelven", "jarvis");
        loginService.login("kassya", "2703");
    }
}