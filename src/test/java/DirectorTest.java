import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("John", "SL747492C", 35000, "Finance", 600000);
    }


    @Test
    public void hasName(){
        assertEquals("John", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("SL747492C", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void checkSalaryRaised(){
        director.raiseSalary(0.05);
        assertEquals(36750, director.getSalary());
    }

    @Test
    public void checkBonus(){
        assertEquals(700, director.payBonus());
    }

    @Test
    public void hasBudget(){
        assertEquals(600000, director.getBudget(), 0.1);
    }

}
