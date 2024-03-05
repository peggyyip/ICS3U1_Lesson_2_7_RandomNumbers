import java.util.Random;

class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // your code goes here
    Random myRandom = new Random();
    
    // generate a random int number and store it in a variable
    // this generates a number between 10 and 30

     int intRandom = myRandom.nextInt(5);

       System.out.println(intRandom);
       
  }
}
