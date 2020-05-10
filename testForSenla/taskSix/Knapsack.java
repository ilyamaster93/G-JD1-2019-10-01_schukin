package by.senla.test.taskSix;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {
	public static void main(String[] args) {
		final Item itemOne = new Item("Телевизор", 15, 30);
		final Item itemTwo = new Item("Утюг", 10, 5);
		final Item itemThree = new Item("Телефон", 2, 30);

		final Item[] items = { itemOne, itemTwo, itemThree };
		Arrays.sort(items, Comparator.comparingDouble(Item::valueUnitOfWeight).reversed());
		System.out.println(Arrays.toString(items));
		final int knapsackWeight = 25;
		int currentWeight = 0;
		int currentValue = 0;
		int currentItem = 0;

		while (currentItem < items.length && currentWeight != knapsackWeight) {
			if (currentWeight + items[currentItem].getWeight() < knapsackWeight) {
				currentValue += items[currentItem].getValue();
				currentWeight += items[currentItem].getWeight();
			}

			currentItem++;
		}
		System.out.println("Максимальная стоимость лучшего набора: " + currentValue);
	}
}
