//////////////////////////////
//Yafei Feng
//cse2 hw04
//September 18
//show the number of days of any month in any year

import java.util.Scanner;
public class Month{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter an int giving the number of the month (1-12)-");
        
        if (myScanner.hasNextInt()){
            int month=myScanner.nextInt();//declare the month
            
            if(month>12){//first condition
                System.out.println("You did not enter an int between 1 and 12");
                return;//leave the program
                //the program terminates
            }
            if (month%2==0&&month!=2){//second condition when month is even but not 2
                System.out.println("The month has 30 days");
            }
            if (month%2!=0){//third condition when month is odd
                System.out.println("The month has 31 days");
            }
            if (month==2){//fourth condition when month is 2
                System.out.print("Enter an int giving the year");
                int year=myScanner.nextInt();//declare the year
                if (year%400==0||(year%4==0&&year%100!=0)){//calculation of the leap year
                    System.out.println("The month has 29 days");
                }
                else {System.out.println("The month has 28 days");}
            }
        }
        else {System.out.println("You did not enter an integer");
        return;//leave the program
        //the program terminates
        }
        
    }//end of method
}//end of class