package Lab_1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ItemOwnershipAppTest {
    @Test
    public void ItemOwnerShipAppTest(){
        Item item = new Item("Rzecz","Opis");
        Owner owner = new Owner("Imie");
        owner.addOwnedItem(item);
        assertEquals("Owned items by Imie : Rzecz - Opis",owner.getItems());
    }
}
