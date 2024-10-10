package Opg3;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    public int getNumberOfLamps() {
        return numberOfLamps;
    }
    public void setNumberOfLamps(int NumberOfLamps) {
        this.numberOfLamps = NumberOfLamps;
    }
    public int getNumberOfWindows() {
        return numberOfWindows;
    }
    public void setNUmberOfWindows(int NumberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
