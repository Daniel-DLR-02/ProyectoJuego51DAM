package Main;
import Model.Jugador;
import Vista.DibujoMapa1;
import controller.PosJugador;
import utilidades.Leer;
import Datos.*;
import Crud.*;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char accion;
		char letrajugador='A';
		Jugador pred;
		pred=new Jugador(letrajugador,2,1,0);
		boolean partida=true;
		
		while(partida) {
			System.out.println("Contador llaves:"+pred.getContadorllaves());
			DibujoMapa1.DibujarMapa(DatosMapa1.map1.getCords(), DatosMapa1.filasmapa1,DatosMapa1.columnasmapa1,pred);
			accion=Leer.datoChar();
			PosJugador.PosUpdate(pred,accion);
			if(DatosMapa1.c1.getPosx()==DatosMapa1.bot1.getPosx() && DatosMapa1.c1.getPosy()==DatosMapa1.bot1.getPosy()) 
				Interacciones.EventoBotonActivado(DatosMapa1.cords, DatosMapa1.posyPuertafinal,DatosMapa1.posxPuertafinal);
			
		}
	
		
		
	}

}
