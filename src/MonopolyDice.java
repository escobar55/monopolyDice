import java.util.Random;

public class MonopolyDice {
    public static void main(String [] args){

        Random r = new Random();

        int x = 1 + r.nextInt(6);
        int y = 1 + r.nextInt(6);
        int sum = x + y;


        int rolls = 0;
        while(rolls < 3) {
            if (x != y) {
                System.out.println("User rolls " + x + " & " + y);
                System.out.println("Move " + sum + " spaces and stop");
                break;
            }
            else if (x == y ){
                rolls++;
                if (rolls == 3){
                    System.out.println("User rolls " + x + " & " + y);
                    System.out.println("DOUBLES!");
                    System.out.println("GO TO JAIL --->");
                }
                else {
                    System.out.println("User rolls " + x + " & " + y);
                    x = 1 + r.nextInt(6);
                    y = 1 + r.nextInt(6);
                    System.out.println("DOUBLES!");
                    System.out.println("Move " + sum + " spaces and roll again getting...");
                    sum = x + y;
                }
            }


        }



    }

}
