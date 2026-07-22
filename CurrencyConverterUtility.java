class CurrencyConverter {

    static final double USD_TO_INR = 83.50;
    static final double EUR_TO_INR = 91.20;

    static double convertUSD(double usd) {
        return usd * USD_TO_INR;
    }

    static double convertEUR(double eur) {
        return eur * EUR_TO_INR;
    }
}

public class CurrencyConverterUtility {
    public static void main(String[] args) {

        double usd = 100;
        double eur = 50;

        System.out.println("100 USD = Rs. " +
                CurrencyConverter.convertUSD(usd));

        System.out.println("50 EUR = Rs. " +
                CurrencyConverter.convertEUR(eur));
    }
}