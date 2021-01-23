package Model;

public class Jugador {
	
	int contadorllaves;
	char modelo;
	int posx;
	int posy;
	
	
	public Jugador(char modelo,int posx,int posy,int contadorllaves) {
		
		this.modelo=modelo;
		this.posx=posx;
		this.posy=posy;
		this.contadorllaves=contadorllaves;
		
	}


	public char getModelo() {
		return modelo;
	}


	public void setModelo(char modelo) {
		this.modelo = modelo;
	}


	public int getPosx() {
		return posx;
	}


	public void setPosx(int posx) {
		this.posx = posx;
	}


	public int getPosy() {
		return posy;
	}


	public void setPosy(int posy) {
		this.posy = posy;
	}


	public int getContadorllaves() {
		return contadorllaves;
	}


	public void setContadorllaves(int contadorllaves) {
		this.contadorllaves = contadorllaves;
	}
	
	
	
}
