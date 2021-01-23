package Datos;

import Model.Caja;
import Model.Mapa;

public class DatosMapa1_nuevo {
	
	static int filasmapa1=15;

	static int columnasmapa1=23;
	
	static int posxCaja=16;
	static int posyCaja=12;
	static char modeloCaja='#';
	
	public static char[][] cords= {{'_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_',' '},
								  {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','K','|'},
								  {' ','|','_','_','_','_',' ',' ',' ','_','_',' ',' ',' ','_','_',' ',' ',' ','_','_',' ',' ','|'},
								  {' ','|',' ',' ',' ',' ','|','=','|',' ',' ','|','=','|',' ',' ','|','=','|',' ',' ','|','=','|'},
								  {' ','|',' ',' ',' ',' ','|',' ','|',' ',' ','|',' ','|',' ',' ','|',' ','|',' ',' ','|',' ','|'},
								  {' ','|','_','_','_','_','|',' ','|','_','_','|','=','|','_','_','|',' ','|','_','_','|','=','|'},
								  {' ','|','K','|',' ',' ','|',' ','║',' ','K','║',' ','|',' ',' ','|',' ',' ',' ',' ',' ','K','|'},
								  {' ','|',' ','|',' ',' ','|',' ','║','_','_','║',' ','|',' ',' ','|',' ',' ','_','_',' ',' ','|'},
								  {' ','|',' ','|',' ',' ','|','═','|',' ',' ','|','=','|',' ',' ','|',' ','|',' ',' ','|','=','|'},
								  {' ','|',' ','|',' ',' ','|',' ','|',' ',' ','|',' ','|',' ',' ','|',' ','|',' ',' ','|',' ','|'},
								  {' ','┘',' ','|','_','_','|',' ','|','_','_','|',' ','|','_','_','|','=','|','_','_','|','=','|'},
								  {'|','▄',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
								  {' ','┐','_','_','_','_','_','_','_','_','_',' ',' ',' ','_','_','_','_','_','_','_','_','_','|'},
								  {' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ','|',' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
								  {' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ','|','▒','|',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'}};
	
	public static Mapa map1=new Mapa(cords,filasmapa1,columnasmapa1);
	public static Caja c1=new Caja ( posxCaja, posyCaja, modeloCaja );
}