public class Stocks extends ShareAssets {

    private double TotalShare;

    public Stocks(String symbol, double CurrentPrice,double TotalShare) {
        super(symbol, CurrentPrice, TotalShare);
        this.TotalShare=TotalShare;
    }
    @Override
    public double getMarketValue() {
        return getCurrentPrice() * TotalShare;
    }
    
    public double getTotalShare() {
        return TotalShare;
    }

    public void SharePurchase(int shares,double PricePerShare) {
        TotalShare += shares;
        addcost(shares*PricePerShare);
    }
}
 