package service;

import strategy.AuthenticationStrategy;

public class LoginService {
    public AuthenticationStrategy authenticationStrategy;

    public LoginService(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    public boolean login(String username, String password){
        return authenticationStrategy.authenticate(username, password);
    }
}
