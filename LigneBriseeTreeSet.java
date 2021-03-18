package ligneBrisee;


import java.util.TreeSet;

public class LigneBriseeTreeSet {
	
	private TreeSet<Point> points;
	
	//Constructeur
	
	public LigneBriseeTreeSet() {
		this.points=new TreeSet<Point>();
	}
	
	//getters et setters
	
	public TreeSet<Point> getPoints(){
		return points;
	}
	
	public void setPoints(TreeSet<Point> points) {
		this.points=points;
	}
	
	
	//Autres methodes
	/*
	public boolean contientPoint(Point p) {
		return this.points.contains(p);
	}
	public void addPoint(Point p) {
		if(!this.contientPoint(p)) {
			this.points.add(p);
		}else {
			System.out.println("Ce point existe deja");
		}
	*/

	public void nbPoints() {
		System.out.println("nb points : "+ this.points.size());
	}
	/*
	public void deletePoint(Point p) {
		this.points.remove(p);
	}
	*/
	

}
