package Datos;

import Model.*;

public class DatosMapa1 {
	
	public static int filasmapa1=17;
	public static int columnasmapa1=25;
	
	static int posxCaja=16;
	static int posyCaja=13;
	static char modeloCaja='■';
	
	static int posxBoton=1;
	static int posyBoton=13;
	
	static int posxHoyo=23;
	static int posyHoyo=13;
	static char modeloHoyo='O';
	
	public static int posxPuertafinal=12;
	public static int posyPuertafinal=14;
	
	
	public static int nextlevely=15;
	public static int nextlevelx=12;
	
	public static char letrajugador='A';
	public static int Posyjugador=1;
	public static int Posxjugador=2;
	public static int LlavesIniciales=0;
	
	public static char[][] cords= {{' ','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_',' '},
								   {' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','K','|',' '},
								   {' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|',' '},
								   {' ','|','█','█','█','█','|','=','|','█','█','|','=','|','█','█','|','=','|','█','█','|','=','|',' '},
								   {' ','|','█','█','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|',' '},
								   {' ','|','█','█','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','_','_','|','=','|',' '},
								   {' ','|','_','_','█','█','|',' ','|','_','_','|','=','|','█','█','|',' ',' ',' ',' ',' ',' ','|',' '},
								   {' ','|','K','|','█','█','|',' ',' ',' ','K','║',' ','|','█','█','|',' ',' ',' ',' ',' ','K','|',' '},
								   {' ','|',' ','|','█','█','|',' ',' ',' ',' ','|',' ','|','█','█','|',' ',' ',' ',' ',' ',' ','|',' '},
								   {' ','|',' ','|','█','█','|','=','|','█','█','|','=','|','█','█','|',' ','|','█','█','|','=','|',' '},
								   {' ','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|',' '},
								   {' ','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|','█','█','|',' ','|',' '},
								   {'┌','┘',' ','|','_','_','|',' ','|','_','_','|',' ','|','_','_','|','=','|','_','_','|','=','└','┐'},
								   {'|','▢',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
								   {'└','┐','═','═','═','═','═','═','═','═','═','╗','▒','╔','═','═','═','═','═','═','═','═','═','┌','┘'},
								   {' ','|','█','█','█','█','█','█','█','█','█','║','▼','║','█','█','█','█','█','█','█','█','█','|',' '},
								   {' ','|','█','█','█','█','█','█','█','█','█','║','_','║','█','█','█','█','█','█','█','█','█','|',' '}};
	
	
		public static Mapa map1=new Mapa(cords,filasmapa1,columnasmapa1);
		public static Caja c1=new Caja ( posyCaja,posxCaja, modeloCaja );
	    public static Boton bot1=new Boton(posyBoton,posxBoton);
		public static Hoyo h1= new Hoyo (posyHoyo,posxHoyo,modeloHoyo);
		public static Jugador j1=new Jugador(letrajugador,Posxjugador,Posyjugador,LlavesIniciales);
}
