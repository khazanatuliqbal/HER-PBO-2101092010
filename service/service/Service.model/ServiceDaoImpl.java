/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class ServiceDaoImpl implements ServiceDao{

    List<Service> data = new ArrayList<>();
   
    public void save(Service service) {
        data.add(service);
    }

    public void update(int index, Service service) {
        data.set(index, service);
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Service getService(int index) {
        return data.get(index);
    }
   
    public List<Service> getAll() {
        return data;
    }
    
}
