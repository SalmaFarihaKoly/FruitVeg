class Item{
    private String name;
    private String type;
    private double price;
    private int quantity;

    public Item(String name,String type,double price,int quantity){
        this.name=name;
        this.type=type;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

}