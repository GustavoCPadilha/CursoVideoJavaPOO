package gustavo.aula05;


public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta('c');
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta('p');
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(350);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
