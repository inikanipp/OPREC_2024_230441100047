/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kamarhotel;


public class kamarHotel {
    private String tipeKamar, namaPenyewa;
    private int hargaKamar ;
    
    public kamarHotel(String tipeKamar, String namaPenyewa, int hargaKamar){
        this.tipeKamar = tipeKamar;
        this.namaPenyewa = namaPenyewa;
        this.hargaKamar = hargaKamar;
    }
    
    public void setTipeKamar(String a){
        this.tipeKamar = a;
    }
    
    public void setNamaPenyewa(String a){
        this.namaPenyewa = a;
    }
    
    public void setHargaKamar(int a){
        this.hargaKamar = a;
    }
    
    public String getTipeKamar(){
        return tipeKamar;
    }
    
    public String getNamaPenyewa(){
        return namaPenyewa;
    }
    
    public int getHargaKamar(){
        return hargaKamar;
    }
}
