package ligneBrisee;

import java.util.HashSet;

public class LigneBriseeHashSet {
	
	 private HashSet<Point> points;
	 
	 // Constructeur
	 public LigneBriseeHashSet() {
		 this.points=new HashSet<Point>();
	 }
	 
	 //getteurs accesseurs
	 public HashSet<Point> getPoints(){
		 return this.points;
	 }
	 //setteurs mutateurs
	 public void setPoints(HashSet<Point> points) {
		 this.points=points;
	 }
	 
	 //autres methodes
	 
	 public boolean contientPoint(Point p) {
		 return this.points.contains(p);
	 }
	 
	 public void addPoint(Point p) {
		 if (!contientPoint(p)) {
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
