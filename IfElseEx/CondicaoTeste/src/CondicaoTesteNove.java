import java.util.Scanner;

public class CondicaoTesteNove {
    public static void main(String[] args) {

        Scanner keyandmouse = new Scanner(System.in);

        System.out.println("Welcome to my store, man! What's the total for your purchases? Today, we have a discount!!! You know what that means, right?");
        System.out.println("Hey, what's the total?: ");
        double total = keyandmouse.nextDouble();

        if (total <= 100) {
            double endValue = (total * 1.05);
            System.out.println("The price is going to be R$"+endValue+" However, before the discount, the price was "+total);
        }
        else if (total >= 101 && total < 500) {
            double endValue = (total * 1.10);
            System.out.println("The price is going to be R$"+endValue+" However, before the discount, the price was "+total);
        }
        else {
            double endValue = (total * 1.15);
            System.out.println("The price is going to be R$"+endValue+" However, before the discount, the price was "+total);
        }
    }
}
