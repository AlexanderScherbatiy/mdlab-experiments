package multidimensional.mathematics.vector.euclidean;

import multidimensional.mathematics.vector.MDVEctorSpace;
import multidimensional.mathematics.vector.MDVector;
import multidimensional.mathematics.vector.MDVectorFactory;

import java.util.Arrays;

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

        @Override
        public MDVector getArrayVector(int dimension, double... values) {
            return new MDArrayVector(dimension, values);
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

    static class MDArrayVector implements MDVector {
        final int dimension;
        final double[] values;

        public MDArrayVector(int dimension, double[] values) {
            this(true, dimension, values);
        }

        public MDArrayVector(boolean copy, int dimension, double... values) {
            this.dimension = dimension;
            this.values = copy ? Arrays.copyOf(values, values.length) : values;
        }

        @Override
        public int getDimension() {
            return dimension;
        }

        @Override
        public double getElement(int index) {
            return index < values.length ? values[index] : 0;
        }
    }

}
