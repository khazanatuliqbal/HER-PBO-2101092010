/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.util.List;

/**
 *
 * @author USER
 */
public interface ServiceDao {
    void save(Service service);
    void update(int index, Service service);
    void delete (int index);
    Service getService(int index);
    List<Service> getAll();
}
