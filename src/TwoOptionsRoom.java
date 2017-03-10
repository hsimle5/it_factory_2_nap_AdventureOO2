
public class TwoOptionsRoom implements Room {

    private String welcomeMessage;
    private String optionA;
    private String optionB;
    private Room roomA;
    private Room roomB;



    @Override
    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    //@Override
    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String getOptions() {
        return "A:" + optionA + "\n" + "B:" + optionB;
    }

    @Override
    public Room nextRoom(String response) {
        if (response.startsWith("A")){
            return this.roomA;
        }
        else if (response.startsWith("B")){
            return this.roomB;
        }
        return this;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }



    public Room getRoomA() {
        return roomA;
    }

    public void setRoomA(Room roomA) {
        this.roomA = roomA;
    }

    public Room getRoomB() {
        return roomB;
    }

    public void setRoomB(Room roomB) {
        this.roomB = roomB;
    }
}
