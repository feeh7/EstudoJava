import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Verificador de Triângulo");
        System.out.print("Digite a primeira medida: ");
        double a = sc.nextDouble();

        System.out.print("Digite a segunda medida: ");
        double b = sc.nextDouble();

        System.out.print("Digite a terceira medida: ");
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Isso é claramente um triângulo");
        }
        else {
            System.out.println("NÃO É TRIÂNGULO");
            System.exit(0);
        }

        System.out.println("Agora irei mostrar qual seu tipo de triângulo: ");

        if (a == b && b == c) {
            System.out.println("Equilátero");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("Isósceles");
        }
        else {
            System.out.println("Escaleno");
        }

        }
    }