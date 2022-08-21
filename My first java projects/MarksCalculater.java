import java.util.Scanner;
public class MarksCalculater {

public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Enter subject1 marks");

     int marks1 = sc.nextInt();

     System.out.println("Enter subject2 marks");

     int marks2 = sc.nextInt();

     System.out.println("Enter subject3 marks");

     int marks3 = sc.nextInt();

     System.out.println("Enter subject4 marks");

     int marks4 = sc.nextInt();

     int total = marks1 + marks2 + marks3 + marks4;

     int sum = total / 4;
    
     System.out.print("Your exam percantage is ");
     System.out.print(sum);
     System.out.println("%");
     

    }

}