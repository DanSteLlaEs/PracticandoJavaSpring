package com.project.Llanos.Entity;


import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "\"user\"")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipodocumento")
    private String tipoDocumento;

    @Column(name = "pnombre")
    private String pNombre;

    @Column(name = "snombre")
    private String sNombre;

    @Column(name = "papellido")
    private String pApellido;

    @Column(name = "sapellido")
    private String sApellido;

    @Column(name = "celular")
    private String celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "ciudadresidencia")
    private String ciudadResidencia;

    @Column(name = "documento")
    private Integer documento;


    public UserEntity() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }



    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }



    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }



    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }



    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }



    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }



    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    // ==========================================
    // MEJORA: EQUALS Y HASHCODE (Crucial para JPA)
    // ==========================================
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id); // Compara únicamente por la llave primaria
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ==========================================
    // MEJORA: TOSTRING LIMPIO
    // ==========================================
    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", nombre='" + pNombre + " " + pApellido + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                '}';
    }
}

