package by.javarush.FourteenLevel.task1410;
public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
Wine wine = new Wine ();
return wine;
    }

    public static Wine getWine() {
//Wine wine = new Wine ();
return new Wine();
    }

    public static Wine getBubblyWine() {
Wine wine = new BubblyWine();
return wine;
    }
}