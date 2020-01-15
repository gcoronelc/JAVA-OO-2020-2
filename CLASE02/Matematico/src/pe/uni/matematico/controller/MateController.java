package pe.uni.matematico.controller;

import pe.uni.matematico.service.MateService;

public class MateController {
	
	private MateService service;

	public MateController() {
		service = new MateService();
	}
	
	public long factorial(int num) {
		return service.factorial(num);
	}
	
}
