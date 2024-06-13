public class Banco {
    int conta,saques  = 0;
    String agencia = "";
    String nome_cliente = "";
    float saldo = 0.0f;

    public Banco(int conta, String agencia, String nome_cliente,float saldo_inicial) {
        this.conta = conta;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        saldo = saldo_inicial;
        saques = 0;

    }

    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Conta: "+conta);
        System.out.println("Agencia:" + agencia);
        System.out.println("Nome do cliente: " + nome_cliente);
        System.out.println("Saldo R$: "+saldo);
        System.out.println("Numero de Saques: "+saques);



    }

    public void depositar (float valor){
        if(valor > 0){
            saldo =+ valor;
            System.out.println("Deposito de R$ "+ valor + "realizado com sucesso." );
        } else{
            System.out.println("Valor de deposito invalido");
        }
    }

    public void sacar(float valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            saques ++ ;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
        
    }

    // METODO PRINCIPAL 
    public static void main(String[] args){
        Banco conta = new Banco(1234, "5678-9", "João Silva", 1000.0f);
        conta.extrato();


        conta.depositar(500.0f);
        conta.sacar(200.0f);
        conta.sacar(1500.0f);

        conta.extrato();
    }
        

    
}
