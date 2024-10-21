import java.util.ArrayList;
class Inventory{
    private ArrayList<Item>items;
    public Inventory(){
        items=new ArrayList<>();
    }

   /* public void addItem(Item item){
        items.add(item);
    }*/
    public void addItem(Item newItem) {
        boolean itemExists = false;

        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(newItem.getName())) {
                // Item exists, update the quantity
                item.setQuantity(item.getQuantity() + newItem.getQuantity());
                item.setPrice(item.getPrice()+newItem.getPrice());
                System.out.println(newItem.getQuantity() + " units of " + newItem.getName() + " added. Total Quantity: " + item.getQuantity());
                itemExists = true;
                break;
            }
        }

        if (!itemExists) {
            // Item does not exist, add new item
            items.add(newItem);
            System.out.println(newItem.getName() + " added to the inventory with quantity: " + newItem.getQuantity());
        }
    }

    public void displayItems(){
        if(items.isEmpty()){
            System.out.println("No Item available.");
        }
        else{
            System.out.println("Inventory Item: ");
            for(Item item:items){
                System.out.println("Name: "+item.getName()+", Type: "+item.getType()+", Price: "+item.getPrice()+", Quantity: "+item.getQuantity());
            }
        }
    }

    public void removeItem(String name) {
        boolean found = false;
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                items.remove(item);
                System.out.println("Item '" + name + "' removed from inventory.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item '" + name + "' not found in the inventory.");
        }
    }

    public void displayCategoryWise(String type){
        boolean found=false;
        System.out.println(type+" items");
        for(Item item:items){
            if(item.getType().equalsIgnoreCase(type)){
                System.out.println("Name: "+item.getName()+", Type: "+item.getType()+", Price: "+item.getPrice()+", Quantity: "+item.getQuantity());
            found=true;
            }
        }
        if(!found){
            System.out.println("Item not found");
        }
    }
    

    public boolean searchItem(String name){
        for(Item item:items){
            if(item.getName().equalsIgnoreCase(name)){
               System.out.println("Name: "+item.getName()+", Type: "+item.getType()+", Price: "+item.getPrice()+", Quantity: "+item.getQuantity());
               return true;
            }
        }
        System.out.println(name+" not found ");
        return false;
    }

    public void purchaseItem(String name,int quantity){
        for(Item item:items){
            if(item.getName().equalsIgnoreCase(name)){
                if(item.getQuantity()>=quantity){
                    item.setQuantity(item.getQuantity()-quantity);
                }
                else{
                    System.out.println("not enough "+name);
                }
                return;
            }
        }
        System.out.println("Item not available in inventory");
    }

}