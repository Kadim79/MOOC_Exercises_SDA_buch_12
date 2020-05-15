package mooc.week6;

import java.util.Random;

public class Ex100 {

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky nightSkyTest2 = new NightSky(8, 4);
        nightSkyTest2.print();

        System.out.println("Number of stars: " + nightSkyTest2.starsInLastPrint());
        System.out.println("");

        nightSkyTest2.print();
        System.out.println("Number of stars: " + nightSkyTest2.starsInLastPrint());
    }
}

class NightSky{
    double density;
    int width;
    int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density,20,10);
    }

    public NightSky(int width, int height) {
        this(0.1,width,height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        Random random = new Random();

        for (int i = 0; i < this.width; i++) {
            if(random.nextDouble()<this.density) {
                System.out.print("*");
                starsInLastPrint++;
            }
            else
                System.out.print(" ");
        }
    }

    public void print(){
        starsInLastPrint = 0;
        for (int i = 0; i < this.height ; i++) {
                printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}