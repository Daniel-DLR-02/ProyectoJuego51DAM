package controller;
import Datos.DatosMapa1;
import Model.Caja;
import Model.Jugador;
import Crud.*;

public class PosJugador {
	

	public static void DibujarJugador(Jugador j1) {
		
		int numy=j1.getPosy();
		int numx=j1.getPosx();
		DatosMapa1.cords[numy][numx]=j1.getModelo();
	}
	
	public static void BorrarJugador(Jugador j1) {
		int numy=j1.getPosy();
		int numx=j1.getPosx();
		char [][] cords=Datos.DatosMapa1.map1.getCords();
		cords[numy][numx]=' ';
		
	}
	
	public static void PosUpdate(Jugador j1,char op){
		
		
		boolean [][] Huecos;
		
		Huecos=ColisionesMapa1.ComprobarHueco(DatosMapa1.map1.getFilas(),DatosMapa1.map1.getColumnas(),DatosMapa1.map1.getCords());
		Caja c1=DatosMapa1.c1;
		int pasos=5;
		if(op=='a' || op=='A'){
			for (int i = 0; i < pasos; i++) {
				int newposx=j1.getPosx()-1;
				if(Huecos[j1.getPosy()][newposx]==false) {
					BorrarJugador(j1);
					if(newposx==c1.getPosx() && j1.getPosy()==c1.getPosy())
						PosCaja.MoverCajaIzquierda(c1);
					j1.setPosx(newposx);
					DibujarJugador(j1);
					
				}
			}

			
		}
		else if(op=='w' || op=='W'){
			for (int i = 0; i < pasos; i++) {
				int newposy=j1.getPosy()-1;
				
				if(Huecos[newposy][j1.getPosx()]==false) {
					BorrarJugador(j1);
					if(newposy==c1.getPosy() && j1.getPosx()==c1.getPosx())
						PosCaja.MoverCajaArriba(c1);
					j1.setPosy(newposy);
				}
			}

			
		}
		
		else if(op=='d' || op=='D'){
			for (int i = 0; i <pasos; i++) {
				int newposx=j1.getPosx()+1;
				if(Huecos[j1.getPosy()][newposx]==false) {
					BorrarJugador(j1);
					if(newposx==c1.getPosx() && j1.getPosy()==c1.getPosy())
						PosCaja.MoverCajaDerecha(c1);
						
					j1.setPosx(newposx);
				}
			}

			
		}
		else if(op=='s' || op=='S'){
			for (int i = 0; i < pasos; i++) {
				int newposy=j1.getPosy()+1;
				
				if(Huecos[newposy][j1.getPosx()]==false) {
					BorrarJugador(j1);
					if(newposy==c1.getPosy() && j1.getPosx()==DatosMapa1.c1.getPosx())
						PosCaja.MoverCajaAbajo(c1);
					j1.setPosy(newposy);
					
				}
			}

		}
		else if(op=='e'||op=='E')
			Interacciones.EventoAbrirPuerta(j1);
	}
	
}
