
public class FizzBuzzClass {

	public static String fizzBuzzMethod (int input)
	{
		String output = "";
		String Str = Integer.toString(input);
				
		if (isDiv(input, 3)||isFound(Str, '3'))
			output += "Fizz";
		
		if (isDiv(input, 5)||isFound(Str, '5'))
			output += "Buzz";
		
		if (isDiv(input, 7)||isFound(Str,'7'))
			output += "Woof";
		
					
		//return Integer.toString(input);
		return output.equals("")?Integer.toString(input): output;
	}

	public static boolean isFound(String Str, char c) {
		return Str.indexOf(c)!=-1;
	}	
	public static boolean isDiv(int num, int div)
	{
		return (num%div==0);
	}
}





