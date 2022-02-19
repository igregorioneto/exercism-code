public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        double multi =  multiplierPerProductsSold(productsSold);
        return multi * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double sum = (1000 * multiplierPerDaysSkipped(daysSkipped)) + bonusForProductSold(productsSold);
        if (sum > 2000) {
            return 2000;
        }
        return sum;
    } 
}
