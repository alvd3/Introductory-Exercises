import java.util.ArrayList;
import java.util.List;

/**
 * Created by arickdavis on 5/31/16.
 */
public class PrimeFactors {
    public List generate(int input) {
        System.out.println("Prime Factors");
        List factors = new ArrayList();
        if (input%2 ==0){
            factors.add(2);
        }
        for (int i = 3; i < input/2; i++) {
            if (input%i == 0 && i%2 != 0) {
                factors.add(i);
            }

        }
        return factors;
    }
}