//Yafei Feng
//debug1

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   
   //print out the proportion remaining for select percentages
   if(x>99){
       return;
   }
   if(x<0){
       return;
   }
   else{
       double p=(1-x/100);
       System.out.println("You entered "+x+"%");
       System.out.printf("The proportion remaining is "+"%5.2f",p);
   }
   }
}

//error report
