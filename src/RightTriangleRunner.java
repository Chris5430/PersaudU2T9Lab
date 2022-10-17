public class RightTriangleRunner {
    public static void main(String[] args){
        RightTriangle Triangle1 = new RightTriangle(3,4);
        RightTriangle Triangle2 = new RightTriangle(6.5,10.7);
        double hypotenuse1 = Triangle1.hypotenuse();
        double hypotenuse2 = Triangle2.hypotenuse();
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);
        RightTriangle Triangle3 = new RightTriangle(9,12);
        RightTriangle Triangle4 = new RightTriangle(34.12,15.6);
        double hypotenuse3 = Triangle3.hypotenuse();
        double hypotenuse4 = Triangle4.hypotenuse();
        System.out.println(hypotenuse3);
        System.out.println(hypotenuse4);
    }
}
