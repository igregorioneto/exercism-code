import java.math.BigInteger;

public class mein {

    public static void main(String argumentos[]){
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


        BigInteger sum = BigInteger.valueOf(0L);

        for (int i = 0; i < grains.length; i++) {
            BigInteger value = grains[i];
            sum = sum.add(value);
            System.out.println(i + " = " +sum);
        }



    }

    BigInteger[] calculationOfGrains() {
        BigInteger[] grains = new BigInteger[64];
        grains[0] = BigInteger.valueOf(1);
        for(int i = 1; i < grains.length; i++) {
            if(grains[i] == BigInteger.ONE) {
                continue;
            } else {
                BigInteger value = grains[i - 1];
                grains[i] = BigInteger.TWO.multiply(value);
            }
        }
        return grains;
    }

}
