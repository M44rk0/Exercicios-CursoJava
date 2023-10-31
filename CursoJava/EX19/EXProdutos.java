package CursoJava.EX19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EXProdutos {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> produtos = new ArrayList<>();

        System.out.println("Digite o número de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            System.out.println("Dados do produto #" + i);
            System.out.println("Comum, usado, ou importado (c/u/i)?: ");
            char c = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Preço: ");
            Double price = sc.nextDouble();
            if(c == 'i'){
                System.out.println("Imposto: ");
                Double customsFee = sc.nextDouble();
                produtos.add(new ProdutoImportado(name, price, customsFee));
            }
            else if(c == 'u'){
                System.out.println("Data de fabricação: (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                produtos.add(new ProdutoUsado(name, price, manufactureDate));
            }
            else{
                produtos.add(new Produto(name, price));
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Produto produto : produtos){
            System.out.println(produto.priceTag());
        }

    }
}
