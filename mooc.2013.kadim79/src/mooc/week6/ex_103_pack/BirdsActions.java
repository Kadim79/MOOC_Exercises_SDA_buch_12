package mooc.week6.ex_103_pack;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

class BirdsActions {

    protected static Scanner input = new Scanner(System.in);
    private ArrayList<Bird> birdList = new ArrayList<>();


    public BirdsActions() {
        enterProgram();
    }

    private void enterProgram() {
        System.out.println("\nMenu: 1.Add  2.Observation  3.Statistics  " +
                "4.Show  5.Quit");
        optionMenu();
    }

    private void addBird() {

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Latin name: ");
        String latinName = input.nextLine();
        birdList.add(new Bird(name, latinName));
        enterProgram();
    }

    private void watchBird() {

        System.out.println("What was observed?");
        String s = input.nextLine();
        Bird bird = goToBird(s);
        if (bird != null)
            bird.observation++;
        enterProgram();
    }

    private void showBird() {

        System.out.println("What?");
        String s = input.nextLine();
        Bird bird = goToBird(s);
        System.out.println(bird.toString());
        enterProgram();
    }

    private Bird goToBird(String s) {

        for (Bird bird : birdList) {
            if (bird.name.equalsIgnoreCase(s)) {
                return bird;
            }
        }

        System.out.println("Is not a bird!");
        optionMenu();
        return null;
    }

    private void birdStatistics(ArrayList<Bird> birdList) {

        for (Bird bird : birdList) {
            System.out.println(bird.toString());
        }
        enterProgram();
    }

    private void optionMenu() {

        System.out.print("Please choose a command: ");

        String number = input.nextLine();

        switch (number) {
            case "1":
                addBird();

            case "2":
                watchBird();

            case "3":
                birdStatistics(birdList);

            case "4":
                showBird();

            case "5":
                exit(1);

            default:
                System.out.println("Wrong command! Please try again:");
                optionMenu();
        }
    }
}
