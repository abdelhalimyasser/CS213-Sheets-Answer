import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>{
	private String color;
	private boolean filled;
	private Date date;

	public GeometricObject() {
		this.color = "white";
		this.filled = false;
		this.date = new Date();
	}
	
	public GeometricObject(String color, boolean filled, Date date) {
	    this.color = color;
	    this.filled = filled;
	    this.date = date;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public void setDateCreated(Date date) {
		this.date = date;
	}

	public String getColor() {
		return this.color;
	}

	public boolean getFilled() {
		return this.filled;
	}

	public Date getDateCreated() {
		return this.date;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public int compareTo(GeometricObject object) {
		if (this.getArea() > object.getArea()) return 1;
		else if (this.getArea() < object.getArea()) return -1;
		else return 0;
	}

	public static GeometricObject max(GeometricObject object1, GeometricObject object2) {
		return (object1.compareTo(object2) > 0)? object1 : object2;
	}
}
