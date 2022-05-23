import java.util.Scanner;

public class StringMethodChallenges
	{
		public static void main(String[] args)
			{
				//1
				Scanner input = new Scanner(System.in);
				System.out.println("Type a word in all UPPERCASE and I will correctly punctuate it.");
				String answer = input.nextLine();
				System.out.println(answer.substring(0, 1).toUpperCase() + answer.substring(1).toLowerCase());
				
				//2
				System.out.println("Enter anything and then I will print it all vertically");
				String verticalText = input.nextLine();
				for(int i = 0; i < verticalText.length(); i++)
					//there has to be just a < because it turns into i + 1 do it does equal vertical text already
					{
						System.out.println(verticalText.substring(i, i + 1));
					}
				
				//3
				System.out.println("Enter a word and I will count how many vowels it has");
				String vowelWord = input.nextLine();
				int counter = 0;
				
				for(int i = 0; i < vowelWord.length(); i++)
					{
				switch(vowelWord.substring(i, i + 1))
				{
					case "a":
					case "e":
					case "i":
					case "o":
					case "u":
					case "A":
					case "E":
					case "I":
					case "O":
					case "U":
							{
							counter++;
							break;
							}
				}
					}
				System.out.println("There are " + counter + " vowels in this");
				
				//3 part 2
				System.out.println("Enter a word and I will see if it is a palindrome");
				//have to take the input here because Scanner is a specific type
				String palindrome1 = input.nextLine();
				//this replaces all the spaces,commas, etc with nothing, so they do not count
				palindrome1 = palindrome1.toLowerCase();
				palindrome1 = palindrome1.replaceAll(" ", "");
				palindrome1 = palindrome1.replaceAll(",", "");
				palindrome1 = palindrome1.replaceAll("-", "");
				
				//now create a StringBuffer with the assigned value from above and put it in parenthesis
				StringBuffer palindrome = new StringBuffer(palindrome1); 
				StringBuffer reversed = palindrome.reverse();		
				int counter1 = 0;
				
				//evaluate each individual character
				for(int i = 0; i < reversed.length(); i++)
					{
						//evaluates character at that number
						if(reversed.substring(i, i + 1).equals(palindrome1.substring(i, i + 1)))
							{
								counter1++;
							}
					}
				if(counter1 == reversed.length())
					{
					System.out.println("The String, " + palindrome1 + ", is a palindrome");
					}
				else
					{
						System.out.println("The String, " + palindrome1 + ", is NOT a palindrome");
					}
		
				//#5 but just one word - have not learned arrays
				System.out.println("Enter ONE word and I will say it back to you in Pig Latin");
				String pigLatin = input.nextLine();
				pigLatin = pigLatin.toLowerCase();
				String firstLetter = pigLatin.substring(0, 1);
				System.out.println(pigLatin + " in PigLatin is " + pigLatin.substring(1) + "-" + firstLetter + "ay");
				
			}
	}
