import java.util.Scanner;

public class ConditionThree {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Enter two numbers and in the end I will say which one is bigger or if they are the same!");

        System.out.println("Enter the first number: ");
        int number = key.nextInt();

        System.out.println("Enter the second number: ");
        int numberTwo = key.nextInt();

        if (number > numberTwo) {
            System.out.println("The first number entered is higher than the second");
        }
        else if (numberTwo > number) {
            System.out.println("The second number entered is higher than the first");
        }
        else {
            System.out.println("The numbers are equal!");
        }
    }
}
