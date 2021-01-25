package Vista;


import Datos.DatosMapa1;
import Model.Jugador;
import controller.*;

public class DibujoMapa1 {
	
	public static void DibujarMapa( char [][] cords, int cordy, int cordx,Jugador j1) {	//vista
		
		
		PosJugador.DibujarJugador(j1);
		PosCaja.DibujarCaja(Datos.DatosMapa1.c1);
		Datos.DatosMapa1.cords[DatosMapa1.h1.getPosy()][DatosMapa1.h1.getPosx()]=DatosMapa1.h1.getModelo();
		Datos.DatosMapa1.cords[DatosMapa1.r1.getPosy()][DatosMapa1.r1.getPosx()]=DatosMapa1.r1.getModelo();
		
		for (int i = 0; i < cords.length; i++) {
			System.out.println(cords[i]);
		}
		
		/*boolean[][]Hueco1=Crud.ColisionesMapa1.ComprobarHueco(cordy, cordx, cords);
		for (int i = 0; i < cordy; i++) {

			System.out.print("\n");

			for (int j = 0; j < cordx; j++) {
				if(Hueco1[i][j]==true) 
					System.out.print("1");
				else
					System.out.print("0");
			}

		}
		*/

	}



}
