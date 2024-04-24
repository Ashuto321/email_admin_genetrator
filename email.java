import java.awt.*;
import java.util.*;

public class email{

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String Email;
    private int mailboxcapacity=500;
    private int defaultpasswordlength=10;
    private String alternateEmail;
    private String companySuffix="ashcompany.com";

    //constructor to receive the first and the last name
    public email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        
        //calling a method asking for the department and returning the department
        this.department=setdepartment();
       

        //calls a method to generate password
        this.password=randomPassword(defaultpasswordlength);
        System.out.println("your password is: "+ this.password);

        //combining elements to generate email
        Email=firstName.toLowerCase()+ "." +lastName.toLowerCase()+"@"+department + "." + companySuffix;
    }
    //ask for the department
    private String setdepartment(){
        System.out.print("NEW WORKER: " + firstName +" DEPARTMENT CODES:\n1 FOR SALES\n2 FOR DEVELOPMENT\n3 FOR ACCOUNT\n0 FOR NONE\nENTER THE DEPARTMENT CODE");
        Scanner in =new Scanner(System.in);
        int depchoice=in.nextInt();
        if(depchoice==1){ return "sales"; }
        else if(depchoice==2){return "dev";}
        else if(depchoice==3){return "acc"; }
        else {return "";}
    }
    //generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
        char[] password= new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);
            
        }
        return new String(password);
    }
    //set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxcapacity=capacity;

    }

    //set the alternate email
    public void setAlternateEmail(String altemail){
        this.alternateEmail=altemail;
    }

    //change the password
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity() 
    {
        return mailboxcapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
        }
    public String getpassword() {
        return password;
        }

    public String showinfo(){
        return "DISPLAYNAME: "+firstName+" "+lastName+"\nCOMPANY EMAIL: "+Email+"\nMAILBOX CAPACITY: "+ mailboxcapacity + "mb";
    }


}