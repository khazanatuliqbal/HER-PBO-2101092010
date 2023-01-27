/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.Service;
import mvc.model.ServiceDao;
import mvc.model.ServiceDaoImpl;
import mvc.view.FormService;

/**
 *
 * @author USER
 */
public class ServiceController {
    FormService view;
    Service model;
    ServiceDao dao;
    int index;

    public ServiceController(FormService view) {
        this.view = view;
        dao = new ServiceDaoImpl();
    }
    
     public void clearForm(){
        view.getTxtKode().setText("");
        view.getTxtTgl().setText("");
        view.getTxtBiaya().setText("");
        view.getTxtDiskon().setText("");
        view.getTxtJenis().setText("");
        view.getTxtTotal().setText("");
        view.getTxtPelanggan().setText("");
    }
    
    public void insert(){
        model = new Service();
        model.setKode_trans(view.getTxtKode().getText());
        model.setTgl_trans(view.getTxtTgl().getText());
        model.setPelanggan(view.getTxtPelanggan().getText());
        model.setJenis_service(Integer.parseInt(view.getTxtJenis().getText()));
        model.setBiaya(Integer.parseInt(view.getTxtBiaya().getText()));
        model.setDiskon(Double.parseDouble(view.getTxtDiskon().getText()));
        model.setTotal(Double.parseDouble(view.getTxtTotal().getText()));
        dao.save(model);
        JOptionPane.showMessageDialog(view, "Insert data ok");
    }
    
    public void update(){
        index = view.getTableService().getSelectedRow();
        model.setKode_trans(view.getTxtKode().getText());
        model.setTgl_trans(view.getTxtTgl().getText());
        model.setPelanggan(view.getTxtPelanggan().getText());
        model.setJenis_service(Integer.parseInt(view.getTxtJenis().getText()));
        model.setBiaya(Integer.parseInt(view.getTxtBiaya().getText()));
        model.setDiskon(Double.parseDouble(view.getTxtDiskon().getText()));
        model.setTotal(Double.parseDouble(view.getTxtTotal().getText()));
        dao.update(index,model);
        JOptionPane.showMessageDialog(view, "update data ok");
    }
    
    public void delete(){
        index = view.getTableService().getSelectedRow();
        //index = Integer.parseInt(view.getTxtIndex().getText());
        dao.delete(index);
        JOptionPane.showMessageDialog(view, "Delete data ok");
    }
    
    public void biaya(){
        int jenis = Integer.parseInt(view.getTxtJenis().getText());
        int biaya = 0;
        
        if(jenis==1){
            biaya = 5000;
        }else if(jenis==2){
            biaya = 6000;
        }
         
         view.getTxtBiaya().setText(String.valueOf(biaya));
        
    }
    
    public void total(){
          int jenis = Integer.parseInt(view.getTxtJenis().getText());
          int biaya = Integer.parseInt(view.getTxtBiaya().getText());
          double diskon = Double.parseDouble(view.getTxtDiskon().getText());
          double total = 0;
          total = biaya - (biaya * diskon);
          view.getTxtTotal().setText(String.valueOf(total));
      }
    
//    public void search(){
//        index = Integer.parseInt(view.getTxtIndex().getText());
//        model = dao.get(index);
//        if(model!=null){
//            view.getTxtKodeAnggota().setText(model.getKodeAnggota());
//            view.getTxtNamaAnggota().setText(model.getNamaAnggota());
//            view.getTxtAlamat().setText(model.getAlamat());
//        }else{
//            JOptionPane.showMessageDialog(view, "Data Tidak Ada");
//        }
//    }
    

    public void viewTable() {
     DefaultTableModel tabelModel =
                (DefaultTableModel) view.getTableService().getModel();
        tabelModel.setRowCount(0);
        List<Service> list = dao.getAll();
        for (Service service : list) {
            Object[] data = {
                service.getKode_trans(),
                service.getTgl_trans(),
                service.getPelanggan(),
                service.getJenis_service(),
                service.getBiaya(),
                service.getDiskon(),
                service.getTotal(),
            };
            tabelModel.addRow(data);
        }
    }
    
    
    
}
