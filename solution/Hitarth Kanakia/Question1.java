package hitarthkanakia;

import java.util.Scanner;
/**
 * 
 * @author Hitarth
 *Here the idea is that we iterate over the the given string twice. In the first iteration
 *we set the flags of the ASCII values that have come to 1. Then, on the second iteration
 *as we iterate through the original string the order is preserved and as soon as a character
 *is added to the answer string the flag is set to zero so it won't be added again. So this
 *runs in linear time; to be precise, the run time is 2*(n) where n is the length of the string
 */
public class Question1 {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int[] arr = new int[125];
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			arr[(int)c]=1;
		}
		
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(arr[(int)c]==1)
			{
				ans+=c;
				arr[(int)c]=0;
			}
		}
		System.out.println(ans);
	}

}
