package multidimensional.mathematics.vector;

public interface MDVectorFactory {

    MDVector getZeroVector(int dimension);

    MDVector getArrayVector(int dimension, double... values);

}
