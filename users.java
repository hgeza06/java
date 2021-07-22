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
		
		String nameIn;
		String idIn;
		String emailIn;
		String pwIn;
		String pwVerIn;
		
		do{
		    System.out.print("Please enter Your name: ");
		    nameIn = in.nextLine();
		    
		    System.out.print("Please enter Your ID card number: ");
		    idIn = in.nextLine();
		    
		    System.out.print("Please enter your email address: ");
		    emailIn = in.nextLine();
		    
    		System.out.print("Please enter your password: ");
    		pwIn = in.nextLine();
    		
    		System.out.print("Please verify your password: ");
    	    pwVerIn = in.nextLine();
    		
    		user.setName(nameIn);
    		user.setIdNumber(idIn);
    		user.setEmail(emailIn);
    		user.setPassword(pwIn);
    		user.setPasswordRe(pwVerIn);
    		
    		if(Arrays.toString(user.getPassword()).equals(Arrays.toString(user.getPasswordRe())) 
    		    && !nameIn.isEmpty() 
    		    && !idIn.isEmpty()
    		    && !emailIn.isEmpty()){
    	        System.out.println("Data successfully has been set!");
    	    } else {
    	        System.out.println("Data do not match or you left something blank! Try again please please!");
    	    }
    	    
		}while(!(Arrays.toString(user.getPassword()).equals(Arrays.toString(user.getPasswordRe())) 
    		    && !nameIn.isEmpty() 
    		    && !idIn.isEmpty()
    		    && !emailIn.isEmpty()
    		    && !pwIn.isEmpty()
    		    && !pwVerIn.isEmpty()));
		
		
		System.out.print("Do you want to print your data(Y - Yes | N - No): ");
		char ans = in.next().charAt(0);
		
		if(ans == 'Y'){
		    System.out.println("Print data...");
		} else if(ans == 'N') {
		     System.out.println("Exiting program...");
		} else {
		    try{
		    System.out.println("You only allowed to type Y or N, the program will quit!");
		    Thread.sleep(600L);
		    System.out.println("...");
		    Thread.sleep(500L);
		    System.out.println("..");
		    Thread.sleep(400L);
		    System.out.println("The program finished!");
		        
		    }catch(InterruptedException e){
		        System.err.println("Error: " + e.getMessage().toString());
		    }
		}
		    
		
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
    private String name;
    private String idNumber;
    private String email;
    private char[] password;
    private char[] passwordRe;
    
    
    
    public Boolean isVerified(char[] pw, char[] pw1){
        pw = this.password;
        pw1 = this.passwordRe;
        
        String pwToString = pw.toString();
        String pwReToString = pw1.toString();
        
        if(pwToString.equals(pwReToString)){
            return true;
        } else {
            return false;
        }
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPassword(String password){
        this.password = password.toCharArray();
    }
    
    
    public void setPasswordRe(String passwordRe){
        this.passwordRe = passwordRe.toCharArray();
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getIdNumber(){
        return this.idNumber;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public char[] getPassword(){
        return this.password;
    }
    
    public char[] getPasswordRe(){
        return this.passwordRe;
    }
}
