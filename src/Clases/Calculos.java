package Clases;
import javax.swing.JOptionPane;

public class Calculos {
	private Convertir convertir = new Convertir();
	
	public double Extranjero(int numero) {
		String cadena;
		double moneda;
		
		cadena = JOptionPane.showInputDialog("Introduzca el valor de la moneda");
		moneda = Double.parseDouble(cadena);
		
		if (moneda <= 0) {
			JOptionPane.showMessageDialog(null, "No acepta números negativo","Error!!!",JOptionPane.ERROR_MESSAGE);
			return 0;
		}
		
		switch (numero) {
		case 0: return convertir.Dolar(moneda);
		case 1: return convertir.Euro(moneda);
		case 2: return convertir.Libra(moneda);
		case 3: return convertir.Yen(moneda);
		case 4: return convertir.Won(moneda);	
		}
		JOptionPane.showMessageDialog(null, "Ocurrio un error","Error!!!",JOptionPane.ERROR_MESSAGE);
		return 0;
	}
	
	public double Pesos(int numero) {
		String cadena;
		double moneda;
		
		cadena = JOptionPane.showInputDialog("Introduzca el valor de la moneda");
		moneda = Double.parseDouble(cadena);
		
		if (moneda <= 0) {
			JOptionPane.showMessageDialog(null, "No acepta números negativo","Error!!!",JOptionPane.ERROR_MESSAGE);
			return 0;
		}
		
		switch (numero) {
		case 0: return convertir.DolarPesos(moneda);
		case 1: return convertir.EuroPesos(moneda);
		case 2: return convertir.LibraPesos(moneda);
		case 3: return convertir.YenPesos(moneda);
		case 4: return convertir.WonPesos(moneda);	
		}
		JOptionPane.showMessageDialog(null, "Ocurrio un error","Error!!!",JOptionPane.ERROR_MESSAGE);
		return 0;
	}
	
	public double Longitud(int numero) {
		String cadena;
		double longitud;
		
		cadena = JOptionPane.showInputDialog("Introducir el valor en metros");
		longitud = Double.parseDouble(cadena);
		
		if (longitud <= 0) {
			JOptionPane.showMessageDialog(null, "No acepta números negativos","Error!!!",JOptionPane.ERROR_MESSAGE);
			return 0;
		}
		
		switch (numero) {
		case 0: return convertir.ConvertirAcm(longitud);
		case 1: return convertir.ConvertirAkm(longitud);
		case 2: return convertir.ConvertirAyarda(longitud);
		case 3: return convertir.convertirApie(longitud);
		case 4: return convertir.convertirApulgada(longitud);
		}
		
		JOptionPane.showMessageDialog(null, "Ocurrio un error","Error!!!",JOptionPane.ERROR_MESSAGE);
		return 0;
	}
}
