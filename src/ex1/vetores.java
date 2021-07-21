package ex1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class vetores {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat xls1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = xls1.parse("12/02/2012 12:22:22");
		
		Date x = new Date();
		
		System.out.println(xls1.format(y1));
		System.out.println(xls1.format(x));
		sc.close();
	}

}
