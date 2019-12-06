package by.academy.java.shchukin.classwork.lessonJDKEight.lessonTwo;

import java.util.Arrays;
import java.util.Collection;

public class Task {

	private enum Status {
		OPEN, CLOSED
	};

	private final Status status;
	private final Integer points;

	public Task(final Status status, final Integer points) {
		this.status = status;
		this.points = points;
	}

	private Status getStatus() {
		return status;
	}

	private Integer getPoints() {
		return points;
	}

	public static void main(String[] args) {
		final Collection<Task> tasks = Arrays.asList(new Task(Status.OPEN, 5), new Task(Status.OPEN, 13),
				new Task(Status.CLOSED, 8));

		final long totalPointsOfOpenTasks = tasks
				.stream() //конвертирует коллекцию задач в потоковое представление
				.parallel()//используем параллелизацию  в Стриме - попытка обработать задачи параллельно, если это возможно
				.filter(task -> task.getStatus() == Status.OPEN)//отфильтров все задачи CLOSED 
				.mapToInt(Task::getPoints) // преобр-т поток Task в поток Int
				.sum();//финальная операция, возвр-т сумму, без нее ничего не запустится
		System.out.printf("Total poimts: %s", totalPointsOfOpenTasks);
	}

}
