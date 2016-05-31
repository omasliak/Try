package code;

import java.util.Scanner;

public class Coding {
	
	

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
	    	if(!searchSmallCode(letter, d)){
	    		if(!searchBigCode(letter, d)){
	    			System.out.print(letter);
	    		}
	    	}
	    }
	    break;
	   case "decode":
		   
		   for(int i=0; i<message.length(); i++){
		    	letter = message.charAt(i);
		    	if(!searchSmallDeCode(letter, d)){
		    		if(!searchBigDeCode(letter, d)){
		    			System.out.print(letter);
		    		}
		    	}
		    }
	    
	   }
	}

	private static boolean searchBigCode(char letter, int d) {
	char ABC []= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		
		for(int i = 0 ; i < ABC.length; i++) {
			if (ABC[i] == letter) {
				if(i+d<ABC.length){
				System.out.print(ABC[i+d]);
				}
				else{
					System.out.print(ABC[i-ABC.length+d]);
				}
				return true;
			}
		}
		return false;
	}

	private static boolean searchSmallCode(char letter, int d) {		
		char abc [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i = 0 ; i < abc.length; i++) {
			if (abc[i] == letter) {
				if(i+d<abc.length){
					System.out.print(abc[i+d]);
					}
					else{
						System.out.print(abc[i-abc.length+d]);
					}
				return true;
			}
		}
		
		return false;
	
	}
	
	
	private static boolean searchBigDeCode(char letter, int d) {
		char ABC []= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			
			
			for(int i = 0 ; i < ABC.length; i++) {
				if (ABC[i] == letter) {
					if(i-d>=0){
					System.out.print(ABC[i-d]);
					}
					else{
						System.out.print(ABC[i-d+ABC.length]);
					}
					return true;
				}
			}
			return false;
		}

		private static boolean searchSmallDeCode(char letter, int d) {		
			char abc [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			for(int i = 0 ; i < abc.length; i++) {
				if (abc[i] == letter) {
					if(i-d>=0){
						System.out.print(abc[i-d]);
						}
						else{
							System.out.print(abc[i-d+abc.length]);
						}
					return true;
				}
			}
			
			return false;
		
		}

}
