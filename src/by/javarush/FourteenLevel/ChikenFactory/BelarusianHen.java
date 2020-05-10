package by.javarush.FourteenLevel.ChikenFactory;
public class BelarusianHen extends Hen
{
    String country = BELARUS;
    public int getCountOfEggsPerMonth(){
        return this.N;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}