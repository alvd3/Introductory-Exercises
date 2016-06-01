import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by arickdavis on 5/27/16.
 */
public class TriangleExercisesTest {

    @Test
    public void horizontalLine() throws Exception {
        TriangleExercises triTestObject = new TriangleExercises();
        triTestObject.easiestExerciseEver();
        assertEquals("********", triTestObject.horizontalLine(8));
        assertEquals("", triTestObject.horizontalLine(0));
    }

}