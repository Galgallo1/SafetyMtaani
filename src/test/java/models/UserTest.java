package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private String pass;
    private String name;
    private String name1;
    private String pass1;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void userInstantiateCorrectly(){
        User user = setUpAssistant();
        assertEquals(true, user instanceof User);
    }

    @Test
    public void getFirstName() {
        User user = setUpAssistant();
        assertEquals("John", user.getFirstName());
    }

    @Test
    public void setFirstName() {
        User user = setUpAssistant();
        user.setFirstName("vivian");
        assertEquals("vivian", user.getFirstName());
    }

    @Test
    public void getLastName() {
        User user = setUpAssistant();
        assertEquals("Doe", user.getLastName());
    }

    @Test
    public void setLastName() {
        User user = setUpAssistant();
        user.setLastName("Michael");
        assertEquals("Michael", user.getLastName());
    }

    @Test
    public void getEmail() {
        User user = setUpAssistant();
        assertEquals("johnDoe@gmail.com", user.getEmail());
    }

    @Test
    public void setEmail() {
        User user = setUpAssistant();
        user.setEmail("johnDoe435@yahoo.com");
        assertEquals("johnDoe435@yahoo.com", user.getEmail());
    }


    @Test
    public void testEquals() {
        User user = setUpAssistant();
        name = user.getFirstName();
        pass = user.getPassword();
        User user1 = setUpAssistant();
        name1 = user1.getFirstName();
        pass1 = user1.getPassword();
        assertTrue(name.equals(name1));
        assertTrue(pass.equals(pass1));
    }

    //helper method
    public User setUpAssistant(){
        return new User("John", "Doe", "johnDoe@gmail.com", 7343549, "@#JavaNinja2k20");
    }
}