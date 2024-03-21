/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesJPA;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author SDavidLedesma
 */
@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rfc", nullable = false, length = 18)
    private String rfc;

    @Column(name = "curp", nullable = false, length = 24)
    private String curp;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "costo_licencia", nullable = false)
    private double costoLicencia;

    @Column(name = "licencia_activa")
    private boolean licenciaActiva;

    @Column(name = "vigencia_licencia")
    private int vigenciaLicencia;

    public Cliente() {
    }

    public Cliente(String rfc, String curp, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, boolean licenciaActiva, int vigenciaLicencia) {
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.licenciaActiva = licenciaActiva;
        this.vigenciaLicencia = vigenciaLicencia;
    }

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(String rfc, String curp, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, String telefono, boolean licenciaActiva, int vigenciaLicencia) {
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.licenciaActiva = licenciaActiva;
        this.vigenciaLicencia = vigenciaLicencia;
    }

    public Cliente(String rfc, String curp, String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, String telefono, double costoLicencia, boolean licenciaActiva, int vigenciaLicencia) {
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.costoLicencia = costoLicencia;
        this.licenciaActiva = licenciaActiva;
        this.vigenciaLicencia = vigenciaLicencia;
    }

    public double getCostoLicencia() {
        return costoLicencia;
    }

    public void setCostoLicencia(double costoLicencia) {
        this.costoLicencia = costoLicencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public boolean isLicenciaActiva() {
        return licenciaActiva;
    }

    public void setLicenciaActiva(boolean licenciaActiva) {
        this.licenciaActiva = licenciaActiva;
    }

    public int getVigenciaLicencia() {
        return vigenciaLicencia;
    }

    public void setVigenciaLicencia(int vigenciaLicencia) {
        this.vigenciaLicencia = vigenciaLicencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
