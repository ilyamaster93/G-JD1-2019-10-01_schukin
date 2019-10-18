package by.academy.java.shchukin.classwork.lesson5;

import java.util.Calendar;
import java.util.Date;

public class Six {

	public static void main(String[] args) {
		Date date = new Date();//тек дата и время
		System.out.println(date);
		long time = date.getTime();
		System.out.println(time);//получаем из DAte long
		Date misticDate = new Date(-12400400);
		System.out.println(misticDate);
		System.out.println(date.getMonth());
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
	}

}
