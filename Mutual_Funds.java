public class Mutual_Funds extends ShareAssets  {

    private double totalShare;
    
    public Mutual_Funds(String symbol, double CurrentPrice,double totalShare) {
        super(symbol, CurrentPrice, totalShare);
        totalShare=0.0;
    }
    @Override
    public double getMarketValue() {
        return totalShare * getCurrentPrice();
    }
    public double getTotalShare() {
        return totalShare;
    }
    
    public void Purchase(double shares , double PricePerShare) {
        totalShare += shares ;
        addcost(PricePerShare*shares);
    }
}
 