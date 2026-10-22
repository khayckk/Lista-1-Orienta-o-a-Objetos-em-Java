
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Livro> listaLivros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Livro livro = new Livro();

            System.out.println("Digite o título do seu livro");
            livro.setTitulo(leitor.nextLine()); 
            System.out.println("Digite o autor");
            livro.setAutor(leitor.nextLine());
            System.out.println("Digite o preço");
            livro.setPreco(leitor.nextDouble());

            listaLivros.add(livro);
            leitor.nextLine();
        }

        for(int i = 0; i < listaLivros.size(); i++){
            Livro printLivro = listaLivros.get(i);
            System.out.println("Livro: " + printLivro.getTitulo() + "| Autor: " +printLivro.getAutor() +  " | R$ " + printLivro.getPreco());
        }

    }
}
