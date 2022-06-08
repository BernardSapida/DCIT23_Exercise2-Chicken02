public class FarmerFred {
    // Properties of FarmerFred
    private double dailyAverage, monthlyAverage, monthlyProfit;

    // Behavior of FarmerFred
    // Setter Method for setDailyAverage
    public void setDailyAverage(double monday, double tuesday, double wednesday){
        this.dailyAverage = (monday + tuesday + wednesday) / 3;
        setMonthlyAverage(this.dailyAverage);
    }

    // Setter Method for Monthly Average
    private void setMonthlyAverage(double dailyAverage) {
        this.monthlyAverage = dailyAverage * 30;
        setMonthlyProfit(this.monthlyAverage);
    }

    // Setter Method for Monthly Profit
    private void setMonthlyProfit(double monthlyAverage) {
        this.monthlyProfit = monthlyAverage * 0.18;
    }

    // Getter Method
    public void getReport(){
        System.out.println("\nDaily Average: " + this.dailyAverage);
        System.out.println("Monthly Average: " + this.monthlyAverage);
        System.out.println("Monthly Profit: $" + this.monthlyProfit + "\n");
    }
}