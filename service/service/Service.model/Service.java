/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

/**
 *
 * @author USER
 */
public class Service {
    private String kode_trans;
    private String tgl_trans;
    private String pelanggan;
    private int jenis_service;
    private int biaya;
    private double diskon;
    private double total;

    public Service() {
    }

    public Service(String kode_trans, String tgl_trans, String pelanggan, int jenis_service, int biaya, double diskon, int total) {
        this.kode_trans = kode_trans;
        this.tgl_trans = tgl_trans;
        this.pelanggan = pelanggan;
        this.jenis_service = jenis_service;
        this.biaya = biaya;
        this.diskon = diskon;
        this.total = total;
    }
    
    

    public String getKode_trans() {
        return kode_trans;
    }

    public void setKode_trans(String kode_trans) {
        this.kode_trans = kode_trans;
    }

    public String getTgl_trans() {
        return tgl_trans;
    }

    public void setTgl_trans(String tgl_trans) {
        this.tgl_trans = tgl_trans;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public int getJenis_service() {
        return jenis_service;
    }

    public void setJenis_service(int jenis_service) {
        this.jenis_service = jenis_service;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
