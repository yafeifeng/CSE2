///////////////////////////
//Yafei Feng
//September 12
//calculate the distance of the bicycle travelled and the average mile per hour

import java.util.Scanner;
public class Bicycle{
    public static void main(String [] args){
        Scanner input;
        input= new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        int seconds=input.nextInt();
        System.out.print("Enter the number of counts: ");
        int counts=input.nextInt();
        double WheelDiameter=27.0;//assume the diameter of the wheel is 27 inches
        double hours=seconds/3600;//1 hour has 3600 seconds
        double minutes=seconds/60;//1 minute has 60 seconds
        
        double PI=3.14159;//assume PI=3.14159
        double perimeter=PI*WheelDiameter;
        double distance=perimeter*counts/63360;
        //1 mile=63360inches
        int miles=(int)distance;
        int milest=(int)(distance*10)%10;
        int milesh=(int)(distance*100)%10;//where % is the mod operator returns the remainder
         
        
        int AMV=(int)(distance/seconds*3600);
        int AMVt=(int)((distance/seconds*3600)*10)%10;
        int AMVH=(int)((distance/seconds*3600)*100)%10;
        
        
        System.out.println("The distance was "+miles+'.'+milest+milesh+" miles and took "+minutes+" minutes. ");
        System.out.println("The average mph was "+AMV+'.'+AMVt+AMVH);
        

        
    }
}
