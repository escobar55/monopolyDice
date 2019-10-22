import java.util.Random;

public class MonopolyDice {
    public static void main(String [] args){

        Random r = new Random();

        int x = 1 + r.nextInt(6);

        int y = 1 + r.nextInt(6);

        int sum = x + y;

        if ( x != y) {
            System.out.println("User rolls " + x + " & " + y);
            System.out.println("Move " + sum + " spaces and stop");
        }
        else if(x == y) {
            System.out.println("User rolls " + x + " & " + y);
            System.out.println("DOUBLES!");
            System.out.println("Move " + sum + " spaces and roll again getting...");

        }


    }

}
