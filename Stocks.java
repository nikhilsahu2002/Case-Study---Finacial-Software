public class Stocks extends ShareAssets {

    private int TotalShare;

    public Stocks(String symbol, double CurrentPrice,double TotalShare) {
        super(symbol, CurrentPrice, TotalShare);
        TotalShare=0;
    }
    @Override
    public double getMarketValue() {
        return getCurrentPrice() * TotalShare;
    }
    
    public int getTotalShare() {
        return TotalShare;
    }

    public void setTotalShare(int totalShare) {
        TotalShare = totalShare;
    }

    public void SharePurchase(int shares,double PricePerShare) {
        TotalShare += shares;
        addcost(shares*PricePerShare);
    }
}
 