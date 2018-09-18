package multidimensional.mathematics.vector.euclidean;

import multidimensional.mathematics.vector.MDVEctorSpace;
import multidimensional.mathematics.vector.MDVector;
import multidimensional.mathematics.vector.MDVectorFactory;

public class MDEuclideanVectorSpace implements MDVEctorSpace {

    private final MDEuclideanVectorFactory vectorFactory = new MDEuclideanVectorFactory();

    @Override
    public MDVectorFactory getVectorFactory() {
        return vectorFactory;
    }

    static class MDEuclideanVectorFactory implements MDVectorFactory {
        @Override
        public MDVector getZeroVector(int dimension) {
            return new MDZeroVector(dimension);
        }
    }

    static class MDZeroVector implements MDVector {
        final int dimension;

        public MDZeroVector(int dimension) {
            this.dimension = dimension;
        }

        @Override
        public int getDimension() {
            return dimension;
        }

        @Override
        public double getElement(int index) {
            return 0;
        }
    }
}
