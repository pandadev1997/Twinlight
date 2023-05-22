package utility;

import java.util.Date;
import java.util.Random;

public class Java_utility {
	/**
	 * This method will generate random number
	 */
	
	public void random() {
		Random r=new Random();
		int random=r.nextInt(1000);
	}
	/**
	 * This method will help to get system cuurrent date,time,year and month
	 * @return
	 */
	
	public String systemdate() {
		Date d=new Date();
		System.out.println(d);
		String a[]=d.toString().split(" ");
		String date=a[2];
		String month=a[1];
		String day=a[0];
		String year=a[5];
		String time=a[3];
		String currentdate=date+"-"+month+"-"+year+"-"+time;
		return currentdate;
	}

}
