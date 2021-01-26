package Crud;

import Model.Caja;
import Model.Hoyo;
import Model.Jugador;
import Model.Mapa;

public class Interacciones {
	
	public static void EventoBotonActivado(char [][] cords,int cordy,int cordx,Caja c1){
		
		cords[cordy][cordx]=' ';
		c1.setModelo('▣');
		
	}
	
	public static void EventoHoyoTapado(Hoyo h1){
		
		h1.setModelo('@');
		Vista.Mensajes.Lose();
		
	}
	public static void EventoAbrirPuerta(Jugador j1,Mapa map) {
		
		boolean [][] puertas=ColisionesMapa.puertas(map.getFilas(),map.getColumnas(),map.getCords());
		
		if((j1.getContadorllaves() > 0) && (puertas[j1.getPosy()+1][j1.getPosx()])) {
			map.cords[j1.getPosy()+1][j1.getPosx()]=' ';
			j1.setContadorllaves(j1.getContadorllaves()-1);
		}
		else if((j1.getContadorllaves() > 0) && (puertas[j1.getPosy()-1][j1.getPosx()])) {
			map.cords[j1.getPosy()-1][j1.getPosx()]=' ';
			j1.setContadorllaves(j1.getContadorllaves()-1);
		}
		else if((j1.getContadorllaves() > 0) && (puertas[j1.getPosy()][j1.getPosx()-1])) {
			map.cords[j1.getPosy()][j1.getPosx()-1]=' ';
			j1.setContadorllaves(j1.getContadorllaves()-1);
		}
		else if((j1.getContadorllaves() > 0) && (puertas[j1.getPosy()][j1.getPosx()+1])) {
			map.cords[j1.getPosy()][j1.getPosx()+1]=' ';
			j1.setContadorllaves(j1.getContadorllaves()-1);
		}
		
		
	}


	
}
