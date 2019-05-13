import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "SL747492C", 35000, "Finance");
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("SL747492C", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void checkSalaryRaised(){
        manager.raiseSalary(0.05);
        assertEquals(36750, manager.getSalary());
    }

    @Test
    public void checkBonus(){
        assertEquals(350, manager.payBonus());
    }

}
