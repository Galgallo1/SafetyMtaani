package models;

import org.junit.After;
import org.junit.Test;

public class Police<string> {
    private String fights_corruption;
    private string Location;
    private  string Badge_number;
    private int Name;
    private  string Expected;
    private Object Police;

    private Police(String fights_corruption, String location, String badge_number, int name1, String expected) {
        this.fights_corruption = fights_corruption;
        Location = (string) location;
        Badge_number = (string) badge_number;
        Name = name1;
        Expected = (string) expected;
    }

    @Test
    public void checkIfItInstantiatesProperly() {
        Police<String> police = (models.Police<String>) new Police< string>("fights corruption", "Nairobi","271-556", 1,"True");        assertEquals(true, true);  }

    private void assertEquals(boolean b, boolean b1) {
    }



    @Test
    public void getsNameInput() {
        Police<String> police = new Police<>("fights corruption", "Nairobi", "271-556", "Mark", "True");
        assertEquals("Mark", police.getsNameInput()
    }
    @Test
    public void getsAgeInput() {
        Police<String> police = (models.Police<String>) new Police< string>("fights corruption", "Nairobi","271-556", 1,"True");

        assertEquals(23, getsAgeInput()
    }
    @Test
    public void getslocationInput() {
        Police<String> police = (models.Police<String>) new Police<string>("fights corruption", "Nairobi","271-556", 1,"True");

        assertEquals("Nairobi", getsAgeInput()
    }



    @Test
    public void getBadge_numberInput() {
        Police<String>police = (models.Police<String>) new Police <string>("fights corruption", "Nairobi","271-556", 1,"True");

        assertEquals(Boolean.parseBoolean("271-556"), true);
    }



    @After
    public void tearDown() {

    }

    public static void clear() {
    }

    @Test
    public void getsId() {
        Police<String>police = new Police<String>("fights corruption", "Nairobi","271-556", 1,"True");


    }
    public void assertEquals(models.Police id) {
    }

    public static void getId() {
    }

    @Test
    public void allSafetyContains_true() {
        Police  = new Police<>("fights corruption", "Nairobi","271-556", 1,"True");
        Police  = new Police<>("fights corruption", "Nairobi", "271-556","Mark","True");
        assert ((models.Police) Police).getAll() != null;
        assertEquals(true, getAll().
                assertEquals(true, getAll().
    }
    public static Police<String> getAll() {
        return null;

    }

    public void setId(int id) {
    }



}
