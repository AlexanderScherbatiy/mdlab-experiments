package mathematics.vector.euclidean.vector.zero;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import multidimensional.mathematics.vector.MDVector;
import multidimensional.mathematics.vector.euclidean.MDEuclideanVectorSpace;

import static org.junit.Assert.assertEquals;

public class EuclideanZeroVectorTest {


    private static final double DELATA = 1e-5;
    private MDVector zeroVector;


    @Given("zero vector is created")
    public void zero_vector_is_created() {
        this.zeroVector = new MDEuclideanVectorSpace().getVectorFactory().getZeroVector(3);
    }

    @Then("all elements have zero value")
    public void all_elements_have_zero_value() {
        for (int i = 0; i < 5; i++) {
            assertEquals(0, zeroVector.getElement(i), DELATA);
        }
    }
}
