package src.com.object.in.java;

/**
 * Created by Khanh Tran on 12/15/2016.
 */
public class ColorObject {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorObject(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
