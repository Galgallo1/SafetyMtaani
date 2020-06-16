package dao;

import models.User;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oUserDao implements UserDao{
    private Sql2o sql2o;

    public Sql2oUserDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(User user) {
        String sql = "INSERT INTO users (firstName, lastName, email, mobile, password) VALUES (:firstName, :lastName, :email, :mobile, :password)";
        try(Connection connection = sql2o.open()){
            int id = (int) connection.createQuery(sql, true)
                    .bind(user)
                    .executeUpdate()
                    .getKey();
            user.setId(id);
        }

    }

    @Override
    public List<Police> getAll() {
        try(Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM users")
                    .executeAndFetch(User.class);
        }
    }
}
