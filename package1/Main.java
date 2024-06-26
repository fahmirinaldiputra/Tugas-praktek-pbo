/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package package1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pegawai: ");
        int jumlahPegawai = scanner.nextInt();
        if (jumlahPegawai < 0) {
            System.out.println("Jumlah pegawai tidak valid");
            return;
        }

        Pegawai[] pegawaiArray = new Pegawai[jumlahPegawai];

        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Masukkan data pegawai ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("NIP: ");
            String nip = scanner.next();
            System.out.print("Golongan (1/2/3): ");
            int golongan = scanner.nextInt();
            System.out.print("Jenis Kelamin (1 (laki laki) / 2 (perempuan) ");
            int jenisKelamin = scanner.nextInt();

            if (golongan < 1 || golongan > 3 || jenisKelamin < 0) {
                System.out.println("Data pegawai tidak valid");
                return;
            }

            if (jenisKelamin == 1 ){
                System.out.print (" laki laki ");
            }else if (jenisKelamin == 2){
                System.out.print(" perempuan ");
            }else {
                System.out.print(" input tidak valid ");
            }

            pegawaiArray[i] = new Pegawai(nama, nip, jenisKelamin, golongan);
        }

        System.out.println("\nDaftar Gaji Pegawai:");
        for (int i = 0; i < jumlahPegawai; i++) {
            Pegawai pegawai = pegawaiArray[i];
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("NIP: " + pegawai.getNip());
            System.out.println("Golongan: " + pegawai.getGolongan());
            System.out.println("Jenis Kelamin: " + pegawai.getJenisKelamin());
            System.out.println("Gaji Pokok: " + pegawai.getGolongan());
            System.out.println("Tunjangan: " + pegawai.getTunjuangan());
            System.out.println("Total Gaji: " + pegawai.getTotal());
            System.out.println();
        }
    }
}

