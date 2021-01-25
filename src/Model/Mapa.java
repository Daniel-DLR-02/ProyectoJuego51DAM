package Model;

public class Mapa {
	
	
	int filas;

	int columnas;
	
	public char [][] cords;

	public Mapa(char [][]cords,int filas,int columnas) {
		this.cords=cords;
		this.filas=filas;
		this.columnas=columnas;
		
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public char[][] getCords() {
		return cords;
	}

	public void setCords(char[][] cords) {
		this.cords = cords;
	}


}
