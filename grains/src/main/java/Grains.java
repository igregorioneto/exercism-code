import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square > 64 || square <= 0) {
            throw new java.lang.IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger[] grains = calculationOfGrains();
        return grains[square - 1];
    }

    BigInteger grainsOnBoard() {
        BigInteger[] grains = calculationOfGrains();
        BigInteger totalGrains = (BigInteger.valueOf(2)).pow(grains.length).subtract(BigInteger.ONE);
        return totalGrains;
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
