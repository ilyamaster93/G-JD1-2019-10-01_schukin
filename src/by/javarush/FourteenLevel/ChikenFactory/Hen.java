package by.javarush.FourteenLevel.ChikenFactory;
public abstract class Hen implements Country
{
    int N;
    String country;
    public abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я курица.";
    }
}