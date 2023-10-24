package Lab_1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void ItemTest() {
        Item item = new Item("Rzecz", "Opis");
        assertEquals("Rzecz", item.getName());
        assertEquals("Opis", item.getDescription());
    }
}
