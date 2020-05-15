
//Exercitiul 76:
// In this assignment, we will implement a class Menu that holds information about meals
//that are available in a cafeteria.

package mooc.week4;
import java.util.ArrayList;

public class Ex76_Menu {

    private ArrayList<String> meals;

    public Ex76_Menu() {
        this.meals = new ArrayList<String>();
    }

    public static void main(String[] args) {

        Ex76_Menu firstMenu = new Ex76_Menu();
        firstMenu.addMeal("Hamburger");
        firstMenu.addMeal("Fish'n'Chips");
        firstMenu.addMeal("Pizza");
        firstMenu.printMeals(firstMenu);
    }

    public void addMeal (String meal){
        if(!meals.contains(meal) || meal == null)
            meals.add(meal);
    }

    public void printMeals(Ex76_Menu menu){
        System.out.println("The menu is:");
        for (String s : menu.meals) {
            System.out.println(s);
        }
    }
}

