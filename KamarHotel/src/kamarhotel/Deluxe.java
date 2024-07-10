/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kamarhotel;

/**
 *
 * @author acer
 */
//penurunan clas dai superclass
public class Deluxe extends kamarHotel{
    public Deluxe(String tipeKamar, String namaPenyewa, int hargaKamar){
        super(tipeKamar,namaPenyewa,hargaKamar);
    }
     
   
    //    timpa method dari superclass dengan menggunakna geter untuk akses attribute private
    @Override
    public String getTipeKamar(){
        return super.getTipeKamar();
    }
    
    @Override
    public String getNamaPenyewa(){
        return super.getNamaPenyewa();
    }
    
    @Override
    public int getHargaKamar(){
       return super.getHargaKamar();
    }
}
