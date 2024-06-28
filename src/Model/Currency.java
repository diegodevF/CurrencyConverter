package Model;

public class Currency {
    private String primaryCurrency;
    private String secondaryCurrency;
    private double conversion_result;

    public Currency(String primaryCurrency, String secondaryCurrency) {
        this.primaryCurrency = primaryCurrency;
        this.secondaryCurrency = secondaryCurrency;
        this.conversion_result = 0.0;
    }
    public String primaryCurrency() {
        return primaryCurrency;
    }
    public void primaryCurrency(String primaryCurrency) {
        this.primaryCurrency = primaryCurrency;
    }
    public String getsecondaryCurrency() {
        return secondaryCurrency;
    }
    public void setsecondaryCurrency(String secondaryCurrency) {
        this.secondaryCurrency = secondaryCurrency;
    }
    public double getValorAConvertir() {
        return conversion_result;
    }
    public void setValorAConvertir(int currencyValue) {
        this.conversion_result = currencyValue;
    }

    @Override
    public String toString() {
        return "Valor convertido: " + conversion_result;
    }
}

