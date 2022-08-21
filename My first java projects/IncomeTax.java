import java.util.Scanner;

public class IncomeTax {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income");

        int income = sc.nextInt();

        // Tax 2L - 5%, 10L - 20%, 30L - 30%.

        if (income>=200000 && income<=999999) {
            
            double tax = income * .05;

            double aftertax = income - tax;

            System.out.print("Your income after tax reduced is ");

            System.out.println(aftertax);

        }
        if (income>=1000000 && income<=2999999) {
            
            double tax = income * .020;

            double aftertax = income - tax;

            System.out.print("Your income after tax reduced is ");

            System.out.println(aftertax);

        }
        if (income>3000000) {
            
            double tax = income * .030;

            double aftertax = income - tax;

            System.out.print("Your income after tax reduced is ");

            System.out.println(aftertax);

        }

        
    }
}
