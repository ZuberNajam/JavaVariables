/**
 * JavaVariables
 */
import java.util.Scanner;

public class JavaVariables {

    public static void main(String[] args) {
        System.out.println("Welcome to Starlight Systems.");
        System.out.println("\nPlease answer the questions below to get started");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("\nPlease enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("\nPlease enter your age:");
        int age = scanner.nextInt();

        System.out.println("Please enter your budget in US dollars: $");
        double budget = scanner.nextDouble();

        
        scanner.nextLine(); // throwaway nextLine to be wasted on empty space
        System.out.println("\nPlease enter your company name: ");
        String companyName = scanner.nextLine();

        scanner.close();

        System.out.println("Welcome to Starlight Systems " + firstName + " " + lastName + " from " + companyName + "!");
        System.out.println("For our members of age " + age +" with a budget of $" + budget + ", we offer the premium package.");
    }
}