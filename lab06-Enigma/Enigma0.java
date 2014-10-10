import java.util.Scanner;
public class Enigma0{
  public static void main(String [] args){
    Scanner scan=new Scanner(System.in);

    System.out.print("Enter an int- ");
    
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      int number=4;
      System.out.println("You entered "+number);
    }
    
    int k=4,p=6,q=7,r=8;
    int n2=(int)n;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n2);
    }
  }
}
