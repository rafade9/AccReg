package com.gentera.cuentasn.util;

import java.util.List;

import com.gentera.cuentasn.taks.ArchivoOperadoresTask;

public class OperadoresArchivo {
	
	public static List<String> numOperadores = ArchivoOperadoresTask.obtenerOperadores();

	public static List<String> getNumOperadores() {
		return numOperadores;
	}

	public static void setNumOperadores(List<String> numOperadores) {
		OperadoresArchivo.numOperadores = numOperadores;
	}

	
}
