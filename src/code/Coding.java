package code;

import java.util.Scanner;

public class Coding {
	
	private static final char ABC []= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private static final char abc [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		
		char letter;
		String message;
		String t;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your message");
	    message= sc.nextLine();
	    Scanner bias = new Scanner(System.in);
	    System.out.println("Enter bias");
	    int d = bias.nextInt();
	    Scanner td = new Scanner(System.in);
	    System.out.println("Enter what you wont to do:(code/decode)");
	    t=td.nextLine();
	    
	   switch(t){

	   case "code":
		   for(int i=0; i<message.length(); i++){
		    	letter = message.charAt(i);
		    	if(!code(letter,d,ABC)){
		    		if(!code(letter,d,abc)){
		    			System.out.print(letter);
		    		}
		    	}
		    }	    
	    
	    break;
	   case "decode":
		   for(int i=0; i<message.length(); i++){
		    	letter = message.charAt(i);
		    	if(!decode(letter,d,ABC)){
		    		if(!decode(letter,d,abc)){
		    			System.out.print(letter);
		    		}
		    	}  	
		    }		    
		    break;
		    } 
	   }
	private static boolean code(char letter, int d, char[] abc2) {
		for(int i = 0 ; i < abc2.length; i++) {
			if (abc2[i] == letter) {
				if(i+d<abc2.length){
					System.out.print(abc2[i+d]);
					}
					else{
						System.out.print(abc2[i-abc2.length+d]);
					}
				return true;
			}
		}		
		return false;
	}
	private static boolean decode(char letter, int d, char[] abc2) {
		for(int i = 0 ; i < abc2.length; i++) {
			if (abc2[i] == letter) {
				if(i-d>=0){
				System.out.print(abc2[i-d]);
				}
				else{
					System.out.print(abc2[i-d+abc2.length]);
				}
				return true;
			}		}		
		return false;
	}
}


		   
		  
	
