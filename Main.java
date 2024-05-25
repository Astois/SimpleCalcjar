import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstnum = new Scanner(System.in);
        System.out.println("Enter First Number to ADD: ");
        int num1 = firstnum.nextInt();

        Scanner secondnum = new Scanner(System.in);
        System.out.println("Enter Second Number: ");
        int num2 = secondnum.nextInt();

        int result = num1 + num2;
        System.out.println(result);


    }
}