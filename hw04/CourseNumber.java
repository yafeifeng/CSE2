////////////////////////////////////////////////////////////////
//Yafei Feng
//cse02 hw04
//September 18
//identify the course number

import java.util.Scanner;
public class CourseNumber{//public class
    public static void main(String [] args){//public class
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter a six digit number giving the course semester-");
        
        if (myScanner.hasNextInt()){
            int coursenumber=myScanner.nextInt();
            
            if (coursenumber<186510||coursenumber>201440){//wrong situation1
                System.out.println("The number was outside the range [186510,201440]");
                return;//leave the program
                //the program terminates
            }
            if ((coursenumber-(int)(coursenumber/100)*100)==10){//spring semester
                System.out.println("This course was offered in the spring semester of "+(int)(coursenumber/100));
            }
            if ((coursenumber-(int)(coursenumber/100)*100)==20){//summer 1 semester
                System.out.println("This course was offered in the Summer 1 semester of "+(int)(coursenumber/100));
            }
            if ((coursenumber-(int)(coursenumber/100)*100)==30){//summer 2 semester
                System.out.println("This course was offered in the Summer 2 semester of "+(int)(coursenumber/100));
            }
            if ((coursenumber-(int)(coursenumber/100)*100)==40){//fall semester
                System.out.println("This course was offered in the fall semester of "+(int)(coursenumber/100));
            }
            //wrong situation 2
            if ((coursenumber-(int)(coursenumber/100)*100)!=10&&(coursenumber-(int)(coursenumber/100)*100)!=20&&(coursenumber-(int)(coursenumber/100)*100)!=30&&(coursenumber-(int)(coursenumber/100)*100)!=40){
                System.out.println((coursenumber-(int)(coursenumber/100)*100)+" is not a legitimate semester");
            }
        }
        else {System.out.println("You did not enter an integer");
        return;//leave the program
         //the program terminates   
        }
        
    }//end of method
}//end of class