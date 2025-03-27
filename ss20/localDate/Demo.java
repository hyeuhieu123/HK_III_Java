package localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Demo {
	public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	LocalDate bod = LocalDate.of(2000,2,10);
	System.out.println(now);
	LocalTime nowtime = LocalTime.now();
	System.out.println(nowtime);
	LocalTime bodTime = LocalTime.of(5, 6, 8);
	System.out.println(bod);

	LocalDateTime nowDateTime  = LocalDateTime.now();
	// LocalDateTime bodDateTime = LocalDateTime.of(0, 0, 0, 0, 0, 0);

	Period perid =Period.between(now,bod);
	System.out.println(perid);
	}
}
