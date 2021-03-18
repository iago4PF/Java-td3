package ligneBrisee;

import java.util.LinkedList;

public class LigneBriseeLinkedList {
	
	private LinkedList<Point> points;
	
	//Constructeur
	public LigneBriseeLinkedList() {
		this.points = new LinkedList<Point>();
	}
	
	//getter et setter
	
	public LinkedList<Point> getPoints(){
		return this.points;
	}
	public void setPoints(LinkedList<Point> points) {
		this.points=points;
	}
	
	//Autres methodes
	
	public boolean contientPoint(Point p) {
		return this.points.contains(p);
	}
	
	public void addPoint(Point p) {
		if(!this.contientPoint(p)) {
			this.points.add(p);
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
