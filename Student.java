//Muhammad Faiz Najmuddin
//255150707111013
public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade, englishGrade, scienceGrade;
    private double average;

   
    private static int objectCount = 0;

    public Student() {
        name = ""; address = ""; age = 0;
        objectCount++;
    }

    public Student(String n, String a, int ag) {
        name = n; address = a; age = ag;
        objectCount++;
    }

   
    public Student(String n, String a, int ag, double math, double english, double science) {
        name = n; address = a; age = ag;
        mathGrade = math; englishGrade = english; scienceGrade = science;
        objectCount++;
    }

    public void setName(String n) { name = n; }
    public void setAddress(String a) { address = a; }
    public void setAge(int ag) { age = ag; }
    public void setMath(int math) { mathGrade = math; }
    public void setEnglish(int english) { englishGrade = english; }
    public void setScience(int science) { scienceGrade = science; }

    private double getAverage() {
        return (mathGrade + scienceGrade + englishGrade) / 3;
    }

    
    public boolean statusAkhir() {
        return getAverage() >= 61;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        System.out.println("status akhir : " + (statusAkhir() ? "lulus" : "remidi"));
    }
    
    public static void jumlahObjek() {
        System.out.println("jumlah objek yang dibuat: " + objectCount);
    }
}
