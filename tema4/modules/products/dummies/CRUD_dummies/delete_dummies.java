package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.find;

public class delete_dummies {
	public static void delete_dummies_laptop () {
		int location = -1;
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un laptop.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			location = find.find_product(singleton.L);
			if (location != -1) {
				singleton.productlaptop.remove(location);
				JOptionPane.showMessageDialog(null, "Laptop borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "El laptop que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void delete_dummies_smartphone () {
		int location = -1;
		
		if(singleton.productsmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un smartphone.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			location = find.find_product(singleton.S);
			if (location != -1) {
				singleton.productsmartphone.remove(location);
				JOptionPane.showMessageDialog(null, "Smartphone borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "El smartphone que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void delete_dummies_accessory () {
		int location = -1;
		
		if(singleton.productaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un accesorio.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			location = find.find_product(singleton.A);
			if (location != -1) {
				singleton.productaccessory.remove(location);
				JOptionPane.showMessageDialog(null, "Accesorio borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "El accesorio que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}