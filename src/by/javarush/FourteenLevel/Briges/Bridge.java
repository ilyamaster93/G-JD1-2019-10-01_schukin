package by.javarush.FourteenLevel.Briges;
public interface Bridge {
    int carsCount =10;
	default int getCarsCount() {
		return 10;
	}
}