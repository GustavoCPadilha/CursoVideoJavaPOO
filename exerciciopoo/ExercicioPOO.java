package gustavo.exerciciopoo;

import java.util.Scanner;

public class ExercicioPOO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Gustavo", 17, 'm');
        Livro livro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry",
                                96, pessoa);
        boolean exit = false;
        
        while (!exit)
        {
            System.out.println("""
                               ====== OPÇÕES ======
                               1 - Abrir
                               2 - Fechar
                               3 - Folhear
                               4 - Avançar página
                               5 - Voltar página
                               6 - Exibir detalhes
                               7 - Fazer aniversário
                               8 - Sair
                               O que deseja fazer com o livro?""");
            int option = scanner.nextInt();
            
            switch(option)
            {
                case 1 -> livro.abrir();
                case 2 -> livro.fechar();
                case 3 -> livro.folhear();
                case 4 -> livro.avancarPag();
                case 5 -> livro.voltarPag();
                case 6 -> livro.detalhes();
                case 7 -> pessoa.fazerAniver();
                case 8 -> exit = true;
                default -> System.out.println("Opção inválida!");
            }
        }
        System.out.println("Saindo...");
    }
}
