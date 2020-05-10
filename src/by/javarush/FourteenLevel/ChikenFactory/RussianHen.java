package by.javarush.FourteenLevel.ChikenFactory;
public class RussianHen extends Hen
{
    String country = RUSSIA;
    public int getCountOfEggsPerMonth(){
        return this.N;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}