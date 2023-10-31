package CursoJava.EX2;

public class Product {

    private String Name;
    private double Price;
    private int Quantity;

    public Product(String name, int quantity, double price) {
        Name = name;
        Price = price;
        Quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public double TotalValueInStock(){
        double Total = Quantity * Price;
        return Total;
    }
    public void AddProducts(int addQuantity){
        Quantity += addQuantity;

    }

    public void RemoveProducts(int delQuantity){
        Quantity -= delQuantity;
    }

    public void Data(){
        System.out.println("Name: " + Name);
        System.out.printf("Price: %.2f\n", Price);
        System.out.println("Quantity: " + Quantity);
    }
}
