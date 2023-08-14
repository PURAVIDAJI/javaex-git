package Challenge;

public class Triangle {

  private double width;
  private double height;

  /*Getter & Setter*/
  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    if (width <= 0) {
      System.out.println("밑변이 0보다 작을 수 없습니다. 다시 입력하세요!");
    } else {
      this.width = width;
    }
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height <= 0) {
      System.out.println("밑변이 0보다 작을 수 없습니다. 다시 입력하세요!");
    } else {
      this.height = height;
    }
  }
 //생성자
  public Triangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
    public double findArea() {
      return width * height * (0.5);
    }

  }

