/**
 * Created by arickdavis on 5/27/16.
 */
public class DiamondExercises {

    public void isoscelesTriangle(int height) {
        System.out.println("Isosceles Triangle");
        String stars = "*";
        String space = "";
        for (int i = 0; i < height-1; i++) {
            space = space + " ";
        }
        System.out.println(space + stars);

        for (int i = 0; i < height-1 ; i++) {
            space = space.substring(0,space.length()-1);
            stars += "**";
            System.out.println(space + stars);
        }
    }

    public void diamond(int height) {
        System.out.println(" Diamond");
        String stars = "*";
        String space = "";
        for (int i = 0; i < height-1; i++) {
            space = space + " ";
        }
        System.out.println(space + stars);

        for (int i = 0; i < height-1 ; i++) {
            space = space.substring(0,space.length()-1);
            stars += "**";
            System.out.println(space + stars);
        }
        for (int i = 0; i < height-1; i++) {
            stars = stars.substring(0,stars.length()-2);
            space += " ";
            System.out.println(space +stars);
        }
    }

    public void diamondName(int height) {
        System.out.println("Diamond Name");
        String stars = "*";
        String space = "";
        for (int i = 0; i < height-1; i++) {
            space = space + " ";
        }
        System.out.println(space + stars);

        for (int i = 0; i < height-1 ; i++) {
            space = space.substring(0,space.length()-1);
            stars += "**";
            if (i == height-2){
                System.out.println(space + "Arick");
            } else {
                System.out.println(space + stars);
            }
        }

        for (int i = 0; i < height-1; i++) {
            stars = stars.substring(0,stars.length()-2);
            space += " ";
            System.out.println(space + stars);
        }
    }
}
