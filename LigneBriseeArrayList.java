package ligneBrisee;

import java.util.ArrayList;



public class LigneBriseeArrayList {
	
	private ArrayList<Point> points;
	
	
	// constructeur
	public LigneBriseeArrayList(ArrayList<Point> points) {
		this.points=new ArrayList<Point>();
		
	}
	
	public LigneBriseeArrayList() {
		this.points = new ArrayList<Point>();
		
	}
	
	//accesseurs getteurs
	
	public ArrayList<Point> getPoints(){
		return points;
	}
	
	//mutateurs setteurs
	
	public void setPoints(ArrayList<Point> points) {
		this.points=points;
	}
	
	// Autres methodes
	
	public boolean contientPoint(Point p) {
		return this.points.contains(p);
	}
	
	public void addPoint(Point p) {
		
		if(!contientPoint(p)) {
			this.points.add(p);
		}
		else {
			System.out.println("Ce point existe deja");
		}
		
	}
	public void nbPoints() {
		System.out.println("nb points: " + this.points.size());
	}
	
	public void deletePoint(Point p) {
		this.points.remove(p);
	}

}
