package Crud;

import Datos.DatosMapa1;
import Model.Jugador;

public class Interacciones {
	
	public static void EventoBotonActivado(char [][] cords,int cordy,int cordx){
		
		cords[cordy][cordx]=' ';
		Datos.DatosMapa1.c1.setModelo('▣');
		//15  12
	}
	public static void EventoAbrirPuerta(Jugador j1) {
		
		boolean [][] puertas=ColisionesMapa1.puertas(DatosMapa1.filasmapa1,DatosMapa1.columnasmapa1,DatosMapa1.map1.getCords());
		
		if((j1.getContadorllaves() > 0) && (puertas[j1.getPosy()+1][j1.getPosx()])) {
			DatosMapa1.cords[j1.getPosy()+1][j1.getPosx()]=' ';
			j1.setContadorllaves(j1.getContadorllaves()-1);
		}
		else if((j1.getContadorllaves() > 0) && (puertas[j1.getPosy()-1][j1.getPosx()])) {
			DatosMapa1.cords[j1.getPosy()-1][j1.getPosx()]=' ';
			j1.setContadorllaves(j1.getContadorllaves()-1);
		}
		else if((j1.getContadorllaves() > 0) && (puertas[j1.getPosy()][j1.getPosx()-1])) {
			DatosMapa1.cords[j1.getPosy()][j1.getPosx()-1]=' ';
			j1.setContadorllaves(j1.getContadorllaves()-1);
		}
		else if((j1.getContadorllaves() > 0) && (puertas[j1.getPosy()][j1.getPosx()+1])) {
			DatosMapa1.cords[j1.getPosy()][j1.getPosx()+1]=' ';
			j1.setContadorllaves(j1.getContadorllaves()-1);
		}
		
	}
	
	
}
