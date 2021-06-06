import java.util.Scanner;

public class PlayingTime
{
    Scanner scanner=new Scanner(System.in);
    private boolean availability=false;
    private int startTime;
    private int endTime;

    PlayingTime()
    {
        System.out.println("Enter Start Time:");
        startTime = scanner.nextInt();
        System.out.println("Enter End Time:");
        endTime = scanner.nextInt();
        availability=true;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
