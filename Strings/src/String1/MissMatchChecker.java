package String1;

import java.util.Scanner;

public class MissMatchChecker {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String str1=sc.next();

		System.out.println("Enter the string 2: ");
		String str2=sc.next();
		
		
		if(missmatchChecker(str1,str2)) {
			System.out.println("Only one missmatch");
		}else {
			System.out.println("More tha one miss match");
		}
	}
	
	public static boolean missmatchChecker(String str1, String str2) {
		int missmatch_count=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				missmatch_count++;
				if(missmatch_count>1)
				 return false;
			}
		}
		return missmatch_count==1;
	}
}
