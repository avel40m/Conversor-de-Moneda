package Clases;

import javax.swing.JOptionPane;

public class Menus {
	private int posicion;
	private Calculos calculos = new Calculos();
	
	public void Principal() {
		int band;
		String[] opciones = {"Convetir a Pesos Argentino","Convertir a Moneda Extranjera","Convertir Longitud"};
		
		do {
			String input = (String) JOptionPane.showInputDialog(null,"Seleccionar opción","Conversión",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
			posicion = devolverPosicion(opciones, input);
			
			switch (posicion) {
			case 0:
				ConversionExtranjera();
				break;
			case 1:
				ConversionPesos();
				break;
			case 2:
				ConversionLongitud();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción incorrecta","Error!!!",JOptionPane.ERROR_MESSAGE);
			}
			
			band = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");
		} while (band == 1);
		
		JOptionPane.showMessageDialog(null, "SALIO DEL PROGRAMA", "Termino",JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void ConversionExtranjera() {
		String[] opciones = {"Dolar a pesos","Euro a pesos","Libra a pesos","Yen a pesos","Won a pesos"};
		try {

			String input = (String) JOptionPane.showInputDialog(null,"Seleccionar opción","Conversión",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
			posicion = devolverPosicion(opciones, input);
			JOptionPane.showMessageDialog(null, "El valor es: $" + String.format("%.2f", calculos.Extranjero(posicion)) +" Pesos.");	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingreso un valor invalido","Error!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void ConversionPesos() {
		String[] opciones = {"Pesos a dolar","Pesos a euro","Pesos a Libra","Pesos a yen","Pesos a won"};
		try {
			String input = (String) JOptionPane.showInputDialog(null,"Seleccionar opción","Conversión",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
			posicion = devolverPosicion(opciones, input);	
			JOptionPane.showMessageDialog(null, "El valor es: $"+ String.format("%.2f", calculos.Pesos(posicion)) + " " + moneda(opciones, input));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingreso un valor invalido","Error!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void ConversionLongitud() {
		String[] opciones = {"De metros a cm","De metros a km","De metros a yarda","De metros a pie","De metros a pulgada"};
		try {
			String input = (String) JOptionPane.showInputDialog(null,"Seleccionar opción","Conversión",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
			posicion = devolverPosicion(opciones, input);
			JOptionPane.showMessageDialog(null, "El valor es igual a: " + String.format("%.2f", calculos.Longitud(posicion)) + " " + longitud(opciones, input));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingreso un valor invalido","Error!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private int devolverPosicion(String[] arreglo,String seleccion) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == seleccion) {
				return i;
			}
		}
		return 0;
	}
	
	private String moneda(String[] arreglo,String posicion) {
		String[] nombre = {"Dolar","Euro","Libra","Yen","Won"};
		
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == posicion) {
				return nombre[i];
			}
		}
		return null;
	}
	
	private String longitud(String[] arreglo, String posicion) {
		String[] medida = {"cm","km","yarda","pie","pulgada"};
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == posicion) {
				return medida[i];
			}
		}
		return null;
	}
}
