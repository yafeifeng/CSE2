/////////////////////////////////////////////
//Yafei Feng
//cse 2
//hw 08
//methods

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");//call method getInt for the first time 
	System.out.println("You entered '"+input+"'");
  System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
  input=getInput(scan,"yYnN",5); //call mehtod getInt for the second time;give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
  
  
  input=getInput(scan,"Choose a digit.","0123456789");//call method getInt for the third time
	System.out.println("You entered '"+input+"'"); 
  }
  public static char getInput(Scanner scan,String c){
      String x2=" ";
      char x='a';
      
      if(scan.hasNext()){
          x2=scan.next();
      while(x2.length()>=1){
           x=x2.charAt(0);
           if(x2.length()==1){
      if(x=='C'||x=='c'){
          //System.out.println("You entered '"+x2+"'");
          break;//leave the loop
      }
      else{
              
              System.out.print("You did not enter a character from the list 'Cc'; try again-");
              x2=scan.next();
          }
          x=x2.charAt(0);
      }
      
          else{
            
              System.out.print("You should enter exactly one character-");
          x2=scan.next();
          
          x=x2.charAt(0);}
      
      }
      }
    
      else{
          while(!scan.hasNext()){
    	scan.nextInt(); //get rid of the junk entered by user
    	System.out.print("You did not enter a character from the list 'Cc'; try again-");
          }
          x2=scan.next();
       
      }
      
      return x;
  }//end of method 1
  public static char getInput(Scanner scan,String d,int number){
    String x3=scan.next();
    char x4=x3.charAt(0);
    int frequnency=0;
    while(frequnency<5){
    if(x4=='y'||x4=='Y'||x4=='N'||x4=='n'){
      
      break;//leave the loop
    }
    else{
      System.out.print("You did not enter a character from the list 'yYnN'; try again-");
      x3=scan.next();
      x4=x3.charAt(0);
    }
    frequnency++;
  }
  if(frequnency>=5){
    System.out.println("You failed after 5 tries");
  }
  return x4;
}//end of method 2
 public static char getInput(Scanner scan, String z,String y){
   String first="a";
   char result=' ';
   
   while(first.length()==1){
   System.out.println("Choose a digit.");
     System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
   if(scan.hasNext()){
     String x5=scan.next();
      char x6=x5.charAt(0);
     
     if(x6=='0'||x6=='1'||x6=='2'||x6=='3'||x6=='4'||x6=='5'||x6=='6'||x6=='7'||x6=='8'||x6=='9'){
       
       first="ab";
       result=x6;
       //System.out.println("You entered '"+result+"'");
       break;
     }
      if(x5.length()>1){
       System.out.println("Enter exactly one character");
       first="a";
     }
     else{
       System.out.println("You did not enter an acceptable character");
       first="a";
     }
   }
   first="a";
   }
   return result;
 }//end of method 3

}//end of class
