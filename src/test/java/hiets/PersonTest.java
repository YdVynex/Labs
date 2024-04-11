package hiets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.doNothing;

public class PersonTest {
    @Test
    void PersonTest(){
        Person p = new Person();
        p.setname("Jan");
        p.setage(45);
        p.setGender(Gender.MALE);
        Assertions.assertEquals(Gender.MALE, p.getGender());
        p.haveBirthday(); // person gets one year older
        Assertions.assertEquals(46, p.getAge());
        Assertions.assertEquals("All humans are created equal", p.universalRights);
    }


}
