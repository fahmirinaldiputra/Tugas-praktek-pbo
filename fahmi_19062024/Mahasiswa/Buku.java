/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahmi_19062024.Mahasiswa;

/**
 *
 * @author user
 */
public class Buku {
    private String kode;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun;
    
    public Buku (){
        
    }   

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public Buku(String kode, String judul, String pengarang, String penerbit, String tahun) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
}
}

