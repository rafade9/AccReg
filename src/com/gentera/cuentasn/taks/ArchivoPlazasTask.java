/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.taks;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gentera.cuentasn.entities.Sucursal;
import com.gentera.cuentasn.util.Properties;

public class ArchivoPlazasTask {

	public static List<Sucursal> obtenerIPs(){

		List<Sucursal> sucursales = new ArrayList<Sucursal>();

		String archivo = Properties.getProp("nombrePlazas")+".xlsx";

		File fichero = new File(Properties.getProp("filePlazas")+archivo);
		
		if(fichero.exists()){

			XSSFWorkbook workbook = null;
			
			try {	
				workbook = new XSSFWorkbook(fichero);
			} catch (IOException | InvalidFormatException e1) {
				
				e1.printStackTrace();
			}
		
			try{

				XSSFSheet sheet = workbook.getSheetAt(0);

				Iterator<Row> rowIterator = sheet.iterator();

				Row row;

				while (rowIterator.hasNext()){

					boolean titulo = true;

					Sucursal sucursal = new Sucursal();

					row = rowIterator.next();

					Iterator<Cell> cellIterator = row.cellIterator();

					Cell celda;

					int cont = 1;

					while (cellIterator.hasNext()){

						celda = cellIterator.next();

						if(celda.getRowIndex()!=0){

							titulo = false;

							switch(celda.getCellType()) {

							case Cell.CELL_TYPE_NUMERIC:

								if( DateUtil.isCellDateFormatted(celda) ){//Celdas con formato de fecha

								}else{//Celdas numericas
									if(cont == 2)
										sucursal.setId(celda.getNumericCellValue()); //Id 
								}

								break;

							case Cell.CELL_TYPE_STRING:

								if(cont == 3){
									sucursal.setTipo(celda.getStringCellValue());
								}
								if(cont == 4){
									sucursal.setPlaza(celda.getStringCellValue());
								}
								if(cont == 5){
									sucursal.setEstado(celda.getStringCellValue());
								}
								if(cont == 6){
									sucursal.setIp(celda.getStringCellValue());
								}
								break;

							case Cell.CELL_TYPE_BOOLEAN:

								break;

							}
							cont++;
						}

					}

					if(!titulo){
						sucursales.add(sucursal);
					}
				}

			}finally{
				try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}else{
			return null;
		}
		
		return sucursales;
	}

}