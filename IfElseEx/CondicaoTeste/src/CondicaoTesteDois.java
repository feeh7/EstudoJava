import java.util.Scanner;

public class CondicaoTesteDois {
    public static void main(String[] args) {

        Scanner keyandmouse = new Scanner(System.in);

        System.out.println("Type a number and say if it is odd or even: ");
        int number = keyandmouse.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is odd");
        }
        else {
            System.out.println("This number is even");
        }
    }
}
