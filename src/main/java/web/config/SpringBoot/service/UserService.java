package web.config.SpringBoot.service;



import web.config.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    void addUser(User user);

    void updateUser(long id, User updateUser);

    void deleteUser(long id);
}
