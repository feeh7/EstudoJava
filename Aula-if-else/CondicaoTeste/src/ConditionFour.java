import java.util.Scanner;

public class ConditionFour {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Hello type 3 math notes from your last quarter and I will calculate the average!");

        System.out.println("Enter the first note:");
        int note = key.nextInt();

        System.out.println("Enter the second note: ");
        int noteTwo = key.nextInt();

        System.out.println("Enter the third number: ");
        int noteThree = key.nextInt();

        int sum = (note + noteTwo + noteThree);
        int equal = (sum / 3);

        if (sum > 6) {
            System.out.println("Congratulations, your average is "+equal+" and you have been approved!");
        }
        else {
            System.out.println("Wow, your average is "+equal+" and you have failed ");
        }

    }
}
