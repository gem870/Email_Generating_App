package E_package;

import java.util.Scanner;
import java.util.Timer;

public class Email {
	
	  private String firstName;
	  private String lastName;
	  private String passWord;
	  private String mainPassword;
	  private String department;
	  private String email;
	  private int mailboxCapacity = 500;
	  private int defaultPasswordLength = 10;
	  private String alternateEmail;
	  private String companySulffix = "aeycompany.com";
	  private int contact;
	  private String confirmPassword;
	  
	  
	  Scanner in = new Scanner(System.in);
	  Timer timer = new Timer();
	  
	  
	  public  Email(String firstName, String lastName, int contact){ 
			 this.firstName = firstName;
			 this.lastName = lastName;
			 this.contact = contact;
			 
			 System.out.println();
			 System.out.println("Hi! " + this.firstName + " " + this.lastName + " Please go ahead and create your email");
			 
			 // calling method bellow
			 this.department = setDepartment();
			 
			 in.nextLine();
			 System.out.print("Pls enter your pasword: ");
				this.passWord = in.nextLine();
				System.out.print("Pls enter your confirm pasword: ");
				this.confirmPassword = in.nextLine();
				
				 
				confirmPassword(this.passWord,this.confirmPassword);
			 
		
			 
//			 this.passWord =  RandomPassword(defaultPasswordLength);
			 
			 email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+ department +"."+ companySulffix;

			  
		  }
	  
	  
	  private String setDepartment() {
		  
			 System.out.println();
			 System.out.println();
			 System.out.println("*********** >> Enter the department << ***********");
			 System.out.println("\n\n 1 -----> Sales\n\n 2 -----> Development\n\n 3 -----> Accounting\n\n 0 -----> None\n\n Pls enter number:");
			 
			int departmentNumber = in.nextInt();
			
			switch(departmentNumber) {
			
			case 1: return "Printing Sales";
			case 2: return "Printing Development";
			case 3: return "Printing Accounting";
			case 0: return "Printing None";
			
			
			default: return "############## Invalid Operation ##############";
			
			
			}
		 }
	  
	// Methord for password generator
		private String RandomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
			char[] password = new char[length];
			for(int i = 0; i < length; i++) {
				int rand = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return  new String(password);
			
		}
		
		
		// setters and getters for this section
		
		public void alternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		
		
		public void confirmPassword(String password, String confirm_password) {
			
			
			
			if (password.equals(confirm_password)) {

		    	if(password.length() >= 8) {
		    		this.mainPassword = passWord;
		    		 System.out.println();
		    		 System.out.println("*********** >> YOUR DETAILS...!! << ***********");
		    		 System.out.println();
		    		 System.out.println(showInfor());
			    	 
			    
		    	} else {
		    		System.out.println("--> Your password is less than 8 characters!");
		    		return;
		    	}
		    	 
		    	  
		    } else {
			    	 System.out.println();
			    	 System.out.println("*********** >> Your password do not match..! << *********** \nWill you like the system to generate for you?    <--- "
			    	 		+ "\n 1 ---> Yes No <--- 2");
			    	 int number = nextInt();
			    	 in.nextLine();
			    	 
			    	 switch(number) {
			    	 case 1: this.mainPassword = RandomPassword(10);
			    	 System.out.println();
			    	 System.out.println("*********** >> YOUR DETAILS...!! << ***********");
		    		 System.out.println();
		    		 System.out.println(showInfor());
			   
		    	 break;
		    	 
		    	 case 2: setDepartment(); break;
		    	 default: System.out.println("***** invalid operation ******"); break;
		    	 }
		    	 
		    	
		    }
		    
		}
		
		
		private int nextInt() {
			// TODO Auto-generated method stub
			return 0;
		}


		public void setmailBoxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		
		public void changePassword(String password) {
			this.passWord = password;
		}
		
		public int getMailboxCapacity() {
			return mailboxCapacity;
		}
		
		public  String getAlternateEmail() {
			return alternateEmail;
		}
		
		public  String getPassword() {
			return passWord;
		}
		
		
		// information output method
		public String showInfor() {
			return "Your registration name: " + firstName + " " + lastName + "\n Company email: " + email + "\n Mailbox capacity: " +  mailboxCapacity + " mb\n Contact: " + contact + "\n Your password: " + mainPassword;
		}

}
