/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import EntidadesJPA.Cliente;
import javax.persistence.EntityManager;

/**
 *
 * @author SDavidLedesma
 */
public class ClientesDAO implements IClientesDAO{
    
    private EntityManager em;

    @Override
    public void registrarLicencia(Cliente cliente) {
    em.persist(cliente);
    }
    
}
