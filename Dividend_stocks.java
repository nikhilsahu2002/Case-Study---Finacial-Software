public class Dividend_stocks extends Stocks {
    private double Dividend ;

    public Dividend_stocks(String symbol, double CurrentPrice,double Dividend) {
        super(symbol,  CurrentPrice,Dividend);
        this.Dividend = Dividend;
    }
    
    @Override
    public double getMarketValue() {

        return super.getMarketValue() + Dividend;
    }

    public void DividendPerShare(double PerDividend) {
        Dividend+= PerDividend * getTotalShare();
    }
}
 