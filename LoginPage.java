import java.util.HashMap;
import java.util.Scanner;
public class LoginPage {
    static HashMap<String,String> signupDetails=new HashMap<>();
        public static void signUp(String signupname,String signuppass){
            String namematch="^[a-zA-Z0-9_]{5,15}$";
            String passmatch="^[a-zA-Z0-9@_*%$#]{8,15}$";
            if (signupname.matches(namematch) && signuppass.matches(passmatch)){
                signupDetails.put(signupname, signuppass);
                if(signupDetails.containsKey(signupname)&&signupDetails.get(signupname).equals(signuppass)){
                    System.out.println(signupname+" signed up successfully");
                }
            }
            else{
            System.out.println("Invalid formats entered for username or password");
            }
        }
    public static void loginPage(String username,String password){
            if(signupDetails.containsKey(username) && signupDetails.get(username).equals(password)){
                System.out.println("Welcome "+username+" You have signed in successsfully");
            }
            else{
                System.out.println("Login failed Invalid username or Password");
            }
        }
    public static void datapage(){
        System.out.println("This Data Page consists of IARE wikipedia:");
        System.out.println("""
                           Institute of Aeronautical Engineering (IARE) is a private engineering college in Hyderabad. The college offers post graduate (Masters) and undergraduate (Bachelors) courses in engineering and technology.\r
                           \r
                           The college is located near Indian Air Force Academy, Dundigal in Hyderabad.[1] It was established in 2000. Institute of Aeronautical Engineering is affiliated to Jawaharlal Nehru Technological University, Hyderabad and approved by AICTE.
                           """ //
        );
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter the choice");
        System.out.println("1.for signup \n2.for signIn \n3.to datapage \n4.to exit");
        int n=sc.nextInt();
        switch (n) {
            case 1:
            System.out.println("Create a  Username and Password to SignUp\nThe username must contains 5-15 Characters and the Password must contain 8-15 Characters");
            String signupname=sc.next();
            String signuppass=sc.next();
            signUp(signupname, signuppass);
            break;
            case 2:
            System.out.println("Enter username and password to SignIn");
            sc.nextLine();
            String username=sc.nextLine();
            String password=sc.nextLine();
            loginPage(username, password);
            break;
            case 3:
            datapage();
            break;
            default:
            System.out.println(".......Exiting..........");
            sc.close();
            return;
        }
      } 
    }
}
