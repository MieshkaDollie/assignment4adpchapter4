package softwaredesignprinciples;

public class OpenClosePrincipleGood {
}

// Open-Close Principle - Good example
class GraphicEditor1 {
    public void drawShape(Shape1 s) {
        s.draw();
    }
}

abstract class Shape1 {
    abstract void draw();
}

class Rectangle1 extends Shape1  {
    public void draw() {
        // draw the rectangle
    }
}
