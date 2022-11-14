package dao;

import data.Persona;


import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonasDAO {
    private List<Persona> listaPersona;

    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String filePath = "persona.dat";
    public void PersonasDAO(){
        listaPersona = new ArrayList<>();
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
