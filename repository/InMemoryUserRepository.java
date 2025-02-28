package repository;

import model.User;
import java.util.*;

public class InMemoryUserRepository implements UserRepository {
    private static InMemoryUserRepository instance;
    private List<User> users = new ArrayList<>();

    private InMemoryUserRepository(){
        users.add(new User("admin", "1234"));
        users.add(new User("kelven", "jarvis"));
        users.add(new User("kassya", "2703"));
    }
    static InMemoryUserRepository getInstance(){
        if(instance == null){
            instance = new InMemoryUserRepository();
        }
        return instance;
    }
    @Override
    public User getUserByUsername(String username){
        return users.stream()
                .filter(users -> users.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}
