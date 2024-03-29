package controller;
import Datos.DatosMapa1;
import Model.Caja;
import Model.Jugador;
import Model.Mapa;
import Crud.*;

public class PosJugador {
	

	public static void DibujarJugador(Jugador j1,Mapa map) {
		
		int numy=j1.getPosy();
		int numx=j1.getPosx();
		map.cords[numy][numx]=j1.getModelo();
	}
	
	public static void BorrarJugador(Jugador j1,Mapa map) {
		int numy=j1.getPosy();
		int numx=j1.getPosx();
		char [][] cords=map.cords;
		cords[numy][numx]=' ';
		
	}
	
	public static void PosUpdate(Jugador j1,Caja c1,char op,Mapa map){
		
		boolean [][] llaves;
		boolean [][] Huecos;
		boolean [][] ColisionCaja;
		
		ColisionCaja=ColisionesMapa.ColisionesCaja(map.getFilas(),map.getColumnas(),map.getCords());
		llaves=ColisionesMapa.llaves(map.getFilas(),map.getColumnas(),map.getCords());
		Huecos=ColisionesMapa.ComprobarHueco(map.getFilas(),map.getColumnas(),map.getCords());
		
		int pasos=5;
		if(op=='a' || op=='A'){
			for (int i = 0; i < pasos; i++) {
				int newposx=j1.getPosx()-1;
				if(Huecos[j1.getPosy()][newposx]==false) {
					
					BorrarJugador(j1,map);
					
					if(newposx==c1.getPosx() && j1.getPosy()==c1.getPosy()){
						if(ColisionCaja[c1.getPosy()][c1.getPosx()-1]){
							Huecos[c1.getPosy()][c1.getPosx()]=true;
						}
						
						else {
							PosCaja.MoverCajaIzquierda(c1,map);
							j1.setPosx(newposx);
						}
				
					}
					else {
						j1.setPosx(newposx);
					}
					if(llaves[j1.getPosy()][j1.getPosx()]) {
						j1.setContadorllaves(j1.getContadorllaves()+1);
						llaves[j1.getPosy()][j1.getPosx()]=false;
					}

				}
			}

			
		}
		else if(op=='w' || op=='W'){
			for (int i = 0; i < pasos; i++) {
				int newposy=j1.getPosy()-1;
				
				if(Huecos[newposy][j1.getPosx()]==false) {
					BorrarJugador(j1,map);
					if(newposy==c1.getPosy() && j1.getPosx()==c1.getPosx()){
						if(ColisionCaja[c1.getPosy()+1][c1.getPosx()]){
							Huecos[c1.getPosy()][c1.getPosx()]=true;
						}
						
						else {
							PosCaja.MoverCajaArriba(c1,map);
							j1.setPosy(newposy);
						}
				
					}
					else {
						j1.setPosy(newposy);
					}
					if(llaves[j1.getPosy()][j1.getPosx()]) {
						j1.setContadorllaves(j1.getContadorllaves()+1);
						llaves[j1.getPosy()][j1.getPosx()]=false;
					}
				}
			}

			
		}
		
		else if(op=='d' || op=='D'){
			for (int i = 0; i <pasos; i++) {
				int newposx=j1.getPosx()+1;
				if(Huecos[j1.getPosy()][newposx]==false) {
					BorrarJugador(j1,map);
					if(newposx==c1.getPosx() && j1.getPosy()==c1.getPosy()){
						if(ColisionCaja[c1.getPosy()][c1.getPosx()+1]){
							Huecos[c1.getPosy()][c1.getPosx()]=true;
						}
						
						else {
							PosCaja.MoverCajaDerecha(c1,map);
							j1.setPosx(newposx);
						}
				
					}
					else {
						j1.setPosx(newposx);
					}
					
					if(llaves[j1.getPosy()][j1.getPosx()]) {
						j1.setContadorllaves(j1.getContadorllaves()+1);
						llaves[j1.getPosy()][j1.getPosx()]=false;
					}
				}
			}

			
		}
		else if(op=='s' || op=='S'){
			for (int i = 0; i < pasos; i++) {
				int newposy=j1.getPosy()+1;
				
				if(Huecos[newposy][j1.getPosx()]==false) {
					BorrarJugador(j1,map);
					if(newposy==c1.getPosy() && j1.getPosx()==c1.getPosx()){
						if(ColisionCaja[c1.getPosy()-1][c1.getPosx()]){
							Huecos[c1.getPosy()][c1.getPosx()]=true;
						}
						
						else {
							PosCaja.MoverCajaAbajo(c1,map);
							j1.setPosy(newposy);
						}
				
					}
					else {
						j1.setPosy(newposy);
					}
					if(llaves[j1.getPosy()][j1.getPosx()]) {
						j1.setContadorllaves(j1.getContadorllaves()+1);
						llaves[j1.getPosy()][j1.getPosx()]=false;
					}
					
				}
			}

		}
		else if(op=='e'||op=='E')
			Interacciones.EventoAbrirPuerta(j1, map);
		
		
		

	}
	
}
