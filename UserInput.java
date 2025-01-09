import java.util.Scanner;

public class UserInput{

     public static void main(String args[])
     {
         Scanner x = new Scanner(System.in);
         Scanner y = new Scanner(System.in);

         String name = x.nextLine();
          System.out.println(name);

         int age = y.nextInt();
          System.out.println(age);

     }
}
