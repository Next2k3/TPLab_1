package Lab_1;

import java.util.ArrayList;
import java.util.List;
public class Owner {
    private final String name;
    private final List<Item> ownedItems;

    public Owner(String name){
        this.name=name;
        this.ownedItems = new ArrayList<>();
    }
    public void addOwnedItem(Item item){
        ownedItems.add(item);
    }
    public void printItems(){
        System.out.println("Owned items by "+name+":"); //NOPMD - suppressed SystemPrintln - TODO explain reason for suppression
        for(Item item: ownedItems) {
            System.out.println(item.getName() + " - "+ item.getDescription());
        }
    }
    public String getItems(){
        String items="Owned items by "+name+" : ";
        for(Item item: ownedItems) {
            items+=item.getName() + " - "+ item.getDescription();
        }
        return items;
    }
    public String getName(){
        return name;
    }
}
