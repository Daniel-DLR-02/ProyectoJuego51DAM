package controller;

import Crud.ColisionesMapa;
import Model.Caja;
import Model.Jugador;
import Model.Mapa;

public class PosCaja {
	

	
	public static void BorrarCaja (Caja c1, Jugador j1,Mapa map) {
		int numy=c1.getPosy();
		int numx=c1.getPosx();
		char [][] cords=map.getCords();
		cords[numy][numx]=' ';
			
			
	}
	
	public static void DibujarCaja (Caja c1,Mapa map) {
		int numy=c1.getPosy();
		int numx=c1.getPosx();
		char [][] cords=map.getCords();
		cords[numy][numx]=c1.getModelo();
	}
	
	public static void MoverCajaIzquierda(Caja c1,Mapa map) {
		
		boolean [][] Huecos=ColisionesMapa.ColisionesCaja(map.getFilas(),map.getColumnas(),map.getCords());
		
		int newPosx=c1.getPosx()-1;
		
		if (Huecos[c1.getPosy()][newPosx]==false)
			c1.setPosx(newPosx);
	}
	public static void MoverCajaDerecha(Caja c1,Mapa map) {
		
		boolean [][] Huecos=ColisionesMapa.ColisionesCaja(map.getFilas(),map.getColumnas(),map.getCords());
		
		int newPosx=c1.getPosx()+1;
		
		if (Huecos[c1.getPosy()][newPosx]==false)
			c1.setPosx(newPosx);
	}
	public static void MoverCajaArriba(Caja c1,Mapa map) {
		
		boolean [][] Huecos=ColisionesMapa.ColisionesCaja(map.getFilas(),map.getColumnas(),map.getCords());
		
		int newPosy=c1.getPosy()-1;
		
		if (Huecos[newPosy][c1.getPosx()]==false)
			c1.setPosy(newPosy);
	}
	public static void MoverCajaAbajo(Caja c1,Mapa map) {
		
		boolean [][] Huecos=ColisionesMapa.ColisionesCaja(map.getFilas(),map.getColumnas(),map.getCords());
		
		int newPosy=c1.getPosy()+1;
		
		if (Huecos[newPosy][c1.getPosx()]==false)
			c1.setPosy(newPosy);
	}


}
