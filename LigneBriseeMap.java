package ligneBrisee;

import java.util.HashMap;

public class LigneBriseeMap {
	
	private HashMap<Point,String> points;
	
	
	// Constructeur
	
	public LigneBriseeMap() {
		this.points=new HashMap<Point,String>();
	}
	
	//getters et setters
	
	public HashMap<Point,String> getPoints(){
		return this.points;
	}
	
	public void setPoints(HashMap<Point,String> points) {
		this.points=points;
	}
	
	//Autres methodes
	
	public boolean contientPoint(Point p) {
		return this.points.containsKey(p);
	}
	public void addPoint(Point p) {
		if(!this.contientPoint(p)) {
			this.points.put(p,"Point");
		}else {
			System.out.println("Ce point existe deja");
		}
	}

	public void nbPoints() {
		System.out.println("nb points : "+ this.points.size());
	}
	
	public void deletePoint(Point p) {
		this.points.remove(p);
	}

}
