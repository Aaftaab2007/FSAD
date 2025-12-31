// File: SwitchCaseExample.java
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a grade (A-D): ");
        char grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent! You scored 90 and above.");
                break;
            case 'B':
                System.out.println("Good job! You scored 80-89.");
                break;
            case 'C':
                System.out.println("You passed! You scored 70-79.");
                break;
            case 'D':
                System.out.println("You need to improve! Below 70.");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }
        sc.close();
    }
}