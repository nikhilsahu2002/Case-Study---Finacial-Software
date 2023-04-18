public abstract class ShareAssets implements Assat{
    private String symbol;
    private double totalCost;
    private double CurrentPrice;

    public ShareAssets(String symbol ,double CurrentPrice,double totalCost){
        this.symbol = symbol;
        this.CurrentPrice = CurrentPrice;
        this.totalCost =totalCost;  
    } 
    
    public void addcost(double cost) {
        totalCost +=cost;
    } 
    public double getCurrentPrice() {
        return CurrentPrice;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setCurrentPrice(double currentPrice) {
        CurrentPrice = currentPrice;
    }
    public abstract double getMarketValue();
    public  double getProfit(){
        return getMarketValue() - totalCost;
    }
}