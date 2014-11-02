//////////////////////////////////////////
//Yafei Feng
//cse002 hw09
//November 1
//BlockedAgain 

import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){//main method
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); //call the method getInt
allBlocks(m);//call the method allBlocks
}
public static int getInt(){
    int x=0;
    System.out.print("Enter an in int between 1 and 9, inclusive: ");
    
    x=checkRange(checkInt());//call method checkInt and method checkRange
    
    return x;
}
public static int checkInt(){//force the user to enter an int
    int y=0;
    Scanner scan;
    scan=new Scanner(System.in);
        
        if(scan.hasNextInt()){
        int input=scan.nextInt();
        
        y=input;
        }
        else {while(!scan.hasNextInt()){
            scan.next();
            System.out.print("You did not enter an int; try again: ");
             
        }
        
        y=scan.nextInt();
        }
//}
     return y;
}
public static int checkRange(int z){//force the user to enter an int in the range
    
    if(z>=1&&z<=9){
    
        
    }
    else{
         while(z<1||z>9){
        System.out.print("You did not enter an int in [1,9]; try again: ");
        z=checkInt();
    }
}
return z;
}
public static String allBlocks(int m){
    String a="";
    
    for(int d=1;d<=m;d++){
        block(d);//call method block
        line(d);//call method line
        System.out.println();
    }
    return a;
}
public static int block(int d){
    int b=0;

        for(int e=1;e<=d;e++){
            for(int f=1;f<=(9-d);f++){
                System.out.print(" ");
            }
            for(int g=1;g<=(2*d-1);g++){
                System.out.print(d);
            }
            System.out.println();
        }
        
    return b;
}
public static String line(int d){
    String c=" ";
    
    for(int j=1;j<=9-d;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=2*d-1;k++){
        System.out.print("-");
    }
   return c; 
}//end of the line method
}//end of main class
