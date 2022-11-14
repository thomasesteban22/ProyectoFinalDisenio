package dao;

import data.Persona;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonasDAO {
    private List<Persona> listaPersona;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String filePath = "persona.dat";

    public void PersonasDAO(){
        listaPersona = new ArrayList<>();
        File file = new File(filePath);
        /*if(file.isFile()){
            try{
                this.entrada = new ObjectInputStream();
            } catch (Exception e) {
                guardar();
            }
        }*/
    }
    public boolean adicionar(Persona persona) {
        return listaPersona.add(persona);
    }

    public Persona buscar(int id) {
        for (Persona persona : listaPersona) {
            if (persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }

    public List<Persona> getListaPersona() {
        return listaPersona;
    }
}
