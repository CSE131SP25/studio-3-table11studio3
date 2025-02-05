package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Up to what number?");
        int n = in.nextInt();
        int number = 1;
        
        
        int[] array = new int[n+1];
        for (int i= 0; i < array.length; i++) {
        	array[i] = number;
        	number++;
        
        }	
        for	(int b=2; b < n; b++) {
        	for (int a = b; a < n ; a = a + b) {
        		array[a] = 0;
        		
        		}
        }
        	
        for (int i= 0; i < array.length; i++) {
        		if (array[i] != 0) {
        			System.out.println(array[i]);
        		}
        }
        }


      
	}



