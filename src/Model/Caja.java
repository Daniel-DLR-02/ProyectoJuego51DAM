package Model;

public class Caja {

	int posx;
	int posy;
	char modelo;
	
	public Caja (int posy, int posx, char modelo) {
		this.posx=posx;
		this.posy=posy;
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
