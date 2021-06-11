package jeuPerso;
/**
 * classe modelisant un labyrinthe de 16 largeur par 16 de longueur
 */
public class Labyrinthe {

/**
 * attributs de Labyrinthe qui represente un tableau 2d de type entier
 */
	private int[][] labyrinthe;

/**
 * constructeur vide
 *
 **/
	public Labyrinthe() {
		int[][] lab = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,3,0,0,0,0,0,0,0,0,0,0,0,0,3,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,2,0,0,0,0,0,0,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
			{1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,0,0,2,0,0,1,0,0,0,1,1,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};
		this.labyrinthe = lab;
	}

	public Labyrinthe(String level) {

		int[][]	lab1={
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
			{1,1,1,1,1,1,0,0,0,0,0,0,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};

		int[][] lab2={
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1},
			{1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1},
			{1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};

		int[][] lab3={
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};

		int[][] lab4={
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};

		int[][] lab5 ={
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
		};

		switch (level){
			default:
			case "lvl 1":
				this.labyrinthe = lab1; break;
			case "lvl 2":
				this.labyrinthe = lab2; break;
			case "lvl 3":
				this.labyrinthe = lab3; break;
			case "lvl 4":
				this.labyrinthe = lab4; break;
			case "lvl 5":
				this.labyrinthe = lab5; break;
		}

	}

	/**
	 *@param x coordonnees du personnage en abscisse
	 * @param y coordonnes du personnage en ordonne
	 * @return retourne un entier qui correspond a :
	 *  - 0 libre
	 *  - 1 mur
	 *  - 2 case de teleportation
	 *  - 3 case de degats
	 *  - 4 Troll
	 *  - 5 Fantome
	 */
	public int getEmplacement(int x, int y) {
		int res = 0;
		if(this.labyrinthe[x][y] == 0)
			res= 0;

		if(this.labyrinthe[x][y] == 1)
			res = 1;

		if(this.labyrinthe[x][y] == 2)
			res = 2;

		if(this.labyrinthe[x][y] == 3)
			res = 3;
		
		if(this.labyrinthe[x][y] == 4)
			res = 4;
		
		if(this.labyrinthe[x][y] == 5)
			res = 5;
		

		return res;
	}


	/**
	 * Methode permettant au joueur de se teleporter en 13 - 13
	 */
	public void teleportation(Personnage p){
		p.x = 13;
		p.y = 13;
	}


	/**
	 * Getter de labyrinthe
	 * @return retourne un tableau a deux dimension
	 */

	public int[][] getLabyrinthe(){
		return this.labyrinthe;
	}


	/**
	 * Getter de Labyrinthe
	 * @return retourne la taille du labyrinthe
	 */
	public int getTaille(){
		return this.labyrinthe.length;
	}
	/**
	 * 
	 */
	public void setLabyrinthe(int x, int y, int num) {
		this.labyrinthe[x][y] = num;
	}
}
