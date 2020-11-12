/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * NAMA     : Rachman Aldiansyah
 * KELAS    : IF-1
 * NIM      : 10119038
 * Deskripsi Program : Program ini berisi menentukan nilai mahasiswa dengan pendekatan object oriented
 * 
 */

public class Tester {
    public static void main(String[] args) {
        NilaiMahasiswa mhs = new NilaiMahasiswa();
        mhs.setQuiz(60);
        mhs.setUts(80);
        mhs.setUas(75);
        
        System.out.println("QUIZ\t\t= " + mhs.getQuiz());
        System.out.println("UTS\t\t= " + mhs.getUts());
        System.out.println("UAS\t\t= " + mhs.getUas());
        
        mhs.setNilaiAkhir(mhs.hitungNilaiAkhir());
        System.out.println("\nNilai Akhir\t= " + mhs.getNilaiAkhir());
        
        mhs.setIndex(mhs.indexNilai(mhs.getNilaiAkhir()));
        System.out.println("\nIndex\t\t= " + mhs.getIndex());
        
        mhs.setKeterangan(mhs.keteranganIndex(mhs.getIndex()));
        System.out.println("Keterangan\t= ".concat(mhs.getKeterangan()));
    }
}