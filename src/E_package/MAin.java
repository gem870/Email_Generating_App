package E_package;

import java.util.Scanner;

public class MAin {
	
	static Email eml;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name;
		String last_name;
		int contact;
		String password;
		String confirm_password;
		Scanner in = new Scanner(System.in);
		
		System.out.println("****** >> STALF EMAIL GENERATOR << *******");
		System.out.print("Pls enter your first name: ");
		first_name = in.nextLine();
		System.out.print("Pls enter your last name: ");
		last_name = in.nextLine();
		System.out.print("Pls enter your last contact: ");
		contact = in.nextInt();
		
		
		
		
	
		
		 eml = new Email(first_name, last_name, contact);
	}

}
