package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
     List<User> getAllUsers();

     void saveUser(User user);

     User getUser(int id);

     void editUser(User user);

     void deleteUser(int id);
}

