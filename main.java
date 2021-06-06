import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static ArrayList<Playground>playgrounds = new ArrayList<Playground>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<User>Users = new ArrayList<User>();
        boolean exit = false;
        do {
            System.out.println("1- Create New Playground Owner");
            System.out.println("2- Create New Player");
            System.out.println("3- Log in");
            System.out.println("4- Exit");
            int choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        Users.add(new PlaygroundOwner());
                        break;
                    }
                case 2:
                    {
                    Users.add(new Player());
                    break;
                    }
                case 3:
                {
                    if (Users.size()==0)
                        System.out.println("There isn't registered users");
                    else
                    {
                        int Cur=-1;
                        scanner.nextLine();
                        System.out.print("Enter Your Name: ");
                        String name= scanner.nextLine();
                        System.out.print("Enter your Password: ");
                        String password = scanner.nextLine();
                            for (int i=0;i<Users.size();i++)
                            {
                                if (Users.get(i).getName().equals(name))
                                    if (Users.get(i).getPassword().equals(password)) {
                                        System.out.println("Logged in Successfully\n\n");
                                        Cur=i;
                                    }}
                            if (Cur==-1)
                                System.out.println("Wrong Name or Password\n\n");
                            else
                            {
                                Users.get(Cur).displayMenu();
                            }

                    }
                break;}
                case 4:
                {
                    exit=true;
                    break;
                }
                default:{
                    System.out.println("Invalid Input");
                }
            }
        }while (!exit);
    }
}
