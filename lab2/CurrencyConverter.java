
public class CurrencyConverter {
    public static double convert(String fromCurrency, double amount, String toCurrency) {
        double convertedAmount = 0.0;

        if (fromCurrency.equals("USD")) {
            if (toCurrency.equals("PKR")) {
                convertedAmount = amount * 236.0;
            } else if (toCurrency.equals("Pound")) {
                convertedAmount = amount * 0.88;
            } else if (toCurrency.equals("Dirham")) {
                convertedAmount = amount * 3.67;
            } else if (toCurrency.equals("INR")) {
                convertedAmount = amount * 79.0;
            } else if (toCurrency.equals("BDT")) {
                convertedAmount = amount * 104.0;
            } else if (toCurrency.equals("JPY")) {
                convertedAmount = amount * 142.0;
            } else if (toCurrency.equals("USD")) {
                convertedAmount = amount; // 1 USD equals 1 USD
            } else {
                throw new IllegalArgumentException("Invalid target currency");
            }
        } else if (fromCurrency.equals("PKR")) {
            // Handle conversions from PKR to other currencies here
            if (toCurrency.equals("USD")) {
                convertedAmount = amount / 236.0;
            } else if (toCurrency.equals("Pound")) {
                convertedAmount = (amount / 236.0) * 0.88;
            } else if (toCurrency.equals("Dirham")) {
                convertedAmount = (amount / 236.0) * 3.67;
            } else if (toCurrency.equals("INR")) {
                convertedAmount = (amount / 236.0) * 79.0;
            } else if (toCurrency.equals("BDT")) {
                convertedAmount = (amount / 236.0) * 104.0;
            } else if (toCurrency.equals("JPY")) {
                convertedAmount = (amount / 236.0) * 142.0;
            } else {
                throw new IllegalArgumentException("Invalid target currency");
            }
        } else {
            throw new IllegalArgumentException("Invalid source currency");
        }

        return convertedAmount;
    }

    public static void main(String[] args) {
        double amountInPKR = Currency.convert("USD", 5, "PKR");
        System.out.println("5 USD in PKR: " + amountInPKR);

        double amountInINR = Currency.convert("PKR", 500, "INR");
        System.out.println("500 PKR in INR: " + amountInINR);

        double amountInPound = Currency.convert("Pound", 5, "PKR");
        System.out.println("5 POUND in PKR: " + amountInPound);
    }
}