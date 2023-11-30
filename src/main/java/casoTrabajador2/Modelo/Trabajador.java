package casoTrabajador2.Modelo;

import Datos.*;

public class Trabajador extends Persona implements FuentesDatosTrabajador {

	Empresa empresa;
	private String afp;
	private String isapre;

	public String getAfp() {
		return this.afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getIsapre() {
		return this.isapre;
	}

	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	public void mostrarDatosTrabajador() {
		// TODO - implement Trabajador.mostrarDatosTrabajador
		throw new UnsupportedOperationException();
	}

}