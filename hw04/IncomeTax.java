///////////////////////////////////////////////////////////////
//Yafei Feng
//cse02 hw04 Sept.17
//calculate the income tax

import java.util.Scanner;
public class IncomeTax{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        
        System.out.print("Enter an int giving the number of thousands- ");
        
        
        if (myScanner.hasNextInt()){
            int income=myScanner.nextInt();
            
            if(income<0){//first condition
                System.out.println("You did not enter a positive int ");
                return;//leave the program
                //the program terminates
            }
            if(income<20){//second condition
                double taxrate1=0.05;//declare first tax rate
                double tax1=(int)((taxrate1*income*1000)*10)/10.0;//calculate the tax cost
                System.out.println("The tax rate on $ "+income+"000 is "+(int)((taxrate1*100)*10)/10.0+"% ,"+" and the tax is "+tax1);
            }
            if(income>=20&&income<40){//third condition
                double taxrate2=0.07;//declare second tax rate
                double tax2=(int)((taxrate2*income*1000)*10)/10.0;//calculate the tax cost
                System.out.println("The tax rate on $ "+income+"000 is "+(int)((taxrate2*100)*10)/10.0+"% ,"+" and the tax is "+tax2);
            }
            if(income>=40&&income<78){//fourth condition
                double taxrate3=0.12;//declare third tax rate
                double tax3=(int)((taxrate3*income*1000)*10)/10.0;//calculate the tax rate
                System.out.println("The tax rate on $ "+income+"000 is "+(int)((taxrate3*100)*10)/10.0+"% ,"+" and the tax is "+tax3);
                
            }
            if(income>=78){//fifth condition
                double taxrate4=0.14;//declare fourth tax rate
                double tax4=(int)((taxrate4*income*1000)*10)/10.0;//calculate the tax rate
                System.out.println("The tax rate on $ "+income+"000 is "+(int)((taxrate4*100)*10)/10.0+"% ,"+" and the tax is "+tax4);
                
            }
        }
        else {System.out.println("You did not enter a integer ");
        return;
        //leave the program
        //the program terminates
        }
    }//end of method
}//end of class