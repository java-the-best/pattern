package pattern.flyWeight.n3FlyWeight;

public class StudentUnivercityInfo {
    private String faculty;
    private String univerCity;
    private Hostel hostelAddress;

    public StudentUnivercityInfo(String faculty, String univerCity, Hostel hostelAddress) {
        this.faculty = faculty;
        this.univerCity = univerCity;
        this.hostelAddress = hostelAddress;
    }
}

class Hostel {}
