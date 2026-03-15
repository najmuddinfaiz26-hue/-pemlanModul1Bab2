//Muhammad Faiz Najmuddin
//255150707111013
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();

        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        // pertanyaan 2 - pakai constructor yang ada parameter nilainya
        System.out.println("===================");
        Student budi = new Student("Budi", "Surabaya", 19, 85, 90, 75);
        budi.displayMessage();

        // pertanyaan 3 - statusAkhir sudah dipanggil di dalam displayMessage

        // pertanyaan 4 - input jumlah siswa dari user pakai array
        System.out.println("===================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        Student[] daftarSiswa = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("siswa ke-" + (i + 1));
            System.out.print("nama    : "); String nama = scanner.nextLine();
            System.out.print("alamat  : "); String alamat = scanner.nextLine();
            System.out.print("umur    : "); int umur = scanner.nextInt();
            System.out.print("math    : "); int math = scanner.nextInt();
            System.out.print("english : "); int english = scanner.nextInt();
            System.out.print("science : "); int science = scanner.nextInt();
            scanner.nextLine();

            daftarSiswa[i] = new Student(nama, alamat, umur);
            daftarSiswa[i].setMath(math);
            daftarSiswa[i].setEnglish(english);
            daftarSiswa[i].setScience(science);
        }

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("===================");
            daftarSiswa[i].displayMessage();
        }

        // pertanyaan 5 - tampilkan jumlah objek
        Student.jumlahObjek();

        scanner.close();
    }
}
