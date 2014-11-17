/////////////////////////////////////////////
//Yafei Feng
//cse2 hw10
//find duplicates

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){//beging of main method
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){//list the array
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }//end of listArray method
  
  public static boolean hasDups(int num[]){//to check if the input has duplicate
      int i=0;
      int z=0;
      int temp=0;
      int temp3=0;
      for(z=0;z<10;z++){
        
      for(i=(z+1);i<=(9-z);i++){
          temp=num[i];
          temp3=num[z];
          if(temp==temp3){
              return true;
              
          }
      }
      }
      return false;
  }//end of hasDups method
 
  public static boolean exactlyOneDup(int num[]){//to check if the input has exactly has one duplicate
      int e=0;
      int f=0;
      int g=0;
      int temp2=0;
      int temp4=0;
      for(f=0;f<10;f++){
      for(e=(f+1);e<=(9-f);e++){
          temp2=num[e];
          temp4=num[f];
          while(temp2==temp4){
              g++;
              temp4++;
          }
          
      }
      }
      if(g==1){
              return true;
          }
         
      return false;
 

}//end of exactlyOneDup method
}//end of class

