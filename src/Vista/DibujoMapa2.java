package Vista;

import Model.Jugador;
import controller.PosCaja;
import controller.PosJugador;


public class DibujoMapa2 {
	
	
	public static void DibujarMapa( char [][] cords, int cordy, int cordx,Jugador j1) {	//vista
		
		
		PosJugador.DibujarJugador(j1);
		PosCaja.DibujarCaja(Datos.DatosMapa1.c1);
		
		for (int i = 0; i < cords.length; i++) {
			System.out.println(cords[i]);
		}
		
	}
}
