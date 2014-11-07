import java.util.Scanner;

public class rray{
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int[] a=new int[10];
    System.out.println("Please enter 10 ints:");
    for(int i=0;i<10;i++){
       
        int number=scan.nextInt();
        a[i]=number;
    }
    int temp1=a[0];
    for(int i=1;i<10;i++){
        if(temp1<a[i]){
            temp1=a[i];
        }
    }
    System.out.println("The highest entry is:"+temp1);
    
    int temp2=a[0];
    for(int i=1;i<10;i++){
        if(temp2>a[i]){
            temp2=a[i];
        }
    }
    System.out.println("The lowest entry is:"+temp2);
    
    int total=0;
    for(int i=0;i<10;i++){
        total=total+a[i];
    }
    System.out.println("Total is "+total);
    
    int[] b=new int[10];
    for(int i=0;i<10;i++){
        b[i]=a[9-i];
    }
    
    for(int i=0;i<10;i++){
        System.out.println(a[i]+" "+b[i]);
    }
}    

}