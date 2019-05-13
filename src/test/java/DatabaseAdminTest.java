import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("James", "ER346782C", 24000);
    }

    @Test
    public void hasName(){
        assertEquals("James", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("ER346782C", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000, databaseAdmin.getSalary());
    }


    @Test
    public void checkSalaryRaised(){
        databaseAdmin.raiseSalary(0.05);
        assertEquals(25200, databaseAdmin.getSalary());
    }

    @Test
    public void checkBonus(){
        assertEquals(240, databaseAdmin.payBonus());
    }
}
