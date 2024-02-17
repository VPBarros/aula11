import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class App {
    public static void main(String[] args) throws Exception {
    
        //P.O.O 1ªINICIO
		// fazer programa para ler produtos no stock(quantidades,preço,entrada,saida)
		//Com class do produto [D a cesar o k e de cesar]
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		 
      Produto produto = new Produto();
      System.out.println("Digite o  Produto e data: ");
      System.out.print("Nome: ");
      produto.nome = sc.nextLine();
      System.out.print("Preço: ");
      produto.preco = sc.nextDouble();
      System.out.print("Quantidade do estoque: ");
      produto.quantidade = sc.nextInt();
      
      System.out.println();
      System.out.println("produto data: "+ produto);
      
      System.out.println();
      System.out.print("Insira a quantidade de produtos a serem adicionadas no estoque: ");
      int quantidade = sc.nextInt();
      produto.addProdutos(quantidade);
      
      System.out.println();
      System.out.println("Atualizar data: "+ produto);
      
      System.out.println();
      System.out.print("Insira a quantidade de produtos a serem removidas do estoque: ");
      quantidade = sc.nextInt();
      produto.removerProdutos(quantidade);
		
      System.out.println();
      System.out.println("Atualizar data: "+ produto);
		
		sc.close();
    }
}
