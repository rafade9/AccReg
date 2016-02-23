package com.gentera.cuentasn.util;

import java.util.List;

import com.gentera.cuentasn.entities.Sucursal;
import com.gentera.cuentasn.taks.ArchivoPlazasTask;

public class PlazasArchivo {

	public static List<Sucursal> plazas = ArchivoPlazasTask.obtenerIPs();

	public static List<Sucursal> getPlazas() {
		return plazas;
	}

	public static void setPlazas(List<Sucursal> plazas) {
		PlazasArchivo.plazas = plazas;
	}


	
}
