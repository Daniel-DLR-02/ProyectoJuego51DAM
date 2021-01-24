package Crud;

public class ColisionesMapa1 {
	

	public static boolean [] [] ComprobarHueco(int cordy,int cordx, char cords [][]){ //CRUD

		boolean [] [] Huecos = new boolean [cordy] [cordx];
	
		for (int i = 0; i < cordy; i++) {
			for (int j = 0; j < cordx; j++) {
				if (cords[i][j]=='_' || cords[i][j]=='|' || cords [i][j] == '┘' || cords [i][j] == '=' || cords [i][j] == '┐' || cords [i][j] == '▒'|| cords [i][j] == '╔'|| cords [i][j] == '╗'|| cords [i][j] == '═'|| cords [i][j] == '║'|| cords [i][j] == '▣'|| cords [i][j] == '▢'|| cords [i][j] == '█'|| cords [i][j] == '└'|| cords [i][j] == '┌'|| cords [i][j] == 'O' ) 
					Huecos[i][j]=true;
				else 
					Huecos[i][j]=false;


			}
		}

		return Huecos;
	}
	public static boolean [] [] ColisionesCaja(int cordy,int cordx, char cords [][]){ //CRUD

		boolean [] [] HuecosCaja = new boolean [cordy] [cordx];
	
		for (int i = 0; i < cordy; i++) {
			for (int j = 0; j < cordx; j++) {
				if (cords[i][j]=='_' || cords[i][j]=='|' || cords [i][j] == '┘' || cords [i][j] == '=' || cords [i][j] == '┐' || cords [i][j] == '▒'|| cords [i][j] == '╔'|| cords [i][j] == '╗'|| cords [i][j] == '═'|| cords [i][j] == '║'|| cords [i][j] == '█') 
					HuecosCaja[i][j]=true;
				else 
					HuecosCaja[i][j]=false;
			}
		}
		return HuecosCaja;
	}
	


	
	public static boolean [][] llaves (int cordy, int cordx, char [][] cords) {
			
			boolean [][] obj= new boolean [cordy][cordx];
			
			for (int i = 0; i < cordy; i++) {
				for (int j = 0; j < cordx; j++) {
					if (cords [i][j] == 'K')
						obj[i][j]=true;
					else
						obj[i][j]=false;
				}
			}
			return obj;
	}
	public static boolean [][] puertas (int cordy, int cordx, char [][] cords) {
		
		boolean [][] obj= new boolean [cordy][cordx];
		
		for (int i = 0; i < cordy; i++) {
			for (int j = 0; j < cordx; j++) {
				if (cords [i][j] == '║'||cords[i][j]=='=')
					obj[i][j]=true;
			}
		}
		return obj;
}

}


