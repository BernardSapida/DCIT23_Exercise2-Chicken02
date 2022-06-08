/* Author: Bernard Sapida */

public class Chicken02 {
    public static void main(String[] args) throws Exception {
        // variable declaration
        double mondayEggsCollected = 100,
               tuesdayEggsCollected = 121,
               wednesdayEggsCollected = 117;

        // Instantiating the FarmerBrfarmerFredown Class
        FarmerFred farmerFred = new FarmerFred();

        // Setters and Getters
        farmerFred.setDailyAverage(mondayEggsCollected, tuesdayEggsCollected, wednesdayEggsCollected);
        farmerFred.getReport();
    }
}