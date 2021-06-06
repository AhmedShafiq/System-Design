import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String password;
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public User() {
        Registration();
    }

    public void Registration()
    {
        Scanner scanner= new Scanner(System.in);
        VerificationCode VC = new VerificationCode();
        boolean flag;
        System.out.print("Enter Your Name: ");
        String name= scanner.nextLine();
        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();
        do {
            VC.CodeGenerator();
            System.out.println(VC);
            System.out.print("Enter The Verification Code:");
            String UserCode= scanner.nextLine();
            flag = VC.CodeCheck(UserCode);

            if (flag)
                System.out.println("Correct!!");
            else
                System.out.println("Wrong!!");
        } while (!flag);
        System.out.println("Signed up Successfully!!!");
        this.name = name;
        this.password = password;
    }

    public void displayMenu(){}

    @Override
    public String toString() {
        return "name :'" + name + "\n";
    }
}
