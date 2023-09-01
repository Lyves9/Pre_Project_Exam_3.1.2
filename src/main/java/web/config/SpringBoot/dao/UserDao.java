package web.config.SpringBoot.dao;



import web.config.SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(long id);

    void addUser(User user);

    void updateUser(long id, User updateUser);

    void deleteUser(long id);
}
