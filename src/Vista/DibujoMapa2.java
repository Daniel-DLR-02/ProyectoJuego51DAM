package Vista;

import Datos.DatosMapa2;
import Model.Jugador;
import controller.PosCaja;
import controller.PosJugador;


public class DibujoMapa2 {
	
	
	public static void DibujarMapa( char [][] cords, int cordy, int cordx,Jugador j1) {	//vista
		
		
		PosJugador.DibujarJugador(DatosMapa2.j1,DatosMapa2.map2);
		PosCaja.DibujarCaja(DatosMapa2.c1,DatosMapa2.map2);
		DatosMapa2.map2.cords[DatosMapa2.h1.getPosy()][DatosMapa2.h1.getPosx()]=DatosMapa2.h1.getModelo();
		
		for (int i = 0; i < cords.length; i++) {
			System.out.println(cords[i]);
		}
		
	}
}
