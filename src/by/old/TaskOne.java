package by.old;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

	    public static void main(String[] args) {
	    	try {
	    	Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
	        int i = 0;
	        System.out.print("Введите целое число: ");
	        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
	          i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
	          if (i%2 == 0){
	            System.out.println("Число" + " " + i + " " + "четное");
	          } else {
	          System.out.println("Вы ввели не четное целое число");
	        }
	      }else {
	    	  System.out.println("Ошибка! Вы ввели не целое число!");
	      }
	       	}          
	    	catch (NumberFormatException e) {
	        	System.out.println("Ошибка! Некоректно введено число!");
	        }
	    }
	}
