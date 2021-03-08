package com.vamshi;

import java.util.Scanner;
import java.util.TreeSet;

public class NameRecordingSystem {
	


    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.print('T');
        int T=sc.nextInt();
        System.out.println();
        for(int j=1;j<=T;j++){
            int N;
            int K;
            
                for(int i=1;i<=T;i++){
                	System.out.println('N');
                    N=sc.nextInt();
                  System.out.print('K');
                    K=sc.nextInt();
                   
                    TreeSet<String> set=new TreeSet<String>();
                    for(int n=N;n>0;n--) {
                    	
                    	
                    	for(int k=K;k>0;k--) {
                    		String a=new String();
                    		 a=a+sc.nextLine();
                    		 set.add(a);
                    		
                    	}
                    	
                    	
                    }
                   set.stream().forEach(System.out::print);
                    
                }
        
        

    }
}

}
