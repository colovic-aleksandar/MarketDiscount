import java.util.*;
public class Main {
 public static void main(String[] args) {
  PayDesk discount = new PayDesk();
  float a, b;
  String c;

  
  try {
   System.out.println("Input your last month turnover");
   Scanner to = new Scanner(System.in);
   a = to.nextFloat();
   System.out.println("Input your purchase value");
   Scanner pv = new Scanner(System.in);
   
   b = pv.nextFloat();
   System.out.println("Input your discount card");
   Scanner dc = new Scanner(System.in);
   c = dc.nextLine();
   c = c.toLowerCase();

   if (c.equals("bronze")) {
    discount.Bronze(a, b);
   } 
   else if (c.equals("silver")) {
    discount.Silver(a, b);
   } 
   else if (c.equals("gold")) {
    discount.Gold(a, b);
   } 
   else {
    System.out.println("No such card");
   }
  } catch (InputMismatchException e) {
   System.out.println("Put a valid input");

  }

 }
}