package model.dao;

import model.Crime;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

public class Sql2oCrimeDao implements CrimeDao{
    private Sql2o sql2o;

    public Sql2oCrimeDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }


    @Override
    public void Add(Crime crime) {
    String sql = "INSERT INTO crimes( crime, location, reportedBy, contact) VALUES( :crime, :location, :reportedBy, :contact)";
    try(Connection con = sql2o.open()){
        con.createQuery(sql)
                .bind(crime)
                .executeUpdate();
    }

    }

    @Override
    public List<Crime> getAll() {
        String sql = "SELECT * FROM crimes";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .executeAndFetch(Crime.class);
        }


    }
}
