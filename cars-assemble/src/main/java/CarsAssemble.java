public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double calc = speed * 221;
        if (speed >= 1 && speed <= 4) {
            return calc;
        } else if (speed >= 5 && speed <= 8 ) {
            return calc * 0.9;
        } else if (speed == 9) {
            return calc * 0.8;
        } else if (speed == 10) {
            return calc * 0.77;
        } else {
            return 0.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        int calc = (int)productionRatePerHour(speed) / 60;
        return calc;
    }
}
