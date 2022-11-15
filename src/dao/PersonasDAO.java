package dao;

import data.Persona;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
public class PersonasDAO {
    private List<Persona> listaPersona;

    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String filePath = "persona.dat";

    public PersonasDAO() throws IOException, SecurityException {
        listaPersona = new ArrayList<>();
        File file = new File(filePath);
        if(file.isFile()){
            try{
                this.entrada = new ObjectInputStream(new FileInputStream("persona.dat"));
                this.listaPersona = (List<Persona>) entrada.readObject();
                this.entrada.close();
            }catch (Exception e){
                guardar();
            }
        }
    }
    public void guardar(){
        try {
            this.salida = new ObjectOutputStream(new FileOutputStream("persona.dat"));
            this.salida.writeObject(listaPersona);
            this.salida.close();
        }catch(Exception e){
            System.out.printf("Error al guardar");
        }
    }
    public boolean adicionar(Persona persona) {

        listaPersona.add(persona);
        guardar();
        return true;

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
