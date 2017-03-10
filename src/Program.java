import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) {
        //szoba letrehozas
        Room currentRoom = RoomBuilder.createRooms();
        //ismetles
        while (true){
            //aktualis szoba udvozles
            System.out.println(currentRoom.getWelcomeMessage());

            //opciok kiirasa
            System.out.println(currentRoom.getOptions());

            //valasztas
            String response = readline();

            //altepes uj szobaba
            currentRoom=currentRoom.nextRoom(response);

    }
}

    private static String readline() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
    }
