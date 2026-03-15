//Muhammad Faiz Najmuddin
//255150707111013
public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    public boolean isRasional() {
        return (penyebut != 0);
    }

    public void Sederhana() {
        if (penyebut == 0) return;
        int A = Math.abs(pembilang);
        int B = Math.abs(penyebut);
        for (int temp = 0; B != 0; B = temp) {
            temp = A % B;
            A = B;
        }
        pembilang /= A;
        penyebut /= A;
    }

    public double Cast() {
        return (penyebut == 0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    
    public boolean LebihDari(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public boolean KurangDari(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean KurangDariSamaDengan(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean LebihDariSamaDengan(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    public void negasi() {
        pembilang = -pembilang;
    }

    // +=
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
        Sederhana();
    }

    // pertanyaan 4 - tambah -, *, /
    public void unaryMinus(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
        Sederhana();
    }

    public void unaryKali(Rasional A) {
        pembilang *= A.pembilang;
        penyebut *= A.penyebut;
        Sederhana();
    }

    public void unaryBagi(Rasional A) {
        if (A.pembilang == 0) {
            System.out.println("tidak bisa bagi dengan nol");
            return;
        }
        pembilang *= A.penyebut;
        penyebut *= A.pembilang;
        Sederhana();
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
