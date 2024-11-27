/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;

/**
 *
 * @author AUSS
 */

import backend.*;

public class TestBackend {
    public static void main (String[] args)
    {
        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
        
        // test insert
        kat1.save();
        kat2.save();
        kat3.save();
        
        // test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        
        // test delete
        kat3.delete();
        
        // test select all
        for(Kategori k : new Kategori().getAll())
        {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
        
        // test search
        for (Kategori k : new Kategori().search("ilmiah"))
        {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
        
    }
}