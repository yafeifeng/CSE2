///////////////////////////////////////////
//Yafei Feng
//Oct.10
//hw06

import java.util.Scanner;
public class Roulette{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a number from 0 to 37-");
        int number=scan.nextInt();
        int frequency=0;
        //int spin=0;
        int result=0;
        int another=0;
        int bonus=0;
        while(frequency<100000){
            //while(spin<100){
            if((int)(Math.random()*37)==number){//first condition
                result++;
            }
        else{
          another++;  
        
        }
        //spin++;
            //}   
        frequency++;
        }

        bonus=result*36;
        if(result>=3){
        System.out.println("the number of times that you walk away with profit is "+result); 
     }
   else{
         System.out.println("The number of times that you walk away wiht profit is 0" );
     }

     System.out.println("the number of times that you lose everything is "+another);
     
     System.out.println("the number of money you win is "+bonus);
    }//end of method
}//end of class