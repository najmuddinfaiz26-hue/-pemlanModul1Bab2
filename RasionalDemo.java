//Muhammad Faiz Najmuddin
//255150707111013
public class RasionalDemo {
    public static void main(String[] args) {

        Rasional R1 = new Rasional(1, 2);
        Rasional R2 = new Rasional(1, 3);

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional());
        System.out.println();
        System.out.println("R1 > R2 : " + R1.LebihDari(R2));
        System.out.println();
        System.out.print("R1 : "); R1.cetak();
        System.out.print("R2 : "); R2.cetak();
        System.out.println();
        R1.Sederhana();
        R2.Sederhana();
        System.out.print("R1 : "); R1.cetak();
        System.out.print("R2 : "); R2.cetak();
        System.out.println();
        System.out.println("Setelah dilakukan Cast ke double menjadi : ");
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();

        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();

        R1.unaryPlus(R2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();
        System.out.println();

        // pertanyaan 2 - operator <, <=, >=
        Rasional A = new Rasional(3, 4);
        Rasional B = new Rasional(2, 5);
        System.out.println("A = 3/4, B = 2/5");
        System.out.println("A > B  : " + A.LebihDari(B));
        System.out.println("A < B  : " + A.KurangDari(B));
        System.out.println("A <= B : " + A.KurangDariSamaDengan(B));
        System.out.println("A >= B : " + A.LebihDariSamaDengan(B));
        System.out.println();

        // pertanyaan 3 - demo Sederhana() yang while-nya sudah diganti for
        Rasional r = new Rasional(6, 9);
        System.out.print("sebelum sederhana: "); r.cetak();
        r.Sederhana();
        System.out.print("setelah sederhana: "); r.cetak();
        System.out.println();

      
        Rasional X = new Rasional(3, 4);
        Rasional Y = new Rasional(1, 4);

        Rasional hasilMinus = new Rasional(3, 4);
        hasilMinus.unaryMinus(Y);
        System.out.print("X -= Y (3/4 - 1/4) : "); hasilMinus.cetak();

        Rasional hasilKali = new Rasional(3, 4);
        hasilKali.unaryKali(Y);
        System.out.print("X *= Y (3/4 * 1/4) : "); hasilKali.cetak();

        Rasional hasilBagi = new Rasional(3, 4);
        hasilBagi.unaryBagi(Y);
        System.out.print("X /= Y (3/4 / 1/4) : "); hasilBagi.cetak();

        Rasional zero = new Rasional(0, 1);
        X.unaryBagi(zero);
    }
}
