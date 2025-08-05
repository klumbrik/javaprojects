package DiceRoller;

import java.util.Random;

public class Die {

    void Roll() {
        Random random = new Random();
        int result = random.nextInt(1, 7);
        System.out.println("You are rolling a die\n");
        System.out.println("The result is: " + result + "\n");

        switch (result) {
            case 1 -> System.out.println("⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬛\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F");
            case 2 -> System.out.println("\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F");
            case 3 -> System.out.println("⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F");
            case 4 -> System.out.println("⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬜\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬜\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F");
            case 5 -> System.out.println("⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬜\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬛\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬜\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F");
            case 6 -> System.out.println("⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬛\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬛\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬛\uFE0F⬛\uFE0F⬛\uFE0F⬜\uFE0F\n" +
                    "⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F⬜\uFE0F");
        }
    }
}
