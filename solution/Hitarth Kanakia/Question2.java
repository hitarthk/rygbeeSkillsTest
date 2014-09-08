package hitarthkanakia;

import java.util.Scanner;
/**
 * @author Hitarth
 * Here also we iterate over the loop just once and add if the character is new and
 * then we skip the continuous same characters. The worst case for this algorithm is
 * the string where the there are no consecutive same characters, in which the complexity is precisely
 * 2*n,(n is the length of the string). Else the no. of operations 
 * are less than 2*n because the internal loop takes the same pointer ahead in the string.  
 */
public class Question2 {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans="";
		for(int i=0;i<str.length();)
		{
			char c = str.charAt(i);
			ans+=c;
			while(str.charAt(i)==c)
			{
				i++;
				if(i==str.length())
					break;
			}
		}
		System.out.println(ans);
	}

}
