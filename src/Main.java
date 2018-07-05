import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        System.out.println("Please enter some text:");
        String txt = userInput.nextLine();
        array.add(txt);

        for (String it : array) {
            System.out.println(" number of words you entered is: " + it.split("\\s+").length);
        }

    }
}

