import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    //Pluralize task
    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return word + "s";
        } else {
            return word;
        }
    }

    //Flipping Coins
    public static void flipNHeads(int number) {
        int counter = 0;
        int headCount = 0;

        while (true) {
            if (Math.random() < 0.5) {
                counter++;
                headCount = 0;
                System.out.println("tail");
            } else {
                headCount++;
                if (headCount == number) {
                    System.out.println("heads");
                    System.out.println("It took " + counter + " flips to flip " + number + " head in a row.");
                    break;
                } else {
                    counter++;
                    System.out.println("heads");
                }
            }
        }
    }

    //Command Line Clock
    public static void clock() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            }
        }, 1000, 1000);
    }

    public static void main(String[] args) {
        //Pluralize task
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println("------------ task 2 -------------");

        //Flipping Coins
        flipNHeads(4);

        System.out.println("------------ task 3 -------------");
        //Command Line Clock
        clock();
    }
}
