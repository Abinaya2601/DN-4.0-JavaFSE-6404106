
public class Financial {
    public static double getFutureValue(double principal, double rate, int year) {
        if (year == 0) {
            return principal;
        }

        return getFutureValue(principal, rate, year - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialAmount = 1000;  
        double growthRate = 0.08;     
        int totalYears = 5;   

        double result = getFutureValue(initialAmount, growthRate, totalYears);

        System.out.println("Future value after " + totalYears + " years is: $" + String.format("%.2f", result));
    }
}

