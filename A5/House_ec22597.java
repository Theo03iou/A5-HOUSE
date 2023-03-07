import java.util.Scanner;

public class House_ec22597 extends House {
    public Direction visit(Visitor v, Direction d) {

        v.tell("Wagwan, welcome to POOley, you spot packages waiting by the door and steal them (+5 gold)");
            v.tell("What way would you like to go?");
            v.tell("W, " + "S " + " or E");
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.next();

            if (userChoice.equals("s")) {
                Room theosRoom = new Room_ec22597();
            }

            if (userChoice.equals("s")) {
                Room theosRoom = new Room_ec22597();
            }

            if (userChoice.equals("s")) {
                Room theosRoom = new Room_ec22597();
            }


        // If they are coming from south (exiting my room)
        if (d == d.FROM_NORTH) {
            

        }

        return d;
    }
}
