package dao;

import models.Police;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oPoliceDaoTest {
    private Connection connection;
    private Sql2oPoliceDao userDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/database.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        userDao = new Sql2oPoliceDao(sql2o);
        connection = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        connection.close();
    }

    @Test
    public void add() {
        Police police = setUpAssistant();
        userDao.add(police);
        assertEquals(1, userDao.getAll().size());
    }



    //helper method
    public Police setUpAssistant(){
        return new Police("John", "Doe", "johnDoe@gmail.com", 7343549, 54789);
    }
}