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
 * Deskripsi Program : Program ini berisi class NilaiMahasiswa
 * 
 */

public class NilaiMahasiswa {
    private double quiz, uts, uas, nilaiAkhir;
    private char index;
    private String keterangan;
    
    public NilaiMahasiswa() {
        this.quiz = 0;
        this.uts = 0;
        this.uas = 0;
        this.nilaiAkhir = 0;
        this.index = '/';
        this.keterangan = "/";
    }
    
    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }
    
    public double getQuiz() {
        return quiz;
    }
    
    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public double getUts() {
        return uts;
    }
    
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double getUas() {
        return uas;
    }
    
    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
    
    public double hitungNilaiAkhir() {
        return (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
    }
    
    public void setIndex(char index) {
        this.index = index;
    }
    
    public char getIndex() {
        return index;
    }
    
    public char indexNilai(double nilaiAkhir) {
        if (nilaiAkhir >= 80 && nilaiAkhir <=100) {
            return 'A';
        } else if (nilaiAkhir >= 68 && nilaiAkhir < 80) {
            return 'B';
        } else if (nilaiAkhir >= 56 && nilaiAkhir < 68) {
            return 'C';
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 56) {
            return 'D';
        } else {
            return 'E';
        }
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public String keteranganIndex(char index) {
        switch(index) {
            case 'A': return "Sangat Baik";
            case 'B': return "Baik"; 
            case 'C': return "Cukup"; 
            case 'D': return "Kurang";
            case 'E': return "Sangat Kurang";
            default: return "/";
        }
    }
}