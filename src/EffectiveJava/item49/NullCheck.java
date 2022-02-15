package EffectiveJava.item49;

import java.math.BigInteger;

public class NullCheck {

    public static void main(String[] args) {
        mod(null);
    }

    /**
     * Returns a BigInteger whose value is (this mod m). This method
     * differs from the remainder method in that it always returns a
     * non-negative BigInteger.
     *
     * @param m the modulus, which must be positive
     * @return this mod m
     * @throws ArithmeticException if m is less than or equal to 0
     */

    //valid kısımları ne kadar önce kasersek o kadar önce tespit etmiş oluruz hataları
    public static BigInteger mod(BigInteger m) {
        if (m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0: " + m);
     // Do the computation
        return m;
    }
}
