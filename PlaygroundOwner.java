import java.util.Scanner;

public class PlaygroundOwner extends User
{
    Scanner scanner=new Scanner(System.in);
    boolean exit = false;
    boolean added=false;
    private Playground playground=new Playground();

    @Override
    public void displayMenu() {
        playground.setPlaygroundOwner(this);
        do {System.out.println("Welcome in Playground Owner's Menu");
        System.out.println("1- Add Playground");
        System.out.println("2- Update Playground Name & Address");
        System.out.println("3- Add New Available Time");
        System.out.println("4- Edit Price of 1 hour");
        System.out.println("5- Show Details of Playground");
        System.out.println("6- Log out");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1: {
                if (added==false) {
                    main.playgrounds.add(playground);
                    System.out.println("Added successfully");
                    added = true;
                }
                else
                {System.out.println("You've added a playground ALREADY!!");
                break;}
            }
            case 2: {
                scanner.nextLine();
                System.out.print("Enter Playground's Name:");
                String name = scanner.nextLine();
                playground.setName(name);
                System.out.print("Enter your Address:");
                String address = scanner.nextLine();
                playground.setAddress(address);
                System.out.println("Name and Address Updated Successfully");
                break;
            }
            case 3: {
                playground.getAvailableTimes().add(new PlayingTime());
                break;
            }
            case 4: {
                System.out.print("Enter Playground's Price per hour: ");
                int temp = scanner.nextInt();
                playground.setPrice(temp);
                break;
            }
            case 5: {
                System.out.println("Playground Owner's Name:"+this.getName());
                System.out.println("Playground's Name:"+playground.getName());
                System.out.println("Playground's Address:"+playground.getAddress());
                System.out.println("Playground's available times:");
                if (1>playground.getAvailableTimes().size())
                    System.out.println("There is no available times");
                else
                {
                    System.out.println("The available times: ");
                    for (int i=0;i<playground.getAvailableTimes().size();i++){
                        System.out.println(">>>>>>>>>"+(i+1)+"<<<<<<<<<");
                        System.out.println("Starts at:" + playground.getAvailableTimes().get(i).getStartTime());
                        System.out.println("Ends at:" + playground.getAvailableTimes().get(i).getEndTime());}}
                System.out.println("Playground's Price:"+playground.getPrice());
                break;
            }
            case 6: {
                exit = true;
                break;
            }
            default:{
                System.out.println("Invalid Input");
            }
        }}while (!exit); }

    public Playground getPlayground() {
        return playground;
    }

    public void setPlayground(Playground playground) {
        this.playground = playground;
    }
}