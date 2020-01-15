package proyviaexitos.service;

import proyviaexitos.dto.PagoDto;

public class PagoService {

	public PagoDto procesar(PagoDto dto) {
		//variables
		double ingresos, renta, neto;

		//proceso
		ingresos = ingresos(dto.getHorasDia(), dto.getPagoHoras(), dto.getDias());
		renta = renta(ingresos);
		neto = neto(ingresos, renta);
		//reporte
		dto.setIngresos(ingresos);
		dto.setRenta(renta);
		dto.setNeto(neto);
		return dto;
	}

	private double ingresos(int horasDia, double pagoHora, int dias) {
		double ingresos;
		ingresos = (horasDia * pagoHora * dias);
		return ingresos;
	}

	private double renta(double ingreso) {
		double renta = 0;
		if (ingreso > 1500) {
			renta = ((8.0 / 100.0) * ingreso);
		}
		return renta;
	}

	private double neto(double ingreso, double renta) {
		double neto;
		neto = (ingreso - renta);
		return neto;
	}
}
