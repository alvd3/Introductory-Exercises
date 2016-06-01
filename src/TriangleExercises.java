/**
 * Created by arickdavis on 5/27/16.
 */
public class TriangleExercises {
    public void easiestExerciseEver() {
        System.out.println("Easiest Exercise Ever");
        System.out.println("*");
    }

    public String horizontalLine(int length) {
        System.out.println("Horizontal Line");
        String stars = "";
        for (int i = 0; i < length ; i++) {
            stars = stars + "*";
        }
        return stars;
    }

    public void verticalLine(int numRows){
        System.out.println("Vertica lLine");
        for (int i = 0; i < numRows ; i++) {
            System.out.println("*");
        }
    }

    public void rightTriangle(int triHight){
        System.out.println("Right Triangle");
        String stars = "";
        for (int i = 0; i < triHight; i++) {
            stars = stars + "*";
            System.out.println(stars);
        }
    }
}
