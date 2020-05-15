package mooc.week3;

//Create the method average, which calculates the average of the numbers
//it gets as parameters. Inside the method you should use the method sum as a helper!


public class Ex46_AverageOfNumbers extends Ex0_week3_Auxiliar_Methods{

    static int average;

    public static void main(String[] args) {

        System.out.println("The average of 1,2,3,4 is : "+average(1,2,3,4));

    }

    private static double average(int ... args ){

        return (double)Ex43_SumOfNumbers.sum(args)/args.length;
    }
}
