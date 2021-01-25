package Vista;


import Datos.DatosMapa1;
import Model.Jugador;
import controller.*;

public class DibujoMapa1 {
	
	public static void DibujarMapa( char [][] cords, int cordy, int cordx,Jugador j1) {	//vista
		
		
		PosJugador.DibujarJugador(j1,DatosMapa1.map1);
		PosCaja.DibujarCaja(Datos.DatosMapa1.c1,Datos.DatosMapa1.map1);
		DatosMapa1.map1.cords[DatosMapa1.h1.getPosy()][DatosMapa1.h1.getPosx()]=DatosMapa1.h1.getModelo();
		
		for (int i = 0; i < cords.length; i++) {
			System.out.println(cords[i]);
		}
		

	}



}
