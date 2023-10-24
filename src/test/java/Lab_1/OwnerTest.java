package Lab_1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class OwnerTest {
    @Test
    public void OwnerNameTest(){
        Owner owner = new Owner("Imie");
        assertEquals("Imie",owner.getName());
    }
}
