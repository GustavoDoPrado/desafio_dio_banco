import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        /*TODO: Conhecer e importar a classe Scanner;
        Exibir as mensagens para o usuário;
        Obter pela Scanner os valores obtidos no terminal;
        Exibir a mensagem */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu número de usuário: ");
        int numero = sc.nextInt();

        System.out.println("Digite o número de sua agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque");
        sc.close();
    }
}
