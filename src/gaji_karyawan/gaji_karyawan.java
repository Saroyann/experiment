package gaji_karyawan;
import java.util.Scanner;

public class gaji_karyawan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("nama karyawan : ");
        String nama_karyawan = sc.nextLine();

        System.out.println("masukkan golongan karyawan : ");
        String golongan = sc.nextLine();

        System.out.println("masukkan jumlah jam kerja karyawan : ");
        int jam_kerja = sc.nextInt();

        if(golongan.equals("a")) {
        int upah = 5000;
        if (jam_kerja >= 48) {
            int upah_lembur = (jam_kerja - 48)*4000;
            int gaji = upah * jam_kerja + upah_lembur;

            System.out.println("nama : " + nama_karyawan);
            System.out.println("gaji : " + gaji);
        } else {
            int upah_lembur = 0;
            int gaji = upah * jam_kerja + upah_lembur;
            System.out.println("nama : " + nama_karyawan);
            System.out.println("gaji : " + gaji);
        }

        } else if(golongan.equals("b")) {
            int upah = 7000;

            if (jam_kerja >= 48) {
                int upah_lembur = (jam_kerja - 48)*4000;
                int gaji = upah * jam_kerja + upah_lembur;

                System.out.println("nama : " + nama_karyawan);
                System.out.println("gaji : " + gaji);
            } else {
                int upah_lembur = 0;
                int gaji = upah * jam_kerja + upah_lembur;
                System.out.println("nama : " + nama_karyawan);
                System.out.println("gaji : " + gaji);
            }
        } else if(golongan.equals("c")) {
            int upah = 8000;

            if (jam_kerja >= 48) {
                int upah_lembur = (jam_kerja - 48)*4000;
                int gaji = upah * jam_kerja + upah_lembur;

                System.out.println("nama : " + nama_karyawan);
                System.out.println("gaji : " + gaji);
            } else {
                int upah_lembur = 0;
                int gaji = upah * jam_kerja + upah_lembur;
                System.out.println("nama : " + nama_karyawan);
                System.out.println("gaji : " + gaji);
            }
        } else if(golongan.equals("d")) {
            int upah = 10000;

            if (jam_kerja >= 48) {
                int upah_lembur = (jam_kerja - 48)*4000;
                int gaji = upah * jam_kerja + upah_lembur;

                System.out.println("nama : " + nama_karyawan);
                System.out.println("gaji : " + gaji);
            } else {
                int upah_lembur = 0;
                int gaji = upah * jam_kerja + upah_lembur;
                System.out.println("nama : " + nama_karyawan);
                System.out.println("gaji : " + gaji);
            }
        } else {
            System.out.println("anda menginput golongan yang salah");
        }

    }



}
