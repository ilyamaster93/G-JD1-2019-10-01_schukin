package by.academy.java.shchukin.classwork.lesson8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Two {

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Version {  //объявление своей аннотации со свойством info, которое по синтаксису пишется как метод
		String versionNumber();
	}

	
	
}
	

