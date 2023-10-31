package CursoJava.EX20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class EXPedido {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do Cliente: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data de nascimento: ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Digite os dados do pedido: ");
        System.out.print("Status do pedido: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("Quantos itens?: ");
        int n = sc.nextInt();

        Order order = new Order(new Date(), status, client);

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Digite o #" + i + "ª pedido: ");
            System.out.print("Nome do produto: ");
            String prodName = sc.nextLine();
            System.out.print("Preço do produto: ");
            double price = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();

            Product product = new Product(prodName, price);
            OrderItem orderitem = new OrderItem(quantity, price, product);
            order.addItem(orderitem);
        }

        System.out.println("Sumário do pedido: ");
        System.out.println("Horário do pedido: " + sdf2.format(order.getMoment()));
        System.out.println("Status: " + order.getStatus());
        System.out.println(client);
        System.out.println("Order Items: ");
        System.out.println(order);
    }
}
