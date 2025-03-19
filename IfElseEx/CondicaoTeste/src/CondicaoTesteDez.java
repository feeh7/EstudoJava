import java.util.Scanner;

public class CondicaoTesteDez {
    public static void main(String[] args) {

        Scanner keyandmouse = new Scanner(System.in);

        System.out.println("Enter your weight and height, and I'll calculate your BMI, man!!!");

        System.out.println("Your weight?");
        int weight = keyandmouse.nextInt();

        System.out.println("Your Height");
        double height = keyandmouse.nextDouble();

        double heightTwo = (height * height);
        double imc = (weight / heightTwo);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        }
        else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        }
        else {
            System.out.println("Obesidade");
        }
    }
}
