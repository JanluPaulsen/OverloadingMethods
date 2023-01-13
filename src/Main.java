public class Main {
    public static void main(String[] args) {
        System.out.println(covertToCentimeters(55));
        System.out.println(covertToCentimeters(2,2));
    }

    public static double covertToCentimeters(int heightInInches) {
        //returns the calculations
        return heightInInches * 2.54;
    }

    public static double covertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        //calls the first method and passes the parameters which are calculated
        return covertToCentimeters((heightInFeet * 12) + remainingHeightInInches);
    }
}