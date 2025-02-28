package config;

import repository.*;
import service.*;
import strategy.*;

public class DependencyInjection {
    public static LoginService createLoginService() {
        UserRepository userRepository = UserRepositoryFactory.createRepository();
        AuthenticationStrategy strategy = new PasswordAuthentication(userRepository);
        return new LoginService(strategy);
    }
}
