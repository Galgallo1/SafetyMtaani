package dao;

import models.Police;
import models.User;

import java.util.List;

public interface UserDao {

    //add user to Database
    void add(User user);

    //get all users
    List<Police> getAll();

}
