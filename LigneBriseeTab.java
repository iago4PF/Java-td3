package ligneBrisee;

import java.util.Arrays;

public class LigneBriseeTab {
	
	private Point[] points;
	private static int taille=5;
	
	
	//constructeur
	public LigneBriseeTab(Point p1, Point p2) {
		if(this.points==null) {
			points=new Point[taille];
			this.points[0]=p1;
			this.points[1]=p2;
		}else {
		this.points[0]=p1;
		this.points[1]=p2;
		}
	}
	
	//getteurs ou accesseurs
	
	public Point[] getPoint() {
		return points;
	}
	
	// setteur accesseurs
	
	public void setPoints(Point[] points) {
		this.points=points;
	}
	
	
	
	//autres methodes
	
	@Override
	public String toString() {
		
		return "LigneBrisee [points = " + Arrays.toString(points)+ "]";
	}
	
	public boolean contientPoint( Point p){

		boolean check=false;
		for(Point pointVerif : this.getPoint()) {
			if(p.equals(pointVerif)) {
				check=true;
				
			}
		}
		return check;
	}
	
	public void addPoint(Point p) {
		for( int i=0; i<this.getPoint().length; i++) {
			
			if (this.getPoint()[i]==null) {
				this.getPoint()[i]=p;
				break;
			}
		}
		
		
	}
	
	public int nbPoints() {
		int cpt=0;
		
		for(int i=0; i<this.getPoint().length; i++) {
			
			if(this.getPoint()[i]!=null) {
				cpt++;
			}
			
		}
		return cpt;
	
	}
	
	public int nbMaxPoints() {
		return this.getPoint().length-this.nbPoints();
	}
	
	public void deletePoint(Point p) {
		if(this.contientPoint(p)) {
			int index=0;
			for(int i=0; i<this.getPoint().length;i++) {
				
				if (this.getPoint()[i]==p) {
					index=i;
					break;
				}
			}
			
			this.getPoint()[index]=null;
			
			for(int k=index; k+1< this.getPoint().length; k++) {
				
				this.getPoint()[k]=this.getPoint()[k+1];
				this.getPoint()[k+1]=null;
				
			
			}
			
		}else {
			System.out.println("Ce point n'appartient pas à la ligne");
		}
	}
	

}
