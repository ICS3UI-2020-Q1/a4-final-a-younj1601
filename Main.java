import java.util.Scanner;
/**
 *List all of the factors of a positive interger
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //declare interger
    int num;
    //declare and initialize counter
    int counter = 0;

    //force the integer to be positive
    do{
      //get the interger from the user
      System.out.println("Please enter a positive integer to determine its factors:");
      num = input.nextInt();
    }while(num <= 0);
    
    //give info to user
    System.out.println("The factors of " + num + " are:");

    //calculate the factors
    while(counter < num){

      //add one to the counter
      counter = counter + 1;

      //if num can be divided by counter then it is a factor so it prints it
      if(num % counter == 0){
        System.out.println(counter);
      }
    }

    
  }
}
