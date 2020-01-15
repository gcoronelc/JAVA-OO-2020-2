package proyviaexitos.prueba;

import proyviaexitos.dto.PagoDto;
import proyviaexitos.service.PagoService;

public class Prueba01 {

	public static void main(String[] args) {
		//variable
		PagoDto dto;

		//datos
		dto = new PagoDto();
		dto.setHorasDia(6);
		dto.setDias(20);
		dto.setPagoHoras(200);

		//proceso
		PagoService service = new PagoService();
		dto = service.procesar(dto);

		//reporte 
		System.out.println("ingresos: " + dto.getIngresos());
		System.out.println("renta: " + dto.getRenta());
		System.out.println("neto: " + dto.getNeto());
	}

}
