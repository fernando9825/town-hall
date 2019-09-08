package com.fernando9825.townhall.models.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "personas")
public class Persona implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8267336023209491792L;

	@Id
    private String DUI;

    @NotEmpty
    private String nombres;

    @NotEmpty
    private String apellidos;

    @NotNull
    private int edad;

    @NotNull
    private int sexo;

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @NotEmpty
    private String direccion;

    @NotEmpty
    private String departamento;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;


    @PrePersist
    private void getDate(){
        this.createAt = new Date();
    }

    // setter is not necessary for DUI field
    public String getDUI() {
        return DUI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
