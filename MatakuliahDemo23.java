import java.util.Scanner;

public class MatakuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah23[] arrayofMatakuliah23 = new Matakuliah23[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke- " +(i+1));
            System.out.print("Kode :");
            kode  = sc.nextLine();
            System.out.print("Nama :");
            nama  = sc.nextLine();
            System.out.print("SKS :");
            dummy  = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("================");

            arrayofMatakuliah23[i] = new Matakuliah23(kode, nama, sks, jumlahJam);
        }

        for(int i=0; i<3 ; i++){
            System.out.println("Data Matakuliah ke-" +(i+1));
            System.out.println("Kode   :" + arrayofMatakuliah23[i].kode);
            System.out.println("Nama  :" + arrayofMatakuliah23[i].nama);
            System.out.println("SKS   :" + arrayofMatakuliah23[i].sks);
            System.out.println("JumlahJam   :" + arrayofMatakuliah23[i].jumlahJam);
            System.out.println("-----------------------------------");
        }
    }
}
