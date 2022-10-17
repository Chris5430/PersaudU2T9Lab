public class CircleRunner {
    public static void main(String[] args){
        Circle one = new Circle(5.0);
        System.out.println(one.getInfo());
        one.setRadius(9.2);
        System.out.println(one.getInfo());
        Circle two = new Circle(6.5);
        System.out.println(two.getInfo());
        two.setRadius(2.5);
        System.out.println(two.getInfo());

        System.out.println(Math.pow(5,3));
    }
}
