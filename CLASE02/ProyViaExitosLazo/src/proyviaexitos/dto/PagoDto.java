package proyviaexitos.dto;

public class PagoDto {

	//datos
	private int horasDia;
	private int dias;
	private double pagoHoras;

	//resultados
	private double ingresos;
	private double renta;
	private double neto;

	public PagoDto() {
	}

	public int getHorasDia() {
		return horasDia;
	}

	public void setHorasDia(int horasDia) {
		this.horasDia = horasDia;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public double getPagoHoras() {
		return pagoHoras;
	}

	public void setPagoHoras(double pagoHoras) {
		this.pagoHoras = pagoHoras;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public double getRenta() {
		return renta;
	}

	public void setRenta(double renta) {
		this.renta = renta;
	}

	public double getNeto() {
		return neto;
	}

	public void setNeto(double neto) {
		this.neto = neto;
	}

} //Fin de clase PromedioDto

