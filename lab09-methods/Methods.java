import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	
	
	Scanner scan=new Scanner(System.in);
	
	int a,b,c;
	a=0;
	b=0;
	c=0;
     
        System.out.println("Enter three int");
        
        
         //System.out.print("Enter an int-");
         
          
          // if(scan.hasNextInt()){
               a=getInt(scan); 
           //System.out.print("Enter an int-");
	        
	         b=getInt(scan);
	      // System.out.print("Enter an int-");
	         c=getInt(scan);
          // }
           
          // else{
               
          //     System.out.print("You did not enter an int;try again-");
               
          
              
         //  }
          
	    
        
        //n++;   
        
	int d=larger(a,b);
	int f=larger(b,c);
	int e=larger(a,f);
	
	
	System.out.println("The larger of "+a+" and "+b+" is "+d);
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+e);
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
	
  }	
	public static int getInt(Scanner scan){
	    
	    int x;
	    //int n=0;
	   // while(n<3){
	    System.out.print("Enter an int- ");    
	    if(scan.hasNextInt()){
	    
	    
	   x=scan.nextInt();
	    //n++;
	    }
	    else{
        while(!scan.hasNextInt()){
    	scan.next(); //get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
    }
    x=scan.nextInt();
    }
    
	    
    return x;
	    
	}
	    
	
	public static int larger(int num1, int num2){
	  int result=0;
	   if(num1>num2){
	       result=num1;
	   } 
	   else{
	       result=num2;
	   }
	   return result;
	}
	
	public static boolean ascending(int j, int k, int l){
	    
	    if(j<k&&k<l){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
  
}