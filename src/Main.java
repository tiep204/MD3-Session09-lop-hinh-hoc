import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        System.out.printf("Moi ban nhập bán kính hình tròn: ");
        circle.setRadius(Double.parseDouble(sc.nextLine()));
        System.out.println("Mời bạn nhập chiều dài hình chữ nhật: ");
        rectangle.setHeight(Double.parseDouble(sc.nextLine()));
        System.out.println("Mời bạn nhập chiều rộng hình chữ nhật: ");
        rectangle.setWidth(Double.parseDouble(sc.nextLine()));
        System.out.println("diện tích hình chữ nhật là: " + rectangle.getArea() + " có màu là " + rectangle.displayData());
        System.out.println("diện tích hình tròn là: 🙈🙈🙈" + circle.getArea() + " có màu là: " + circle.displayData());
    }
}