/**
 * Created by arickdavis on 5/27/16.
 */
public class Main {
    public static void main(String[] args) {
        TriangleExercises tri = new TriangleExercises();
        tri.easiestExerciseEver();
        System.out.println(tri.horizontalLine(8));
        tri.verticalLine(3);
        tri.rightTriangle(3);

        DiamondExercises dia = new DiamondExercises();
        dia.isoscelesTriangle(11);
        dia.diamond(3);
        dia.diamondName(3);

        FizzBuzz fizz = new FizzBuzz();
        fizz.FizzBuzz();

        PrimeFactors factors = new PrimeFactors();
        System.out.println(factors.generate(30));
    }
}
