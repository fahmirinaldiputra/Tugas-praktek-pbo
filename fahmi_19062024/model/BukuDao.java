/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahmi_19062024.model;

import fahmi_19062024.Mahasiswa.Buku;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BukuDao {
    private List<Buku> data = new ArrayList<Buku>();
    
    public BukuDao()
    {
        data.add(new Buku ("100","batman","jack","alex","2003"));
        data.add(new Buku ("101","spiderman","black","white","2004"));
        data.add(new Buku ("101","iron man","big","dick","2002"));
    }
    
    public void insert(Buku b)
    {
        data.add(b);
    }
    
    public void update(int index, Buku b)
    {
        data.set(index, b);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public Buku getBuku(int index)
    {
        return data.get(index);
    }

    public List<Buku> getAllBuku() 
    {
        return data;
    }
}
