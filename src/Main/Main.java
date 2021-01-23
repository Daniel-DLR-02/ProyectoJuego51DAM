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
		int cordx=DatosMapa1.columnasmapa1, cordy=DatosMapa1.filasmapa1;
		char letrajugador='A';
		Jugador pred;
		boolean [][] llaves=ColisionesMapa1.llaves(cordy,cordx,DatosMapa1.map1.getCords());
		pred=new Jugador(letrajugador,2,1,0);
		
		
		while(true) {
			System.out.println("Contador:"+pred.getContadorllaves());
			DibujoMapa1.DibujarMapa(DatosMapa1.map1.getCords(), cordy, cordx,pred);
			char op;
			op=Leer.datoChar();
			PosJugador.PosUpdate(pred,op);
			if(llaves[pred.getPosy()][pred.getPosx()]) {
				pred.setContadorllaves(pred.getContadorllaves()+1);
				llaves[pred.getPosy()][pred.getPosx()]=false;
				}
			if(DatosMapa1.c1.getPosx()==1 && DatosMapa1.c1.getPosy()==11) 
				Interacciones.EventoBotonActivado(DatosMapa1.cords, 12, 12);
			
		}
	
		
		
	}

}
