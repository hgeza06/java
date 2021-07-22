import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
 

public class Main{

    static List<Users> userData = new ArrayList<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Users user = new Users();
		
		String fNameIn;
		String lNameIn;
		String idIn;
		String emailIn;
		String pwIn;
		String pwVerIn;
		
		do{
		    System.out.print("Please enter Your first name: ");
		    fNameIn = in.nextLine();
		    
		    System.out.print("Please enter your family name: ");
		    lNameIn = in.nextLine();
		    
		    System.out.print("Please enter Your ID card number: ");
		    idIn = in.nextLine();
		    
		    System.out.print("Please enter your email address: ");
		    emailIn = in.nextLine();
		    
		    System.out.println("The passwords must be at least 6 characters long!");
		    System.out.print("Please enter your password: ");
	            pwIn = in.nextLine();
    		
    		    System.out.print("Please verify your password: ");
    	    	    pwVerIn = in.nextLine();

			user.setFirstName(fNameIn);
			user.setLastName(lNameIn);
			user.setIdNumber(idIn);
			user.setEmail(emailIn);
			user.setPassword(pwIn);
			user.setPasswordRe(pwVerIn);

    		if(Arrays.toString(user.getPassword()).equals(Arrays.toString(user.getPasswordRe())) 
    		    && !fNameIn.isEmpty() 
    		    && !lNameIn.isEmpty()
    		    && !idIn.isEmpty()
    		    && !emailIn.isEmpty()){
    	        
    	        userData.add(new Users(user.getFirstName(), user.getLastName(), user.getIdNumber(), user.getEmail(),
    	                               user.getPassword(), user.getPasswordRe())); //add data to the list
    	                               
    		    System.out.println("\nData successfully has been set!");  
    		        
    		    } else {
    		        
    	        System.out.println("\nData do not match or you left something blank! Try again please!");
    	    }
    	    
		}while(!(Arrays.toString(user.getPassword()).equals(Arrays.toString(user.getPasswordRe())) 
    		    && !fNameIn.isEmpty()
    		    && !lNameIn.isEmpty()
    		    && !idIn.isEmpty()
    		    && !emailIn.isEmpty()
    		    && !pwIn.isEmpty()
    		    && !pwVerIn.isEmpty()));
		
		
		System.out.print("Do you want to print your data(Y - Yes | N - No): ");
		char ans = in.next().charAt(0);
		
		if(ans == 'Y'){
		    System.out.println("");
		    for(Users data : userData){
		        System.out.println("First name: " + data.getFirstName());
		        System.out.println("Last name: " + data.getLastName());
		        System.out.println("ID card number: " + data.getIdNumber());
		        System.out.println("Email: " + data.getEmail());
		        System.out.println("Password: " + data.getPassword());
		        //System.out.println(data.getPasswordRe());
		    }
		    
		} else if(ans == 'N') {
		    try{
		     System.out.println("...");
             Thread.sleep(2000L);
		     System.out.println("Exiting program...");
		    } catch(InterruptedException e) {
		        System.err.println("Error: " + e.getMessage().toString());
		    }
		        
		} else {
		        
    	    try{
    		        
        	    System.out.println("\nYou only allowed to type Y or N, the program will quit!");
    		    Thread.sleep(2000L);
    		    System.out.println("...");
    		    Thread.sleep(1500L);
    		    System.out.println("..");
    		    Thread.sleep(1000L);
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
    private String firstName; // given name
    private String lastName; //family name
    private String idNumber;
    private String email;
    private char[] password;
    private char[] passwordRe;
    
    
    public Users(String firstName,String lastName, String idNumber, String email, char[] password, char[] passwordRe){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.email = email;
        this.password = password;
        this.passwordRe = passwordRe;
    }
    
    public Users(){
        
    }
    
    public Boolean isVerified(char[] pw, char[] pw1){
        pw = this.password;
        pw1 = this.passwordRe;
        
        String pwToString = pw.toString();
        String pwReToString = pw1.toString();
        
        if(pwToString.equals(pwReToString) && pwToString.length() >= 6 && pwReToString.length() >= 6){
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
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
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
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




