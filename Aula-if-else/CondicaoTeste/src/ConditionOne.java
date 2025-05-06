import java.util.Scanner;

public class ConditionOne {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Enter a number and say if it is positive or negative: ");
        int number = key.nextInt();

        if (number >= 1) {
            System.out.println("This number is positive and greater than zero");
        }
        else if (number < 0){
            System.out.println("This number is negative");
        }
        else {
            System.out.println("This number is zero");
        }
    }
}
