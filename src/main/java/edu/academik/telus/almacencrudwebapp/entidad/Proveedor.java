/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.academik.telus.almacencrudwebapp.entidad;

import java.util.Objects;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author 50232
 */
public class Proveedor {
        
    @NotEmpty(message = "Código está vacío.")
    @NotNull(message = "Código es nulo.")
    private String codigo;
    
    @NotEmpty(message = "Nombre comercial está vacío.")
    @NotNull(message = "Nombre comercial es nulo.")
    private String nombreComercial;
    
    @NotEmpty(message = "Nombre comercial está vacío.")
    @NotNull(message = "Nombre comercial es nulo.")    
    private String contacto;

    @Size(max = 2000, message = "Dirección excede de 2,000 carácteres")    
    private String direccion;
    
    @NotNull(message = "Correo electrónico es nulo.")
    @Email(message = "Correo electrónico no es válido.")
    private String email;
    
    @NotEmpty(message = "Código está vacío.")
    private String pais;

    private boolean eliminado;

    public Proveedor() {
    }
    
    

    public Proveedor(String codigo, String nombreComercial, String contacto, String direccion, String email, String pais, boolean eliminado) {
        this.codigo = codigo;
        this.nombreComercial = nombreComercial;
        this.contacto = contacto;
        this.direccion = direccion;
        this.email = email;
        this.pais = pais;
        this.eliminado = eliminado;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proveedor other = (Proveedor) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "codigo=" + codigo + '}';
    }
    
    
    
    
    
}
