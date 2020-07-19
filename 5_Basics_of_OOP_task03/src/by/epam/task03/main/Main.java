package by.epam.task03.main;

import by.epam.task03.logic.*;

/*
 * 3. Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.*/

public class Main {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		calendar.addDay(22, 9, 2019, false);
		calendar.addDay(1, 1, 2020, true);
		calendar.addDay(31, 2, 1998, true);
		calendar.addDay(5, 7, 2002, false);
		calendar.addDay(24, 2, 2020, false);
		calendar.displayCalendar();
		calendar.displayHolidays();
	}

}
