/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author SDavidLedesma
 */
public class ClienteDTO {

    private Long id;
    private String rfc;
    private String curp;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private LocalDate fechaNacimiento;
    private String telefono;
    private boolean tieneLicenciaActiva;
    private int vigenciaLicencia;

    public ClienteDTO() {
    }

    public ClienteDTO(String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClienteDTO(String rfc, String curp, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, String telefono, boolean tieneLicenciaActiva, int vigenciaLicencia) {
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.tieneLicenciaActiva = tieneLicenciaActiva;
        this.vigenciaLicencia = vigenciaLicencia;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean TieneLicenciaActiva() {
        return tieneLicenciaActiva;
    }

    public void setTieneLicenciaActiva(boolean tieneLicenciaActiva) {
        this.tieneLicenciaActiva = tieneLicenciaActiva;
    }

    public int getVigenciaLicencia() {
        return vigenciaLicencia;
    }

    public void setVigenciaLicencia(int vigenciaLicencia) {
        this.vigenciaLicencia = vigenciaLicencia;
    }

    public ClienteDTO(int vigenciaLicencia) {
        this.vigenciaLicencia = vigenciaLicencia;
    }

    public boolean isTieneLicenciaActiva() {
        return tieneLicenciaActiva;
    }
    
    
    
        
    
}
