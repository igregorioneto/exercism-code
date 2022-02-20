import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger[] grains = calculationOfGrains();
        return grains[square - 1];
    }

    BigInteger grainsOnBoard() {
        BigInteger[] grains = calculationOfGrains();
        BigInteger sum = BigInteger.valueOf(1L);

        for (int i = 0; i < grains.length; i++) {
            BigInteger value = grains[i];
            sum.add(value);
        }

        return sum;
    }

    BigInteger[] calculationOfGrains() {
        BigInteger[] grains = new BigInteger[64];

        for(int i = 0; i < grains.length; i++) {
            BigInteger value;

            if(i == 0) {
                grains[0] = BigInteger.valueOf(1L);
            } else {
                value = grains[i - 1];
                grains[i] = value.multiply(BigInteger.valueOf(2L));
            }

        }
        return grains;
    }

}
