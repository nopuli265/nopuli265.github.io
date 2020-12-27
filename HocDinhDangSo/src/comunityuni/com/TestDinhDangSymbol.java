package comunityuni.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestDinhDangSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x= 12345678;
DecimalFormat dcf= new DecimalFormat("#,###");
DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
dfs.setGroupingSeparator('.');
dcf.setDecimalFormatSymbols(dfs);
System.out.println(x);
System.out.println(dcf.format(x));
	}

}
