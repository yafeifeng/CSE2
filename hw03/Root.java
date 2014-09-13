/////////////////////
//Yafei Feng 
//September 10
//hw03 estimate the root of a cube


import java.util.Scanner;
public class Root{
    public static void main(String [] args){
        Scanner input;
        input=new Scanner(System.in);
        
        //input the number which will be calculated
        System.out.print("Enter a double, and i print its cube root- ");
        double cube=input.nextDouble();
        
        //calculate the cube root
        //the first guess is number/3
        double guess1=(cube/3);
        
        //the second guess 
        double guess2=(2*guess1*guess1*guess1+cube)/(3*guess1*guess1);//IG1=improved guess 1
        //the third guess
        double guess3=(2*guess2*guess2*guess2+cube)/(3*guess2*guess2);
        //the fourth guess
        double guess4=(2*guess3*guess3*guess3+cube)/(3*guess3*guess3);
        //the fifth guess
        double guess5=(2*guess4*guess4*guess4+cube)/(3*guess4*guess4);
        //the final guess
        double guess6=(2*guess5*guess5*guess5+cube)/(3*guess5*guess5);
        double estimatecube=guess6*guess6*guess6;
        
        //print out the result
        System.out.println("The cube root is "+guess6+" :");
        System.out.println(guess6+"*"+guess6+"*"+guess6+"="+estimatecube);
    }
}