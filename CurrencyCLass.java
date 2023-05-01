package RandomConcepts;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyCLass {
public static void main(String[] args) {
	Currency usd=Currency.getInstance("USD");
	NumberFormat format= NumberFormat.getCurrencyInstance(Locale.CHINESE);
	String formattedVal = format.format(108.5);
	System.out.println(formattedVal);
	double price = 2000.35;
	Locale local = new Locale("en", "US");
	NumberFormat currencyForatter= NumberFormat.getCurrencyInstance(local);
	String finalPrice = currencyForatter.format(price);
	System.out.println(finalPrice);
	DecimalFormat decimalFormatter= new DecimalFormat("#, ##0.00");
	decimalFormatter.setPositivePrefix("$");
	String resVal = decimalFormatter.format(price);
	System.out.println("custom format: -" + resVal);
	
	Currency cur= Currency.getInstance("USD");
	String symbol= cur.getSymbol();
	String code= cur.getCurrencyCode();
	System.out.println(symbol);
	System.out.println(code);
}
}
