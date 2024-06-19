/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahmi_19062024.controller;

import fahmi_19062024.Mahasiswa.Buku;
import fahmi_19062024.Dao.BukuDb;
import fahmi_19062024.view.FormBuku;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class BukuControlerDb {
    FormBuku formBuku;
    Buku buku;
    BukuDb bukuDb;
    
    public BukuControlerDb(FormBuku formBuku){
        this.formBuku = formBuku;
        bukuDb = new BukuDb();
        
    }
    
        public void cancel()
    {   
        formBuku.getTxtkode().setText("");
        formBuku.getTxtjudul().setText("");
        formBuku.getTxtpengarang().setText("");
        formBuku.getTxtpenerbit().setText("");
        formBuku.getTxttahun().setText("");
        
    }
    
    public void insert()
    {
    try{
        buku = new Buku();
        buku.setKode(formBuku.getTxtkode().getText());
        buku.setJudul(formBuku.getTxtjudul().getText());
        buku.setPengarang(formBuku.getTxtpengarang().getText());
        buku.setPenerbit(formBuku.getTxtpenerbit().getText());
        buku.setTahun(formBuku.getTxttahun().getText());
        bukuDb.insert(buku);
        JOptionPane.showMessageDialog(formBuku, "Entry Data Ok");
    }catch(Exception ex){
        JOptionPane.showMessageDialog(formBuku, "Error "+ex.getMessage());
    }
    }
    
    public void viewData()
    {   
    try{
        DefaultTableModel model = (DefaultTableModel)formBuku.getTabelBuku().getModel();
        model.setNumRows(0);
        List<Buku> list = bukuDb.getAllbuku();
        for(Buku buku :list)
        {
            Object[] data = 
            {
                buku.getKode(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit(),
                buku.getTahun()
            };
            model.addRow(data);
        }
        }catch (Exception ex){
        Logger.getLogger(BukuControlerDb.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public  void actionClickTabel(){
        try {
            String kode = formBuku.getTabelBuku()
                    .getValueAt(formBuku.getTabelBuku().getSelectedRow(), 0).toString();
            buku = bukuDb.getBuku(kode);
            formBuku.getTxtkode().setText(buku.getKode());
            formBuku.getTxtjudul().setText(buku.getJudul());
            formBuku.getTxtpengarang().setText(buku.getPengarang());
            formBuku.getTxtpenerbit().setText(buku.getPenerbit());
            formBuku.getTxttahun().setText(buku.getTahun());   
        } catch (Exception ex) {
            Logger.getLogger(BukuControlerDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update()
    {  
    try{
        buku.setKode(formBuku.getTxtkode().getText());
        buku.setJudul(formBuku.getTxtjudul().getText());
        buku.setPengarang(formBuku.getTxtpengarang().getText());
        buku.setPenerbit(formBuku.getTxtpenerbit().getText());
        buku.setTahun(formBuku.getTxttahun().getText());
        JOptionPane.showMessageDialog(formBuku, "Update Data OK");
    }catch(Exception ex){
        Logger.getLogger(BukuControlerDb.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public void delete(){
        try {
            String kode = formBuku.getTabelBuku()
                    .getValueAt(formBuku.getTabelBuku().getSelectedRow(), 0).toString();
            bukuDb.delete(kode);
            JOptionPane.showMessageDialog(formBuku, "Delete Data Ok");   
        } catch (Exception ex){
            Logger.getLogger(BukuControlerDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
