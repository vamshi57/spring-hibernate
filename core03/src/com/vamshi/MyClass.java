package com.vamshi;
public class MyClass{
	
   public static void main(String[] args) {
	   int [] a= {5,10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
	   System.out.println(CoffeShop.checker(a));	
  }	
}

class CoffeShop{
	public static int FIVE=0;
	public static int TEN=0;
	public static int TEWNTY=0;
	
	
	public static boolean check(int x){
		
		if(x==5) {
			FIVE++;
		    return true;
		}
		if(x==10) {
			if(FIVE>0) {
				FIVE--;
				TEN++;
			 return true;
			}
			else {
			return false;
			}
		}
		if(x==20) {
			if(FIVE>0&&TEN>0) {
				FIVE--;
				TEN--;
				TEWNTY++;
				return true;
			}
			else if(FIVE>=3) {
				FIVE=FIVE-3;
				return true;
			}
			else {
				return false;
			}
		}	
	   return false;	
	}
	
	public static boolean checker(int[] a) {
		boolean checker=false;
		for(int a1:a) {
			   if(!CoffeShop.check(a1)) {
				   checker=false;
				   break;   
			   }
			   checker=true;
		   }
		
		
		return checker;
	}
}
		
	 
	
	


