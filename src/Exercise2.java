import java.util.Scanner;

public class Exercise2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
	
		
		int vowels = 0;
		int constant = 0;
		String word = " "; 
		
		System.out.print("Enter a word: ");
		word = scan.next();
		
		for (int i =0; i < word.length(); i++ )
		{
		if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
 			{    
				vowels++;
 			}
		else if (word.charAt(i) >= 'a' && word.charAt(i)<='z');
			{
				constant++;
			}
	    }
		System.out.println("There are " +vowels+ " vowels");    
        System.out.println("There are " +constant+ " consonants");
	}
}