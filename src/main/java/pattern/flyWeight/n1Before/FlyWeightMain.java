package pattern.flyWeight.n1Before;

public class FlyWeightMain {

    public static void main() {
        StudentCach cache = new StudentCach();
        Student mike = cache.getStudent("Mike");
        Student mike2 = cache.getStudent("Mike");
        System.out.println(mike == mike2);
    }
}
