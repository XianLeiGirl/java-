package my;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class HelloWorld
{

	
	public static void main(String[] args) 
	{
		//输出10个异常
//		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
//		List<Date>list=new ArrayList<>(10);
//		for(int cnt=0;cnt<10;cnt++)
//		{
//			try {
//				Date date=dateformat.parse("09-12");
//				list.add(date);
//			}
//			catch(ParseException e) {
//				e.printStackTrace();
//			}
//		}

		//输出1个异常
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
		List<Date>list=new ArrayList<>(10);
		
			try {
				for(int cnt=0;cnt<10;cnt++)
				{
					Date date=dateformat.parse("09-12");
				list.add(date);
				}	
			}
			catch(ParseException e) {
				e.printStackTrace();
			}
	}
}