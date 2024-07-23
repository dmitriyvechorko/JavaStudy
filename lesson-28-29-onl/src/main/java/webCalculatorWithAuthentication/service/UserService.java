package webCalculatorWithAuthentication.service;

import webCalculatorWithAuthentication.model.User;
import webCalculatorWithAuthentication.storage.InMemoryUserStorage;

import java.util.Optional;

public class UserService {

    private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();

    public void registration(User user) {
        inMemoryUserStorage.save(user);
    }

    public Optional<User> login(String username, String password) {
        Optional<User> byUsername = inMemoryUserStorage.findByUsername(username);
        if (byUsername.isPresent()) {
            User user = byUsername.get();
            if (user.getPassword().equals(password)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
