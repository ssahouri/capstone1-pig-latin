import java.util.Scanner;

public class PigLatinTranslatorApp {

	public static void main(String[] args) {
		
		String userContinue;
		
		do {
		
		System.out.println("Welcome to the Pig Latin Translator!");

		 System.out.println("Please enter a word to be translated: ");
	        Scanner sc = new Scanner(System.in);
	        String englishWord = sc.nextLine();

	        System.out.println("The word in PigLatin is: " + pigLatin(englishWord));
	        
	        System.out.println("Continue? (y/n): ");
	        userContinue = sc.next();
	     

	    }while(userContinue.equals("y") || userContinue.equals("Y"));
		
		
		System.out.println("Goodbye!");
		
		
	}

	    public static String pigLatin(String word) {

	        char startLetter = word.charAt(0);
	        if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o'
	                || startLetter == 'u') {
	            word = word.concat("way");

	        } else {
	            String start = "";
	            if (word.charAt(2) == 'r'){
	                start = word.substring(0, 3);
	                word = word.concat(start).concat("ay");
	                word = word.substring(3);
	          
	        }else {
	        	
	        	  if (word.charAt(1) == 'h') {
		                start = word.substring(0, 2);
		                word = word.concat(start).concat("ay");
		                word = word.substring(2);
	        	
	            } else {
	                start = String.valueOf(startLetter);
	                word = word.concat(start).concat("ay");
	                word = word.substring(1);
	            }
		            
	        }
	   
	    

	}
			return word;
	    }

}
