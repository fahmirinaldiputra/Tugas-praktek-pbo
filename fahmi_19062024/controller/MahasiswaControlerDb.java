/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahmi_19062024.controller;

import fahmi_19062024.Dao.MahasiswaDb;
import fahmi_19062024.Mahasiswa.Mahasiswa;
import fahmi_19062024.view.FormMahasiswa1;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class MahasiswaControlerDb {
    FormMahasiswa1 formMahasiswa1;
    Mahasiswa mahasiswa;
    MahasiswaDb mahasiswaDb;
    
    public MahasiswaControlerDb(FormMahasiswa1 formMahasiswa1)
    {
        this.formMahasiswa1 = formMahasiswa1;
        mahasiswaDb = new MahasiswaDb();
    }
    
    public void cancel()
    {  
        formMahasiswa1.getTxtNOBP().setText("");
        formMahasiswa1.getTxtNama().setText("");
        formMahasiswa1.getTxtAlamat().setText("");
        formMahasiswa1.getTxtTglLahir().setText("");
        isiJenisKelamin();
    }
    
    public void isiJenisKelamin()
    {   
        formMahasiswa1.getCboJenisKelamin().removeAllItems();
        formMahasiswa1.getCboJenisKelamin().addItem("L");
        formMahasiswa1.getCboJenisKelamin().addItem("P");
    }
    
    public void insert()
    { 
    try{
        mahasiswa = new Mahasiswa();
        mahasiswa.setNobp(formMahasiswa1.getTxtNOBP().getText());
        mahasiswa.setNama(formMahasiswa1.getTxtNama().getText());
        mahasiswa.setAlamat(formMahasiswa1.getTxtAlamat().getText());
        mahasiswa.setJenisKelamin(formMahasiswa1.getCboJenisKelamin().getSelectedItem().toString());
        mahasiswa.setTglalhir(formMahasiswa1.getTxtTglLahir().getText());
        mahasiswaDb.insert(mahasiswa);
        JOptionPane.showMessageDialog(formMahasiswa1, "Entry Data Ok");
    }catch(Exception ex){
        JOptionPane.showMessageDialog(formMahasiswa1, "Error "+ex.getMessage());
    }
    }
    
    public void viewData()
    {   try{
        DefaultTableModel model = (DefaultTableModel)formMahasiswa1.getTabelMahasiswa().getModel();
        model.setNumRows(0);
        List<Mahasiswa> list = mahasiswaDb.getAllmahasiswa();
        for(Mahasiswa mahasiswa :list)
        {
            Object[] data = 
            {
                mahasiswa.getNobp(),
                mahasiswa.getNama(),
                mahasiswa.getAlamat(),
                mahasiswa.getJenisKelamin(),
                mahasiswa.getTglalhir()
            };
            model.addRow(data);
        }
    }catch (Exception ex){
        Logger.getLogger(MahasiswaControlerDb.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    public  void actionClickTabel(){
        try {
            String nobp = formMahasiswa1.getTabelMahasiswa()
                    .getValueAt(formMahasiswa1.getTabelMahasiswa().getSelectedRow(), 0).toString();
            mahasiswa = mahasiswaDb.getMahasiswa(nobp);
            formMahasiswa1.getTxtNOBP().setText(mahasiswa.getNobp());
            formMahasiswa1.getTxtNama().setText(mahasiswa.getNama());
            formMahasiswa1.getTxtAlamat().setText(mahasiswa.getAlamat());
            formMahasiswa1.getCboJenisKelamin().setSelectedItem(mahasiswa.getJenisKelamin());
            formMahasiswa1.getTxtTglLahir().setText(mahasiswa.getTglalhir());
        } catch (Exception ex) {
            Logger.getLogger(MahasiswaControlerDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update()
    {   try {
        mahasiswa.setNobp(formMahasiswa1.getTxtNOBP().getText());
        mahasiswa.setNama(formMahasiswa1.getTxtNama().getText());
        mahasiswa.setAlamat(formMahasiswa1.getTxtAlamat().getText());
        mahasiswa.setJenisKelamin(formMahasiswa1.getCboJenisKelamin().getSelectedItem().toString());
        mahasiswa.setTglalhir(formMahasiswa1.getTxtTglLahir().getText());
        JOptionPane.showMessageDialog(formMahasiswa1, "Update Data OK");
    } catch(Exception ex){
        Logger.getLogger(MahasiswaControlerDb.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public void delete()
        {   try {
            String nobp = formMahasiswa1.getTabelMahasiswa()
                    .getValueAt(formMahasiswa1.getTabelMahasiswa().getSelectedRow(), 0).toString();
            mahasiswaDb.delete(nobp);
            JOptionPane.showMessageDialog(formMahasiswa1, "Delete Data Ok");   
        } catch (Exception ex){
            Logger.getLogger(MahasiswaControlerDb.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
}


