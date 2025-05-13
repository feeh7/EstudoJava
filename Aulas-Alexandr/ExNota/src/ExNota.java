    import java.util.Scanner;
    public class ExNota {
        public static void main(String[] args) {

            int nota;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Olá digite digite abaixo sua note, se a nota for maior que 7 você será aprovado, entre 5 e 6 recuperação e menor que 5 reprovado!");
            System.out.println("Digite a nota:");
            nota = scanner.nextInt();

            if (nota == 7) {
                System.out.println("Aprovado");
            } else if (nota == 5 || nota == 6) {
                System.out.println("Recuperação");
            } else if (nota >= 1 && nota <= 4) {
                System.out.println("Reprovado");
            } else if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            }
        }
    }