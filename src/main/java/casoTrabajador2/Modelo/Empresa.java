package casoTrabajador2.Modelo;

import Datos.*;
import casoTrabajador2.Datos.FuentesDatosEmpresa;

import java.util.*;

public abstract class Empresa implements FuentesDatosEmpresa {

	Collection<Trabajador> trabajador;
	private List<Trabajador> trabajadores;

}