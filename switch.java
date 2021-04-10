package switchcase;
import java.util.Scanner;


public class switchcase{
    public static void maqin(String[] args){
      int choice;
      System.out.println("pick one : 1.Hi\t2.Hey\t3.hello\t");
      Scanner s = new Scanner(System.in);
      choice = s.nextInt();
      switch(choice)
      {
        case a : System.out.println("you said Hi");
                break;
        case b : System.out.println("you said Hey");
                break;
        case c : System.out.println("you said Hello");
                break;
        default : System.out.println("Invalid choice");
      }
   }
}
