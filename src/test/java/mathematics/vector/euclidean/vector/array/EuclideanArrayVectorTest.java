package mathematics.vector.euclidean.vector.array;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import multidimensional.mathematics.vector.MDVector;
import multidimensional.mathematics.vector.euclidean.MDEuclideanVectorSpace;

import static org.junit.Assert.assertEquals;

public class EuclideanArrayVectorTest {
    private static final double DELTA = 1e-5;
    private static final int MAX_DIMENSION = 10;
    private MDVector vector;

    @Given("array vector with dimension zero is created")
    public void arrayVectorWithDimensionZeroIsCreated() {
        this.vector = new MDEuclideanVectorSpace().getVectorFactory().getArrayVector(0);
    }

    @Then("array vector has all elements zero")
    public void arrayVectorHasAllElementsZero() {
        assertEquals(0, vector.getDimension());
        for (int i = 0; i < MAX_DIMENSION; i++) {
            assertEquals(0, vector.getElement(0), DELTA);
        }
    }
}
