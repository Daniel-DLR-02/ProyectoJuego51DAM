package controller;

import Crud.ColisionesMapa1;
import Datos.DatosMapa1;
import Model.Caja;
import Model.Jugador;

public class PosCaja {
	
	static boolean [][] Huecos=ColisionesMapa1.ColisionesCaja(DatosMapa1.map1.getFilas(),DatosMapa1.map1.getColumnas(),DatosMapa1.map1.getCords());
	
	public static void BorrarCaja (Caja c1, Jugador j1) {
		int numy=c1.getPosy();
		int numx=c1.getPosx();
		char [][] cords=Datos.DatosMapa1.map1.getCords();
		cords[numy][numx]=' ';
			
			
	}
	
	public static void DibujarCaja (Caja c1) {
		int numy=c1.getPosy();
		int numx=c1.getPosx();
		char [][] cords=Datos.DatosMapa1.map1.getCords();
		cords[numy][numx]=c1.getModelo();
	}
	
	public static void MoverCajaIzquierda(Caja c1) {
		
		int newPosx=c1.getPosx()-1;
		
		if (Huecos[c1.getPosy()][newPosx]==false)
			c1.setPosx(newPosx);
	}
	public static void MoverCajaDerecha(Caja c1) {
		int newPosx=c1.getPosx()+1;
		
		if (Huecos[c1.getPosy()][newPosx]==false)
			c1.setPosx(newPosx);
	}
	public static void MoverCajaArriba(Caja c1) {
		int newPosy=c1.getPosy()-1;
		
		if (Huecos[newPosy][c1.getPosx()]==false)
			c1.setPosy(newPosy);
	}
	public static void MoverCajaAbajo(Caja c1) {
		
		int newPosy=c1.getPosy()+1;
		
		if (Huecos[newPosy][c1.getPosx()]==false)
			c1.setPosy(newPosy);
	}


}
