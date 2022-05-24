package Clases;
import Interfaz.ConversionLongitud;
import Interfaz.ConversionMonedaExtranjera;
import Interfaz.ConversionMonedaLocal;

public class Convertir implements ConversionMonedaExtranjera, ConversionMonedaLocal,ConversionLongitud {

	@Override
	public double Dolar(double moneda) {
		return moneda * 118.88;
	}

	@Override
	public double Euro(double moneda) {
		return moneda * 127.43;
	}

	@Override
	public double Libra(double moneda) {
		return moneda * 148.72;
	}

	@Override
	public double Yen(double moneda) {
		return moneda * 0.93;
	}

	@Override
	public double Won(double moneda) {
		return moneda * 0.094;
	}

	@Override
	public double DolarPesos(double moneda) {
		return moneda * 0.0084;
	}

	@Override
	public double EuroPesos(double moneda) {
		return moneda * 0.0078;
	}

	@Override
	public double LibraPesos(double moneda) {
		return moneda * 0.0067;
	}

	@Override
	public double YenPesos(double moneda) {
		return moneda * 1.07;
	}

	@Override
	public double WonPesos(double moneda) {
		return moneda * 10.62;
	}
	@Override
	public double ConvertirAcm(double metro) {
		return metro * 100;
	}

	@Override
	public double ConvertirAkm(double metro) {
		return metro * 0.001;
	}

	@Override
	public double ConvertirAyarda(double metro) {
		return metro * 1.09361;
	}

	@Override
	public double convertirApie(double metro) {
		return metro * 3.28084;
	}

	@Override
	public double convertirApulgada(double metro) {
		return metro * 39.3701;
	}
}
