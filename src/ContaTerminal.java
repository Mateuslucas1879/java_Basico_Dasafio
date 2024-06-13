import java.util.Scanner;

public class ContaTerminal {
    int numero, saques = 0;
    String agencia = "";
    String nome_cliente = "";
    float saldo = 0.0f;

   
    public ContaTerminal(int numero, String agencia, String nome_cliente, float saldo_inicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo_inicial;
        this.saques = 0;
    }

    // Método para exibir o extrato
    public void extrato() {
        System.out.println("\tEXTRATO");
        System.out.println("Conta: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Nome do cliente: " + nome_cliente);
        System.out.println("Saldo R$: " + saldo);
        System.out.println("Numero de Saques: " + saques);
    }

    // Método para depositar dinheiro
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            saques++;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Método principal 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nome_cliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo Inicial:");
        float saldo_inicial = Float.parseFloat(scanner.nextLine());

        
        ContaTerminal contaBanco = new ContaTerminal(conta, agencia, nome_cliente, saldo_inicial);

       
        String mensagem = "Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo_inicial + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
