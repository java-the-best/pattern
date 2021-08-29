package pattern.flyWeight.n3FlyWeight;

import java.util.WeakHashMap;

public class StudentCach {
    private static final WeakHashMap<String, StudentUnivercityInfo> StudentUnivercityInfos = new WeakHashMap<>();

    public StudentUnivercityInfo getStudentUnivercityInfo(String name) {
        StudentUnivercityInfo StudentUnivercityInfo = StudentCach.StudentUnivercityInfos.get(name);
        if (StudentUnivercityInfo == null) {
            StudentUnivercityInfo = createStudentUInfo(name);
            StudentUnivercityInfos.put(name, StudentUnivercityInfo);
        }
        return StudentUnivercityInfo;
    }

    private StudentUnivercityInfo createStudentUInfo(String faculty) {
        switch (faculty) {
            case "informatic":
                return new StudentUnivercityInfo(faculty, "New York", new Hostel());
            case "management":
                return new StudentUnivercityInfo(faculty, "Los Angeles", new Hostel());
            default:
                throw new IllegalArgumentException("no faculty");
        }
    }
}
