// WAP to print Duplicates characters from the String.


import java.util.*;
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String: ");
	    String str = sc.nextLine();

	    String duplicates = "";

	    for (int i = 0; i < str.length() - 1; i++) {
	        for (int j = i + 1; j < str.length(); j++)

	        {
	            if (str.charAt(i) == str.charAt(j)) {

	                if (!duplicates.contains(String.valueOf(str.charAt(j)))) {
	                    duplicates += str.charAt(j);
	                    break;
	                }

	            }
	        }
	    }

	    System.out.println(duplicates);
	}

}
