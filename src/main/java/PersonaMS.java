/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class PersonaMS {
    private String NombreMS;
    private String EdadMS;
    private String DireccionMS;

    public PersonaMS(String NombreMS, String EdadMS, String DireccionMS) {
        this.NombreMS = NombreMS;
        this.EdadMS = EdadMS;
        this.DireccionMS = DireccionMS;
    }

    public String getNombreMS() {
        return NombreMS;
    }

    public void setNombreMS(String NombreMS) {
        this.NombreMS = NombreMS;
    }

    public String getEdadMS() {
        return EdadMS;
    }

    public void setEdadMS(String EdadMS) {
        this.EdadMS = EdadMS;
    }

    public String getDireccionMS() {
        return DireccionMS;
    }

    public void setDireccionMS(String DireccionMS) {
        this.DireccionMS = DireccionMS;
    }
    
    
}
