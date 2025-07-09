package gustavo.exerciciopoo;

import java.util.Scanner;

public class Livro implements Interface{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    Scanner scanner = new Scanner(System.in);
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("====== DETALHES ======");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("Total de Páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        if (this.isAberto())
        {
            System.out.println("O livro está aberto! ");
        }
        else
        {
            System.out.println("O livro está fechado!");
        }
    }

    @Override
    public void abrir() {
        if (!this.isAberto())
        {
            System.out.println("Abriu o livro!");
            this.setAberto(true);
        }
        else
        {
            System.out.println("O livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto())
        {
            System.out.println("Fechou o livro!");
            this.setAberto(false);
        }
        else
        {
            System.out.println("O livro já está fechado!");
        }
    }

    @Override
    public void folhear() {
        System.out.println("1 - Avançar\n2 - Voltar\nDeseja folhar para qual direção?");
        int option = scanner.nextInt();
        boolean avanca = true;
        switch(option)
        {
            case 1 -> avanca = true;
            case 2 -> avanca = false;
            default -> System.out.println("Opção inválida!");
        }
        System.out.println("Digite quantas páginas deseja folhar: ");
        int paginas = scanner.nextInt();
        if (avanca)
        {
            if (this.getPagAtual() + paginas < this.getTotPaginas())
            {
                System.out.println("Avançando...");
                this.setPagAtual(this.getPagAtual() + paginas);
            }
            else
            {
                System.out.println("Chegou ao final do livro!");
                this.setPagAtual(this.getTotPaginas());
            }
        }
        else
        {
            if (this.getPagAtual() - paginas > 0)
            {
                System.out.println("Voltando...");
                this.setPagAtual(this.getPagAtual() - paginas);
            }
            else
            {
                System.out.println("Chegou ao início do livro!");
                this.setPagAtual(0);
            }
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto())
        {
            if (this.getTotPaginas() > this.getPagAtual())
            {
                System.out.println("Avançou a página!");
                this.setPagAtual(this.getPagAtual() + 1);     
            }
            else
            {
                System.out.println("Você já chegou no final do livro!");
            }
        }
        else
        {
            System.out.println("Abra o livro antes de avançar páginas!");            
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto())
        {
            if (this.getPagAtual() > 0)
            {
                System.out.println("Voltou a página!");
                this.setPagAtual(this.getPagAtual() - 1);     
            }
            else
            {
                System.out.println("Você já está na primeira página do livro!");
            }
        }
        else
        {
            System.out.println("Abra o livro antes de voltar páginas!");            
        }
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
