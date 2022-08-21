
import java.util.Scanner;

public class password {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your password");

    int enterpass = sc.nextInt();

    int realpass = 12345;
    
    if (enterpass == realpass) {

        System.out.println("Welcome Suraj");

    } 
    else {

        System.out.println("Invalid password!!");
        
    }

}

}

