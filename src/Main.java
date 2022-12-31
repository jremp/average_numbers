import static java.lang.Math.abs;
import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        double[] randomArray = createRandomArray(10, -5, 5);

        System.out.println("Hello World!! It's a nice day out. And it's still nice to be inside.");

        System.out.println("Numbers in the array are ");
        for(double val : randomArray)
            System.out.println(val);

        System.out.println("The average of these numbers is " + average(randomArray));

        System.out.println("Thank you for doing math with me today.");
    }

    private static double average(double[] array){
        double sum = 0;
        for(double value : array){
            sum += value;
        }

        return sum / array.length;
    }

    private static double[] createRandomArray(int size, int minVal, int maxVal){
        double[] a = new double[size];
        for(int i = 0; i < size; i++) a[i] = random() * (abs(minVal) + abs(maxVal)) + minVal;
        return a;
    }
}