public class cash implements Assat{

    private double amount;

    public cash (double amount){
        this.amount =amount;
    }

    @Override
    public double getMarketValue() {
        return amount;
    }

    // On cash there Will Be NoT any External Profit Created
    @Override
    public double getProfit() {
        // TODO Auto-generated method stub
        return 0;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}