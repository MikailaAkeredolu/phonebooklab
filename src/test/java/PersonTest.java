import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getFirstNameTest(){
        //given
        Person person = new Person();
        person.setFirstName("Vanilla Ice");

        //when
        String expected = "Vanilla Ice";
        String actual = person.getFirstName();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setFirstNameTest(){
        //Given
        Person person = new Person("John", "Doe");
        person.setFirstName("David");

        //when
        String expected = "David";

        //Then
        Assert.assertEquals(expected,person.getFirstName());

    }
}
