public class Prastakat {
    private float length = 1.0f;
    private float width = 1.0f;

    public Prastakat(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getPerimeter(){
        return (width + length)*2;
    }

    public double getArea(){
        return width * length;
    }

    @Override
    public String toString() {
        return "Prastakat{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
