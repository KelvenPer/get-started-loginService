package repository;

public class UserRepositoryFactory {
    public static UserRepository createRepository() {
        return InMemoryUserRepository.getInstance();
    }
}
