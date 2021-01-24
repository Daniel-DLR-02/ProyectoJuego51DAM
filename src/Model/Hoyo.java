package Model;

public class Hoyo {
	
	int posx,posy;
	char modelo;
	
	public Hoyo(int posy,int posx,char modelo){
		
		this.posy=posy;
		this.posx=posx;
		this.modelo=modelo;
		
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

	public char getModelo() {
		return modelo;
	}

	public void setModelo(char modelo) {
		this.modelo = modelo;
	}
}
