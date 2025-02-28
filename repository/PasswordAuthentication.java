package repository;

import model.User;
import strategy.AuthenticationStrategy;

public class PasswordAuthentication implements AuthenticationStrategy {
    private UserRepository userRepository;

    public PasswordAuthentication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean authenticate(String username, String password){
        User user = userRepository.getUserByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            System.out.println("Login Bem Sucedido");
            return true;
        }
        System.out.println("Usuario ou senha incorretos.");
        return false;
    }
}
