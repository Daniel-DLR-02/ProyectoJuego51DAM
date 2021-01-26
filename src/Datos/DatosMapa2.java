package Datos;

import Model.Boton;
import Model.Caja;
import Model.Hoyo;
import Model.Jugador;
import Model.Mapa;

public class DatosMapa2 {

	public static int filasmapa2=15;

	public static int columnasmapa2=25;
	
	static int posxCaja=16;
	static int posyCaja=11;
	static char modeloCaja='■';
	
	static int posxBoton=23;
	static int posyBoton=11;
	
	static int posxHoyo=2;
	static int posyHoyo=11;
	static char modeloHoyo='O';
	
	public static int posxPuertafinal=12;
	public static int posyPuertafinal=12;
	
	public static char letrajugador='A';
	public static int Posyjugador=1;
	public static int Posxjugador=2;
	public static int LlavesIniciales=0;
	
	public static int nextlevely=13;
	public static int nextlevelx=12;
	
	public static char[][] cords=	{{' ','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_',' ',' '},
			  						{' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','K',' ',' ',' ',' ',' ','|',' '},
			  						{' ','|','█','█','█','█','█','█','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|',' '},
			  						{' ','|','█','K','█','█','█','█','|','█','█','|',' ','|','█','█','|','=','|','█','█','|','=','|',' '},
			  						{' ','|','█',' ','█','█','█','█','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|',' '},
			  						{' ','|','█',' ','█','█','█','█','|','█','█','|','=','|','█','█','|',' ','|','█','█','|',' ','|',' '},
			  						{' ','|','█',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|','█','█','|',' ',' ',' ',' ',' ','K','|',' '},
			  						{' ','|','█','█','█','█','|',' ','|','█','█','|',' ','|','█','█','|','=','|','█','█','|',' ','|',' '},
			  						{' ','|','█','█','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|',' '},
			  						{' ','|','█','█','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|',' '},
			  						{' ','|','█','█','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|','=','└','┐'},
			  						{' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','▢','|'},
			  						{' ','|','═','═','═','═','═','═','═','═','═','╗','▒','╔','═','═','═','═','═','═','═','═','┌','┌','┘'},
			  						{' ','|','█','█','█','█','█','█','█','█','█','║','▼','║','█','█','█','█','█','█','█','█','█','|',' '},
			  						{' ','|','█','█','█','█','█','█','█','█','█','║','_','║','█','█','█','█','█','█','█','█','█','|',' '}};
	
		

	
	public static Mapa map2=new Mapa(cords,filasmapa2,columnasmapa2);
	public static Caja c1=new Caja ( posyCaja,posxCaja, modeloCaja );
	public static Boton bot1=new Boton(posyBoton,posxBoton);
	public static Hoyo h1= new Hoyo (posyHoyo,posxHoyo,modeloHoyo);
	public static Jugador j1=new Jugador(letrajugador,Posxjugador,Posyjugador,LlavesIniciales);
	
	
	
}
