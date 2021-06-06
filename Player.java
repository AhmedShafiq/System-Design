import java.util.ArrayList;
import java.util.Scanner;

public class Player extends User
{
    Scanner scanner=new Scanner(System.in);
    boolean exit = false;
    @Override
    public void displayMenu(){
        do {System.out.println("Welcome in Player's Menu");
        System.out.println("1- View all Playgrounds");
        System.out.println("2- Book Playground Slot");
        System.out.println("3- Create Team");
        System.out.println("4- Log out");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1:
                {
                    if (1>main.playgrounds.size())
                        System.out.println("There is no playgrounds added");
                    else
                    {
                    System.out.println("All Playgrounds :");
                    for (int i=0;i<main.playgrounds.size();i++)
                    {
                        System.out.println(">>>>>>>>>"+(i+1)+"<<<<<<<<<");
                        System.out.println("Name of Playground : " + main.playgrounds.get(i).getName());
                        System.out.println("Address of Playground : " + main.playgrounds.get(i).getAddress());
                        System.out.println("Price of the hour : " + main.playgrounds.get(i).getPrice());
                        System.out.println("Name of The Owner : " + main.playgrounds.get(i).getPlaygroundOwner());
                    }}
                    break;}
            case 2:
                {
                    if (1>main.playgrounds.size())
                        System.out.println("There is no playgrounds added");
                    else
                    {
                        System.out.println("All Playgrounds :");
                        for (int i=0;i<main.playgrounds.size();i++)
                        {
                            System.out.println(">>>>>>>>>"+(i+1)+"<<<<<<<<<");
                            System.out.println("Name of Playground : " + main.playgrounds.get(i).getName());
                            System.out.println("Address of Playground : " + main.playgrounds.get(i).getAddress());
                            System.out.println("Price of the hour : " + main.playgrounds.get(i).getPrice());
                            System.out.println("Name of The Owner : " + main.playgrounds.get(i).getPlaygroundOwner());
                        }
                        System.out.println("Enter the number of playground you want :");
                        int x = scanner.nextInt();
                        int y=x-1;
                        if (1>main.playgrounds.get(y).getAvailableTimes().size())
                            System.out.println("There is no Times available");
                        else
                        {
                        System.out.println("The available times: ");
                        for (int i=0;i<main.playgrounds.get(y).getAvailableTimes().size();i++){
                        System.out.println(">>>>>>>>>"+(i+1)+"<<<<<<<<<");
                        System.out.println("Starts at:" + main.playgrounds.get(y).getAvailableTimes().get(i).getStartTime());
                        System.out.println("Ends at:" + main.playgrounds.get(y).getAvailableTimes().get(i).getEndTime());
                       if(main.playgrounds.get(y).getAvailableTimes().get(i).getAvailability())
                       {
                           System.out.println("This time is available,Do you want to book it?");
                           System.out.println("1-Yes");
                           System.out.println("2-No");
                           int c=scanner.nextInt();
                           switch (c){
                           case 1:
                           {
                               System.out.println("Booked Successfully");
                               main.playgrounds.get(y).getAvailableTimes().get(i).setAvailability(false);
                               int cash= main.playgrounds.get(y).getAvailableTimes().get(i).getEndTime()-main.playgrounds.get(y).getAvailableTimes().get(i).getStartTime();
                               System.out.println(cash*main.playgrounds.get(i).getPrice()+" EGP will withdrew");
                               break;
                           }
                           case 2:
                               {
                                   System.out.println("This time will still available");
                               }
                               default:{
                                   System.out.println("Invalid Input");
                               }
                           }
                       }
                       else
                           System.out.println("Not available");
                       }
                        }}

                    break;
                }
            case 3:
                {
                    System.out.println("Enter the names of the other 4 players");
                    ArrayList<String>players=new ArrayList<String>();
                    scanner.nextLine();
                    for (int i=0;i<4;i++)
                    {
                        System.out.println("Name of player"+(i+1));
                        String name=scanner.nextLine();
                        players.add(name);
                    }
                    System.out.println("We Sent E-mails for the players");
                    System.out.println("The players :");
                    System.out.println(getName());
                    for (int i=0;i<4;i++)
                    {
                        System.out.println(players.get(i));
                    }
                    players.clear();
                    break;
                }
            case 4:
                {
                    exit = true;
                    break;
                }}}
        while (!exit); }
}

