import java.util.Scanner;

public class CondicaoTesteSeis {
    public static void main(String[] args) {

        Scanner keyandmouse = new Scanner(System.in);

        System.out.println("Enter the salary of your company's stage!");
        System.out.println("What is the salary of the Stagium?: ");
        double value = keyandmouse.nextInt();

        if (value < 2000) {
            double endValue = (value * 1.10);
            System.out.println("Promoted for hard work, now his salary is R$"+endValue);
        }
        else {
            double endValue = (value * 1.05);
            System.out.println("The other intern worked harder, but here, take a significant raise. Your salary is now R$"+endValue);
        }

    }
}
