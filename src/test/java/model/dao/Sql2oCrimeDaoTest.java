package model.dao;

import model.Crime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oCrimeDaoTest {
    private Connection connection;
    private Sql2oCrimeDao crimeDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/database.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        crimeDao = new Sql2oCrimeDao(sql2o);
        connection = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        connection.close();
    }


    @Test
    public void add() {
    Crime crime = setUpAssistant();
    crimeDao.Add(crime);
    assertEquals(1, crimeDao.getAll().size());

    }

    @Test
    public void getAll() {
        Crime crime = setUpAssistant();
        Crime crime1 = setUpAssistant();
        crimeDao.Add(crime);
        crimeDao.Add(crime1);
        assertEquals(2, crimeDao.getAll().size());
    }

    //helper method
    public Crime setUpAssistant(){
        return new Crime("Robbery","Fedha","Ali",070000000);
    }
}