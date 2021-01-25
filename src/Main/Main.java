package Main;
import Vista.DibujoMapa1;
import Vista.DibujoMapa2;
import controller.PosJugador;
import utilidades.Leer;
import Datos.*;




import Crud.*;

public class Main {


	public static void main(String[] args) {
		
		char accion = 0;
		int nivel=1;
		int op=0;
		
		
		do {
			System.out.println("1. Comenzar partida");
			op=Leer.datoInt();
			
			switch (op) {
						
			
				case 1:
					
						
					do {
						if (nivel == 1) {
							
							System.out.println("Contador llaves:" + DatosMapa1.j1.getContadorllaves());
							DibujoMapa1.DibujarMapa(DatosMapa1.map1.getCords(), DatosMapa1.filasmapa1,
									DatosMapa1.columnasmapa1, DatosMapa1.j1);

							accion = Leer.datoChar();
							PosJugador.PosUpdate(DatosMapa1.j1, DatosMapa1.c1, accion, DatosMapa1.map1);
							if (DatosMapa1.c1.getPosx() == DatosMapa1.bot1.getPosx()
									&& DatosMapa1.c1.getPosy() == DatosMapa1.bot1.getPosy())
								Interacciones.EventoBotonActivado(DatosMapa1.map1.cords, DatosMapa1.posyPuertafinal,
										DatosMapa1.posxPuertafinal,DatosMapa1.c1);
							if (DatosMapa1.c1.getPosx() == DatosMapa1.h1.getPosx()
									&& DatosMapa1.c1.getPosy() == DatosMapa1.h1.getPosy())
								Interacciones.EventoHoyoTapado(DatosMapa1.h1);
							if (DatosMapa1.j1.getPosy() == DatosMapa1.nextlevely
									&& DatosMapa1.j1.getPosx() == DatosMapa1.nextlevelx)
								nivel=2;
							
						}
						if (nivel == 2) {
							System.out.println("Contador llaves:" + DatosMapa2.j1.getContadorllaves());
							DibujoMapa2.DibujarMapa(DatosMapa2.map2.getCords(), DatosMapa2.filasmapa2,
									DatosMapa2.columnasmapa2, Datos.DatosMapa2.j1);
							accion = Leer.datoChar();
							PosJugador.PosUpdate(DatosMapa2.j1, DatosMapa2.c1, accion, DatosMapa2.map2);
							if (DatosMapa2.c1.getPosx() == DatosMapa2.bot1.getPosx()
									&& DatosMapa2.c1.getPosy() == DatosMapa2.bot1.getPosy())
								Interacciones.EventoBotonActivado(DatosMapa2.map2.cords, DatosMapa2.posyPuertafinal,
										DatosMapa2.posxPuertafinal,DatosMapa2.c1);
							if (DatosMapa2.c1.getPosx() == DatosMapa2.h1.getPosx()
									&& DatosMapa2.c1.getPosy() == DatosMapa2.h1.getPosy())
								Interacciones.EventoHoyoTapado(DatosMapa2.h1);
							if (DatosMapa2.j1.getPosy() == DatosMapa2.nextlevely
									&& DatosMapa2.j1.getPosx() == DatosMapa2.nextlevelx)
								nivel = 3;
							
						}
					
					} while (accion != 'q');
					
					break;
					
				}
			
			}while(op!=0);
			
		

	}
}
