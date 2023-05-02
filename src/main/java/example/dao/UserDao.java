package example.dao;

import example.model.User;

public interface UserDao {
    User getUserByName(String name);
}
