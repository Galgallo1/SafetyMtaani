package dao;
import models.User;

import java.util.List;

public class Sql2o implements UserDao, Sql2oPoliceDao {
    private Sql2oPoliceDao Police;

    public Sql2o(Sql2o sql2o){
    }

    @Override
    public void add(Police police) {
        String sql = "INSERT INTO police (firstName, lastName, email, mobile, password) VALUES (:firstName, :lastName, :email, :mobile, :password)";

        PoliceDao connection = new PoliceDao();
        int id = (int) connection.createQuery(sql, true)
                    .bind(Police)
                    .executeUpdate()
                    .getKey();
            police.setId(id);
        }



    private PoliceDao open() {
    }

    @Override
    public void add(User user) {

    }

    @Override
    public List<models.Police> getAll() {
        PoliceDao connection = new PoliceDao();
        return connection.createQuery("SELECT * FROM polices", true)
                    .executeAndFetch(Police.class);
        }
    }

