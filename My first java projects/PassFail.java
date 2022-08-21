import java.util.Scanner;

public class PassFail {
    
public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter your language marks ");

      int lang = sc.nextInt();

      System.out.println("Enter your literature marks ");

      int lit = sc.nextInt();

      System.out.println("Enter your accounts marks ");

      int acc = sc.nextInt();

      System.out.println("Enter your business studies marks ");

      int bst = sc.nextInt();

      System.out.println("Enter your economic marks ");

      int eco = sc.nextInt();

      int total = lang + lit + acc + bst + eco;

      int per = total / 5;

      System.out.print("Your percentage is ");

      System.out.print(per);

      System.out.println("%");

      int fail = 33;

      if (lang<fail) {
        
        System.out.println("You are fail in language");

      }
      if (lit<fail) {

        System.out.println("You are fail in literature");
        
      }
      if (acc<fail) {

        System.out.println("You are fail in accounts");
        
      }
      if (bst<fail) {

        System.out.println("You are fail in business studies");
        
      }
      if (eco<fail) {

        System.out.println("You are fail in ecconomic");
        
      }

}

}
