public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(c,4);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+addDigit(c,5));
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        c=join(42,83);
        System.out.println("Join 87, 42, and 83 to get "+join(87, c));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
    }
    public static int addDigit(int x,int y){
        int output=0;
        if(y>=0&&y<=9){
        //for(int one=0;one<=y;one++){
            if(x>=0){
            if((x%10)==x){
                output=y*10+x;
                
                //break;
            }
            else if((x%100)==x){
                output=y*100+x;
                //break;
            }
            else if((x%1000)==x){
                output=y*1000+x;
               // break;
            }
            else if((x%10000)==x){
                output=y*10000+x;
               // break;
            }
            else if((x%100000)==x){
                output=y*100000+x;
            }
            }
            else{
                if((x%10)==x){
                output=y*-10+x; 
                }
                else if((x%100)==x){
                output=y*-100+x;
            }
            }
            x=output;
       // }
        }
        else{
            output=x;
        }
        return output;
    }
    public static int join(int z, int w ){
        int output2=0;
        
            
               if(w%100==w){
                output2=addDigit(z,w)*100+w;
                }
               /*else if(w%1000==w){
                   output2=addDigit(z,w)*1000+w;
               }
               else if(w%10000==w){
                   output2=addDigit(z,w)*10000+w;
               }
               */
               else{
               int r=100;
               while(w%r!=w){
                   r=r*10;
                   
                    output2=addDigit(z,w)*r+w;
               }
               }
        
       
        return output2;
    }
}  
