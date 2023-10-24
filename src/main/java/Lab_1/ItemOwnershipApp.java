package Lab_1;

public class ItemOwnershipApp {
    public static void main(String[] args){
        Owner owner1 = new Owner("Janusz");
        Owner owner2 = new Owner("Alicja");

        Item item1 = new Item("Komputer","PC");
        Item item2 = new Item("Telefon","Smartfon");

        owner1.addOwnedItem(item1);
        owner2.addOwnedItem(item2);

        owner1.printItems();
        owner2.printItems();
    }
}
