import java.util.Scanner;
public class AlphabetOrNot2 {
   public static void main(String args[]){
      System.out.println("Enter a character:");
      Scanner sc = new Scanner(System.in);
      char c = sc.next().charAt(0);

       String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
    }
}
