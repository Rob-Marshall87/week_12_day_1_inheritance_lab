import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("James", "ER346782C", 24000);
    }

    @Test
    public void hasName(){
        assertEquals("James", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("ER346782C", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000, developer.getSalary());
    }


    @Test
    public void checkSalaryRaised(){
        developer.raiseSalary(0.05);
        assertEquals(25200, developer.getSalary());
    }

    @Test
    public void checkBonus(){
        assertEquals(240, developer.payBonus());
    }

    @Test
    public void checkSalaryCantBeNegative(){
        developer.raiseSalary(-0.05);
        assertEquals(24000, developer.getSalary());
    }

    @Test
    public void canChangeName(){
        developer.setName("Claire");
        assertEquals("Claire", developer.getName());
    }

    @Test
    public void cantChangeNameIfNull(){
        developer.setName(null);
        assertEquals("James", developer.getName());
    }

}
