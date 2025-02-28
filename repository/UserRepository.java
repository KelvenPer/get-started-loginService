package repository;

import model.User;

public interface UserRepository {
    User getUserByUsername(String username);
}
