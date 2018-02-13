// HelloWorld.java.  
import java.util.*;

/** Print hello World to terminal window
 */
public class HelloWorld {
    
  //public static void main (String[] args) {

  //  System.out.println ("! This is a simple two lines");
  //  System.out.println("Hello world!!");
   // }

     public int evaluate(String expression)  {
         int sum = 0;
         for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
    
public static void main(String[] args)  {

 HelloWorld hello = new HelloWorld;

      hello.evaluate("1+2");

      }

   
}