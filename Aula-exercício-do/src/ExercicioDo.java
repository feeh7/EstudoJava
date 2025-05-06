import java.util.Scanner;
public class ExercicioDo{
    public static void main (String[] args){
        Scanner scanner  = new Scanner(System.in);

        double saldo = 10.0; //saldo inicial
        int opcao;
        double resposta;

        do {
            System.out.println("-- OPERADORA LEGAL -- ");
            System.out.println("1. Ver Saldo ");
            System.out.println("2. Enviar SMS (R$0,50) ");
            System.out.println("3. Fazer ligação (R$1,20 por minuto)");
            System.out.println("4. Recarregar créditos ");
            System.out.println("0. Sair ");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("\n Seu saldo é R$ %.2f%n",saldo);
                    break;
                case 2:
                    if (saldo >= 0.50){
                        saldo = saldo - 0.50;
                        System.out.println("Msg enviada com sucesso");
                    }
                    else{
                        System.out.println("Saldo Insuficiente para enviar msg");
                    }
                    break;
                case 3:
                    if (saldo >= 1.20){
                        saldo = saldo - 1.20;
                        System.out.println("Msg enviada com sucesso");
                    }

                    break;
                case 4:
                    System.out.println("\n Você escolheu recarregar créditos, quantos creditos você gostaria?");
                    resposta = scanner.nextDouble();
                    saldo = saldo + resposta;
                    break;
                case 0:
                    System.out.println("\n Você escolheu a opcao 0");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);

        scanner.close();
    }
}