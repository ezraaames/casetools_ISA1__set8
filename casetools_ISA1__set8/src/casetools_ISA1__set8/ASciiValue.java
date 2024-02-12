package casetools_ISA1__set8;

public class ASciiValue {
	public static void main(String[] agrs)
	{
			
		char ch='a';
		int ascii=ch;
		int castAscii=(int)ch;
		System.out.println("The ASCII value of "+ch +"is: " +ascii);
		System.out.println("The ASCII value of "+ch +"is: " +castAscii);
		}
	
	public class VowelConsonat{
		public static void main(String[] agrs) {
			char ch='i';
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
				System.out.println(ch+"is vowel");
			else
				System.out.println(ch+ "is consonant");
		}
		
	}

}
