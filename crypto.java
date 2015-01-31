/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a = "Dit is een test Echter wil ik ook wel eens kijken of dit werkt haahaahaaa";
		a = a.replace(" ","").toUpperCase();
 		a = a.replace(".","");
		a = a.replace("(","");
		a = a.replace(")","");
		a = a.replace(",","");
		a = a.replace("?","");
		a = a.replace("!","");
		
		for(int k = 0; k < 10; k++){
			a = a.replace(String.valueOf(k), "");
		}
		
		
		char[] charArray = a.toCharArray();
 
		for(int i = 0; i < charArray.length; i++){
			char charInQuestion = charArray[i];
			char charInFront = (char) 0;
			char charBehind = (char) 0;
 
			if(i - 1 >= 0){
				charBehind = charArray[i-1];
			}
 
			if(i + 1 < charArray.length){
				charInFront = charArray[i+1];
			}
 
			if(charInQuestion == charInFront){
				//System.out.println("found "+a);
				char[] b = new char[charArray.length + 1];
				
				for(int j = 0; j < i; j++){
					b[j] = charArray[j];
				}
				//now place x
				
				b[i] = charInQuestion;
				b[i+1] = 'X';
				
				
				for(int y = i+2; y < b.length; y++){
					b[y] = charArray[y-1];
				}
				
				charArray = b;
			}
		}
		
		System.out.println("Dubbele eruit gehaald ; " + String.valueOf(charArray));
		
		if(charArray.length % 2 != 0){
			char[] c = new char[charArray.length + 1];
			
			for(int q = 0; q < charArray.length; q++){
				c[q] = charArray[q];
			}
			
			c[charArray.length] = 'X';
			
			charArray = c;
			
		}
		
		System.out.println("Het verhaal is nu even ; " + String.valueOf(charArray));
		String volleZin = String.valueOf(charArray);
		
		StringBuilder result = new StringBuilder();
		
		int count = 0;
		
		for(int i = 0; i < volleZin.length(); i++){
			count++;
			result.append(volleZin.charAt(i));
			
			if((count % 2) == 0 && count > 0){
				result.append(' ');
				count = 0;
			}
		}
		
		String bigram = result.toString();
		
		System.out.println("Bigram : " + bigram);
		
	}
}
