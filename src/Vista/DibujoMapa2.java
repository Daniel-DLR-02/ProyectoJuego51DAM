package Vista;

import Datos.DatosMapa2;
import Model.Jugador;
import controller.PosCaja;
import controller.PosJugador;


public class DibujoMapa2 {
	
	
	public static void DibujarMapa( char [][] cords, int cordy, int cordx,Jugador j1) {	//vista
		
		
		PosJugador.DibujarJugador(DatosMapa2.j1,DatosMapa2.map2);
		PosCaja.DibujarCaja(DatosMapa2.c1,DatosMapa2.map2);
		
		for (int i = 0; i < cords.length; i++) {
			System.out.println(cords[i]);
		}
		
	}
}
