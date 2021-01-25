package Main;
import Model.Jugador;
import Vista.DibujoMapa1;
import Vista.DibujoMapa2;
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
		int op=0;
		
		
		
	
		
		
		do {
			System.out.println("1. Comenzar partida");
			op=Leer.datoInt();
			
			switch (op) {
			
				case 1: 
					do {
						
						switch (op) {
						case 1:
							System.out.println("Contador llaves:"+pred.getContadorllaves());
							DibujoMapa1.DibujarMapa(DatosMapa1.map1.getCords(), DatosMapa1.filasmapa1,DatosMapa1.columnasmapa1,pred);
							//DibujoMapa2.DibujarMapa(DatosMapa2.map2.getCords(), DatosMapa2.filasmapa2, DatosMapa2.columnasmapa2, pred);
							accion=Leer.datoChar();
							PosJugador.PosUpdate(pred,accion);
							if(DatosMapa1.c1.getPosx()==DatosMapa1.bot1.getPosx() && DatosMapa1.c1.getPosy()==DatosMapa1.bot1.getPosy()) 
								Interacciones.EventoBotonActivado(DatosMapa1.cords, DatosMapa1.posyPuertafinal,DatosMapa1.posxPuertafinal);
							if(DatosMapa1.c1.getPosx()==DatosMapa1.h1.getPosx() && DatosMapa1.c1.getPosy()==DatosMapa1.h1.getPosy()) 
								Interacciones.EventoHoyoTapado(DatosMapa1.cords);
						

						 
	
					
						/*	DibujoMapa1.DibujarMapa(DatosMapa1.map1.getCords(), DatosMapa1.filasmapa1,DatosMapa1.columnasmapa1,pred);
							//DibujoMapa2.DibujarMapa(DatosMapa2.map2.getCords(), DatosMapa2.filasmapa2, DatosMapa2.columnasmapa2, pred);
							accion=Leer.datoChar();
							PosJugador.PosUpdate(pred,accion);
							if(DatosMapa1.c1.getPosx()==DatosMapa1.bot1.getPosx() && DatosMapa1.c1.getPosy()==DatosMapa1.bot1.getPosy()) 
								Interacciones.EventoBotonActivado(DatosMapa1.cords, DatosMapa1.posyPuertafinal,DatosMapa1.posxPuertafinal);
					
							if(DatosMapa1.c1.getPosx()==DatosMapa1.h1.getPosx() && DatosMapa1.c1.getPosy()==DatosMapa1.h1.getPosy()) 
								Interacciones.EventoHoyoTapado(DatosMapa1.cords);*/
						
							
						
						}
			
					}while(op!=0);
			
			
			}
		}while (op!=7);
			

				
				
				
		
	
		
		
	}

}
