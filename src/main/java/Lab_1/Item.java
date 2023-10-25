package Lab_1;

public class Item {
    private final String name;
    private final String description;
    public Item(final String name,final String description){
        this.name=name;
        this.description=description;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}
