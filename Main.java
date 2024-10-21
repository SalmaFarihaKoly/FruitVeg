import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        Scanner sc=new Scanner(System.in);
        int choice=0;
        
        while(choice!=7){
            System.out.println("---Inventory Management---");
            System.out.println("1.Add Item");
            System.out.println("2.Display All Items");
            System.out.println("3.Purchase Item");
            System.out.println("4.Category Wise Display Item");
            System.out.println("5.Search Item");
            System.out.println("6.Remove Item");
            System.out.println("7.Exiting....");
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                System.out.println("Enter the Item Name: ");
                String name=sc.nextLine();
                System.out.println("Enter item type(Fruit/vegetable): ");
                String type=sc.nextLine();
                System.out.println("Enter item price: ");
                double price=sc.nextDouble();
                System.out.println("Enter item quantity: ");
                int quantity=sc.nextInt();
                sc.nextLine();

                Item newItem=new Item(name,type,price,quantity);
                inventory.addItem(newItem);
                System.out.println("Item Added Succesfully.");
                break;

                case 2:
                System.out.println("Displaying All Items: ");
                inventory.displayItems();
                break;
                
                case 3:
                System.out.println("Enter the item name you want to purchase: ");
                String itemName=sc.nextLine();
                System.out.println("Enter Quantity: ");
                int purchaseQuantity=sc.nextInt();
                sc.nextLine();
                inventory.purchaseItem(itemName,purchaseQuantity);
                break;

                case 4:
                System.out.println("Enter the Category to display(fruit/vegetable): ");
                String categoryType=sc.nextLine();
                inventory.displayCategoryWise(categoryType);
                break;

                case 5:
                System.out.println("Enter the item to search: ");
                String searchItem=sc.nextLine();
                inventory.searchItem(searchItem);
                break;

                case 6:
                System.out.println("Enter the name of the item to remove: ");
                String removeName = sc.nextLine();
                inventory.removeItem(removeName);
                break;


                case 7:
                System.out.println("Exiting the system.");
                break;
            
                default:
                System.out.println("Invalid Choice.PLease Try Again!");
                break;
            }
        }
        sc.close();

    }
}