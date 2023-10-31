package CursoJava.EX19;

public class Produto {

    private String name;
    protected Double price;

    public Produto(){
    super();
    }

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String priceTag(){
        return(getName() + " $ " + String.format("%.2f", getPrice()));
    }

}
