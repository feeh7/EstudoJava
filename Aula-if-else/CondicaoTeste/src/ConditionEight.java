import java.util.Scanner;

public class ConditionEight {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Hey, how's it going? Please enter 3 numbers, and I'll tell you if they can form a triangle");

        System.out.println("Type the first number: ");
        int numberOne = key.nextInt();

        System.out.println("Type the second number: ");
        int numberTwo = key.nextInt();

        System.out.println("Type the third number: ");
        int numberThree = key.nextInt();

        if (numberOne + numberTwo > numberThree && numberOne + numberThree > numberTwo && numberTwo + numberThree > numberOne) {
            System.out.println("You can be a triangle");
        }
        else {
            System.out.println("Unfortunately, you cannot be a triangle");
        }

    }
}
