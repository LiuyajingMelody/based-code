package cn.itcast.melody.java.Demo04;
import java.util.Scanner;

public class areaDemo1 {
    public static void main(String[] args) {
        System.out.println("计算平面图形的周长和面积");
        System.out.println("请选择你要计算的平面图形类型：1表示长方形，2表示正方形，3表示圆");
        Scanner sc = new Scanner(System.in);
        int sign = sc.nextInt();
        if (sign == 1) {
            System.out.println("请输入长方形的长");
            Scanner sc1 = new Scanner(System.in);
            int length = sc1.nextInt();
            System.out.println("请输入长方形的宽");
            Scanner sc2 = new Scanner(System.in);
            int wide = sc2.nextInt();
            System.out.println("该长方形的面积为" + getArea(length, wide));
            System.out.println("该长方形的周长为" + getGirth(length, wide));
        }
        if (sign == 2) {
            System.out.println("请输入正方形的边长");
            Scanner sc3 = new Scanner(System.in);
            int lengthSide = sc3.nextInt();
            System.out.println("该正方形的面积为" + getArea(lengthSide));
            System.out.println("该正方形的周长为" + getGirth(lengthSide));
        }
        if (sign == 3) {
            System.out.println("请输入圆的半径");
            Scanner sc4 = new Scanner(System.in);
            double radius = sc4.nextInt();
            System.out.println("该圆的面积为" + getArea(radius));
            System.out.println("该圆的周长为" + getGirth(radius));
        }
    }

    // 方法的定义以及重载的使用
    public static int getArea(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int getArea(int a) {
        int result = a*a;
        return result;
    }

    public static double getArea(double a) {
        double result = 3.14 * a * a;
        return result;
    }

    public static int getGirth(int a, int b) {
        int result = 2*(a+b);
        return result;
    }

    public static int getGirth(int a) {
        int result = 4 * a;
        return result;
    }

    public static double getGirth(double a) {
        double result = 2 * 3.14 * a;
        return result;
    }
}





