package dao;

import models.Police;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oPoliceDao implements PoliceDao{
    private Sql2o sql2o;

    public Sql2oPoliceDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(Police police) {
        String sql = "INSERT INTO police (firstName, lastName, email, mobile, policeRegNumber) VALUES (:firstName, :lastName, :email, :mobile, :policeRegNumber)";
        try(Connection connection = sql2o.open()){
            int id = (int) connection.createQuery(sql, true)
                    .bind(police)
                    .executeUpdate()
                    .getKey();
            police.setId(id);
        }

    }

    @Override
    public List<Police> getAll() {
        try(Connection connection = sql2o.open()) {
            return connection.createQuery("SELECT * FROM police")
                    .executeAndFetch(Police.class);
        }
    }
}


