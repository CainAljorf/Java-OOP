package tema4;

import java.text.ParseException;

import javax.swing.JOptionPane;

import tema4.classes.date;
import tema4.modules.products.utils.regex;
import tema4.utils.validators;

public class test {
	
	public static void main(String[] args) throws ParseException{
		boolean res = false;
		String date_purchase = "";
		date D = null;
		do {
			date_purchase = validators.validator_string("Ingresa fecha compra","Ingresa fecha");
			res = regex.validateDate(date_purchase);
			if (res == false) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				D = new date(date_purchase);
				System.out.println(D.toString());
				if ((D.check_day(date_purchase))&&(D.check_month(date_purchase))&&(D.check_year(date_purchase))) {
					res = true;
				}else {
					res=false;
				}
				if (res == false) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
//					num = D.compare_dates(D);
				} // end if
			} // end if
		} while ((res == false));
		System.out.println(date_purchase);
		System.out.println(D);
	}//end main
}
