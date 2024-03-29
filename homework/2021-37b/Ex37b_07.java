//
// Juuso Korhonen <juuso.m.korhonen@tuni.fi>
// Tässä tiedostossa tehtävä 7
//

import java.io.Console;
public class Ex37b_07 {
    public static void main(String[] args) {
        Console c = System.console();
        String result = "";
        String name = "";

        System.out.println("Give me some names. I'll ask them until you give me text 'Stop'.");

        do {
            name = c.readLine();
            if (!name.toLowerCase().equals("stop")) {
                if (result.equals("")) {
                    result = name;
                } else {
                    result = result + ", " + name;
                }
                System.out.println("You have given me these names: " + result);
            }
        } while (!name.toLowerCase().equals("stop"));
        
    }
}