package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		Date dat=new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		System.out.println(dat.getMonth());
		System.out.println(dat.getYear());
		System.out.println(dat.getDate());
		System.out.println(dateFormat.format(dat));

	}

}
