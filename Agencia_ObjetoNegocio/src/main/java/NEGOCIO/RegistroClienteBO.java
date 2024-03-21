/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

import DAOS.IClientesDAO;
import DTO.ClienteDTO;
import EntidadesJPA.Cliente;
import java.time.LocalDate;

/**
 *
 * @author SDavidLedesma
 */
public class RegistroClienteBO implements IRegistroClienteBO {

    private IClientesDAO clientesDAO;

    public RegistroClienteBO(IClientesDAO clientesDAO) {
        this.clientesDAO = clientesDAO;
    }

    @Override
    public void registrarLicencia(ClienteDTO clienteDTO) {
        //validar que todos los campos obligatorios esten presentes
        if (clienteDTO.getRfc() == null || clienteDTO.getNombre() == null
                || clienteDTO.getApellidoPaterno() == null || clienteDTO.getFechaNacimiento() == null || clienteDTO.getTelefono() == null) {
            throw new IllegalArgumentException("Campos obligatorios");
        }

        // Validar el formato del RFC (solo como ejemplo, puede requerir una validación más detallada)
        if (!clienteDTO.getRfc().matches("[A-Z]{4}\\d{6}[A-Z\\d]{3}")) {
            throw new IllegalArgumentException("El formato del RFC no es válido.");
        }

        // Validar la vigencia de la licencia
        int vigencia = clienteDTO.getVigenciaLicencia();
        if (vigencia < 1 || vigencia > 3) {
            throw new IllegalArgumentException("La vigencia de la licencia debe ser de 1 a 3 años.");
        }

        // Validar la fecha de nacimiento para asegurarse de que el usuario tenga al menos 18 años
        LocalDate fechaNacimiento = clienteDTO.getFechaNacimiento();
        LocalDate fechaHoy = LocalDate.now();
        if (fechaNacimiento.plusYears(18).isAfter(fechaHoy)) {
            throw new IllegalArgumentException("El usuario debe tener al menos 18 años para obtener una licencia.");
        }

        // Calcular el costo de la licencia
        int costoLicencia = calcularCostoLicencia(vigencia);

        // Crear un objeto Cliente a partir de ClienteDTO
        Cliente cliente = new Cliente();
        cliente.setRfc(clienteDTO.getRfc());
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setApellidoPaterno(clienteDTO.getApellidoPaterno());
        cliente.setApellidoMaterno(clienteDTO.getApellidoMaterno());
        cliente.setFechaNacimiento(clienteDTO.getFechaNacimiento());
        cliente.setTelefono(clienteDTO.getTelefono());
        cliente.setVigenciaLicencia(vigencia);
        cliente.setCostoLicencia(costoLicencia);

        // Llamar al método de persistencia para registrar la licencia
        clientesDAO.registrarLicencia(cliente);
    }

    private int calcularCostoLicencia(int vigencia) {
        switch (vigencia) {
            case 1:
                return 600;
            case 2:
                return 900;
            case 3:
                return 1100;
            default:
                throw new IllegalArgumentException("Vigencia de licencia no válida.");
        }

    }
}
