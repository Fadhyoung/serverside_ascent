/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.co.id.serversideascent.service.serviceInterface;

import java.util.List;

/**
 *
 * @author lenovo
 */
public interface BasicCrudServiceInterface<E, I> {

    List<E> findAll();

    E findById(I id);

    E create(E entity);

    E update(I id, E entity);

    E delete(I id);

}

