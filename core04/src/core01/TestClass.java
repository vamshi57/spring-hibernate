package core01;

import java.math.BigInteger;
import java.util.*;
public class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner c = new Scanner(System.in);
         System.out.println("enter product quantity");
         int n=Integer.parseInt(c.nextLine());
         System.out.println(n);
         System.out.println(" ============================================");
         int f=TestClass.calculate(n);
         
         System.out.println(f);
        
    }
    public static int  calculate(int n){
        Scanner s = new Scanner(System.in);
          int finalPrice= 0;
          for(int k=n;k>0;k--){
             int price=Integer.parseInt(s.nextLine());
             for(int i=2;i<=price;i++){
               if(price%i!=0){
                    finalPrice=finalPrice+(price/i);
                    System.out.println(finalPrice);
                    
                    break;
                    
 
               }
               
            	   

             }
          }
          return finalPrice;
    }
}



