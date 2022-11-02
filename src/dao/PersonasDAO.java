package dao;

import data.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonasDAO {
    private List<Persona> listaPersona;

    public PersonasDAO(){
        listaPersona =new ArrayList<>();
    }
    public boolean adicionar(Persona persona){
        return listaPersona.add(persona);
    }

}
