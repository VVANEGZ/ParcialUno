import java.util.Date;
public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;
    public GeometricObject() {}
    public GeometricObject(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return color + " " + filled + " " + dateCreated;
    }
}
