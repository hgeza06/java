/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;


public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Users user = new Users();
		
		do{
		System.out.print("Please enter your password: ");
		String pwIn = in.nextLine();
		
		System.out.print("Please verify your password: ");
		String pwVerIn = in.nextLine();
		
		user.setPassword(pwIn);
		user.setPasswordRe(pwVerIn);
		
		if(Arrays.toString(user.password).equals(Arrays.toString(user.passwordRe))){
	        System.out.println("Password successfully has been set!");
	    } else {
	        
	        System.out.println("Passwords do not match! try it again please!");
	    }
	    
		}while(!Arrays.toString(user.password).equals(Arrays.toString(user.passwordRe)));
	/*	
		if(pwtoChar.toString().equals(pwReToChar.toString())){
		    System.out.println("Passwords are correct!");
		} else {
		    System.out.println("Passwords are incorrect!");
		}
	
	
	    System.out.println(user.password + "\n" + user.passwordRe);
	*/
	    
	}
}


class Users{
    String name;
    String idNumber;
    String email;
    char[] password;
    char[] passwordRe;
    
    
    
    public Boolean isVerified(){
        char[] pw = this.password;
        char[] pw1 = this.passwordRe;
        
        String pwToString = pw.toString();
        String pwReToString = pw1.toString();
        
        if(pwToString.equals(pwReToString)){
            return true;
        } else {
            return false;
        }
    }
    
    
    public void setPassword(String password){
        this.password = password.toCharArray();
    }
    
    
    public void setPasswordRe(String passwordRe){
        this.passwordRe = passwordRe.toCharArray();
    }
}




