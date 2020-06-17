package dao;

import models.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oUserDaoTest {
    private Connection connection;
    private Sql2oUserDao userDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/database.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        userDao = new Sql2oUserDao(sql2o);
        connection = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        connection.close();
    }

    @Test
    public void add() {
        User user = setUpAssistant();
        userDao.add(user);
        assertEquals(1 , userDao.getAll().size());
    }

    @Test
    public void getAll(){
        User user= setUpAssistant();
        userDao.add(user);
        User user1 = setUpAssistant();
        userDao.add(user1);
        assertEquals(2, userDao.getAll().size());
    }

    @Test
    public void findById(){
        User user = setUpAssistant();
        userDao.add(user);
        User user1 = setUpAssistant();
        userDao.add(user1);
        assertEquals(userDao.findById(user1.getId()), user1);
    }



    //helper method
    public User setUpAssistant(){
        return new User("John", "Doe", "johnDoe@gmail.com", 7343549, "@#JavaNinja2k20");
    }
}