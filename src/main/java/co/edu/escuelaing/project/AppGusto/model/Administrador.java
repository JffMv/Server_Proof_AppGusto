package co.edu.escuelaing.project.AppGusto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "ADMINISTRADOR")
public class Administrador extends Usuario {

    @Column(name = "NUMERO_RESTAURANTES", length = 9)
    private int numero_Restaurantes;
    @OneToMany(mappedBy = "admin")
    private ArrayList<Restaurante> restaurantes;
    @OneToMany(mappedBy = "ID_administrador")
    private  ArrayList<GerenteDelAdministrador> gerentes;

    //constructor
    public Administrador() {

    }

    public Administrador( Date fecha) {
        this.numero_Restaurantes = 0;
        this.restaurantes= new ArrayList<Restaurante>();
        this.gerentes= new ArrayList<GerenteDelAdministrador>();

    }



    //setters

    public void setNumero_Restaurantes(int numero_Restaurantes) {
        this.numero_Restaurantes = numero_Restaurantes;
    }


    //getters


    public int getNumero_Restaurantes() {
        return numero_Restaurantes;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public ArrayList<GerenteDelAdministrador> getGerentes() {
        return gerentes;
    }
}
