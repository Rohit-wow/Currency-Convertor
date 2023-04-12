public class Conversion {
    private final double inrRate = 82.61;
    private final double eurRate = 0.92;
    private final double jpyRate = 133.10;
    private final double usdRate = 0.01217730151;
    private final double eurRateInr = 0.0111594688;
    private final double jpyRateInr = 1.61290322581;

    public double convertInr(int currency, double amount){
        switch (currency){
            case 1:
                return amount * usdRate;
            case 2:
                return amount * eurRateInr;
            case 3:
                return amount * jpyRateInr;
            default:
                return 0.0;
        }
    }
    public double convertUsd(int currency, double amount){
        switch (currency){
            case 1:
                return amount * inrRate;
            case 2:
                return amount * eurRate;
            case 3:
                return amount * jpyRate;
            default:
                return 0.0;
        }
    }
}
