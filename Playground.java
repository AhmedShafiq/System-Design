import java.util.ArrayList;

public class Playground {
    private PlaygroundOwner playgroundOwner;
    private String name;
    private String address;
    private ArrayList<PlayingTime>AvailableTimes = new ArrayList<PlayingTime>();
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<PlayingTime> getAvailableTimes() {
        return AvailableTimes;
    }

    public void setAvailableTimes(ArrayList<PlayingTime> availableTimes) {
        AvailableTimes = availableTimes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PlaygroundOwner getPlaygroundOwner() {
        return playgroundOwner;
    }

    public void setPlaygroundOwner(PlaygroundOwner playgroundOwner) {
        this.playgroundOwner = playgroundOwner;
    }
}
