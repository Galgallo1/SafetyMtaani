package models;


import org.junit.After;
import org.junit.Test;

public class Police<string> {
    private String fights_corruption;
    private string Location;
    private  string Badge_number;
    private  string Name;
    private  string Expected;
    private Object Police;

    private Police(String fights_corruption, string location, string badge_number, string name1, string expected) {
        this.fights_corruption = fights_corruption;
        Location = location;
        Badge_number = badge_number;
        Name = name1;
        Expected = expected;
    }

    @Test
    public void checkIfItInstantiatesProperly() {
        Police<String> police = new Police< string>("fights corruption", "Nairobi","271-556", 1,"True",)
        )
        assertEquals(true, true);    }

    private void assertEquals(boolean b, boolean b1) {
    }


}
    @Test
    public void getsNameInput() {
        Police<String> police = new Police<>("fights corruption", "Nairobi", "271-556", "Mark","True");
        assertEquals("Mark", police.getsNameInput()
    }
    @Test
    public void getsAgeInput() {
        Police<String> police = new Police< string>("fights corruption", "Nairobi","271-556", 1,"True",)

        assertEquals(23, getsAgeInput()
    }
    @Test
    public void getslocationInput() {
        Police<String> police = new Police<string>("fights corruption", "Nairobi","271-556", 1,"True",)

        assertEquals("Nairobi", getsAgeInput()
    }



    @Test
    public void getBadge_numberInput() {
    Police<String>police = new Police <string>("fights corruption", "Nairobi","271-556", 1,"True",)

        assertEquals("271-556",getBadge_numberInput()
    }




@After
    public void tearDown() {

    }

    private static Police clear() {
    }

    @Test
    public void getsId() {
        Police<String>police = new Police <string>("fights corruption", "Nairobi","271-556", 1,"True",)

        assertEquals(getId());
    }

    private void assertEquals(models.Police id) {
    }

    private static Police getId() {
    }

    @Test
    public void allSafetyContains_true() {
        Police  = new Police<>("fights corruption", "Nairobi","271-556", 1,"True",);
                Police  = new Police<>("fights corruption", "Nairobi", "271-556","Mark","True");
        assert ((models.Police) Police).getAll() != null;
        assertEquals(true, getAll().
        assertEquals(true, getAll().
}

    private static Police<String> getAll() {
        return null;

    }

    public void setId(int id) {
    }


