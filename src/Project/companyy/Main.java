package Project.companyy;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Первая точка A
        Point pointA = readPoint("A");
        //Вторая точка B
        Point pointB = readPoint("B");
        //Третья точка C
        Point pointC = readPoint("C");

        Point pointD = findPointD(pointA, pointB, pointC);

        System.out.printf("Координаты точки D:")
        System.out.printf("x = %1$.0f and y = %2$.0f", pointD.x, pointD.y);
    }

    private static Point findPointD(Point pointA, Point pointB, Point pointC)
    {
        double coordinateX = pointA.x + pointC.x - pointB.x;
        double coordinateY = pointA.y + pointC.y - pointB.y;
        return new Point(coordinateX, coordinateY);
    }

    private static Point readPoint(String name)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите координаты точки %s: x = ", name);
        double x = scanner.nextDouble();

        System.out.print("y = ");
        double y = scanner.nextDouble();

        Point point = new Point(x, y);
        return point;
    }
}
