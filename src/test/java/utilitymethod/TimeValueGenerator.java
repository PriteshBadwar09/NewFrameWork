package utilitymethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class TimeValueGenerator {
	public static String getTime()
	{
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("ddMMyyyyHHmm");
		LocalDateTime  now =  LocalDateTime.now();
		String timevalue = dtf.format(now);
		String value = timevalue.replace("", "");
		System.out.println(value);
		return value;
	}
	public static void main(String[] args) {
		TimeValueGenerator.getTime();
	}

}
