package gustavo.aula05;


public class ContaBanco {
    public int numConta;
    protected char tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public void estadoAtual()
    {
        System.out.println("------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(char t)
    {
        //conta corrente 50 poupança 150
        setTipo(t);
        setStatus(true);
        
        if (t == 'c')
        {
            this.setSaldo(50);
        }
        else if (t == 'p')
        {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");

    }
    
    public void fecharConta()
    {
        //nao pode ter dinheiro nem devendo
        if (this.getSaldo() != 0)
        {
            System.out.println("Você só pode fechar a conta se o saldo for igual 0!");
        }
        else
        {
            this.status = false;
        }
    }
    
    public void depositar(float d)
    {
        //status tem q ta verdadeiro
        if (this.isStatus() == true)
        {
            this.setSaldo(getSaldo() + d);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else
        {
            System.out.println("Você precisa abrir a conta primeiro!");
        }
    }
    
    public void sacar(float s)
    {
        //status verdadeiro e tem que ter saldo
        if (this.status == true && this.saldo >= s)
        {
            System.out.println("Saque realizado na conta de " + this.getDono());
            this.setSaldo(getSaldo() - s);
        }
        else
        {
            System.out.println("Não é possível realizar esse saque!");
        }
    }
    
    public void pagarMensal()
    {
        //tira do saldo conta corrente 12 poupanca 20
        if (this.getTipo() == 'c' && this.isStatus() == true)
        {
            this.saldo -= 12;
        }
        else if (this.getTipo() == 'p' && this.isStatus() == true)
        {
            this.saldo -= 20;
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
