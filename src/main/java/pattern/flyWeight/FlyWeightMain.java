package pattern.flyWeight;

import pattern.flyWeight.n3FlyWeight.StudentCach;
import pattern.flyWeight.n3FlyWeight.StudentUnivercityInfo;

public class FlyWeightMain {

    public static void main() {
        StudentCach cache = new StudentCach();
        StudentUnivercityInfo mike = cache.getStudentUnivercityInfo("management");
        StudentUnivercityInfo mike2 = cache.getStudentUnivercityInfo("management");
        System.out.println(mike == mike2);
    }
}
