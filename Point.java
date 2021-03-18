package ligneBrisee;



public class Point {
	private int x;
	private int y;
	private static int compteur; // static veut dire que tout les objets du programme auront la même copie de la variable static
	// il ne faut pas creer de mutateur pour compteur car il met a jours le nombre de points total
	
	public static void main(String[] args) {
		
		
		//Point p = new Point();
		//System.out.println(p.x+" "+p.y);
		// sur la console on lit 0 0 car les variables x et y du point p ne sont pas initialisees

	}
	
	//getteurs ou accesseurs
	
	public int getX() {
		return this.x;
	}
	
	 public int getY() {
		 return this.y;
	 }
	 
	 public int getCompteur() {
		 return Point.compteur;
	 }
	
	 
	 //setteurs ou mutateurs
	 
	 public void setX(int x) {
		 this.x=x;
	 }
	 
	 public void setY(int y) {
		 this.y=y;
	 }
	  
	 //constructeur
	 
	 public Point(int x,int y) {
		 this.x=x;
		 this.y=y;
		 compteur++;// on met a jour le constructeur
	 }
	 
	 //autres methodes

	@Override//montre une message d'erreur dans le compilateur si la methode n'est pas reecrite
	public String toString() {
		return "(" +  this.getX() + "," + this.getY() + ")";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		return super.equals(obj);
		//return (this.x==((Point) obj).getX()&&this.y==((Point) obj).getY());	
		
	}
	public boolean poinEquals(Object obj) {
		// TODO Auto-generated method stub
		
		
		return (this.x==((Point) obj).getX()&&this.y==((Point) obj).getY());	
		
	}
	
	
	
	


}
