public class Rectangle extends Shape{

    Rectangle(Color color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void colorIt() {
      System.out.print("Rectangle filled with ");
      color.fillColor();
    }
    
}
