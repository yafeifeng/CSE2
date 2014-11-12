public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
   System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
   System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double [] x, double [] y){
      double result=0.0;
      double resultb=0.0;
      if(x.length==y.length){
          for(int i=0;i<x.length;i++){
              result=x[i];
              resultb=y[i];
          if(result!=resultb){
              
              break;
          }
          int u=0;
          u+=i;
          if(u>=5){
              return true;
          }
          }
          
      }
      else{
          return false;
      }
      return false;
  }
  
  public static double [] addArrays(double [] a, double [] b){
      double temp=a[0];
      double temp2=b[0];
      double[] tempr=new double[6];
      
      if(a.length==b.length){
      for(int d=0;d<a.length;d++){
          temp=a[d];
          temp2=b[d];
          tempr[d]=temp+temp2;
      }
      }
      if(a.length>b.length){
      int w=b.length;
      while(w<a.length){
          for(int e=0;e<b.length;e++){
              temp=a[e];
              temp2=b[e];
              tempr[e]=temp+temp2;
              
          }
          temp=a[w];
          tempr[w]=temp;
          w++;
          
      }
      }
      return tempr;
  }
  
}
