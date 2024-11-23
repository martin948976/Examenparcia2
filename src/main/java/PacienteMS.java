/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class PacienteMS extends PersonaMS{
    
    private String nroHistorial;
    private String Enfermedad;

    public PacienteMS(String nroHistorial, String Enfermedad, String NombreMS, String EdadMS, String DireccionMS) {
        super(NombreMS, EdadMS, DireccionMS);
        this.nroHistorial = nroHistorial;
        this.Enfermedad = Enfermedad;
    }

    public String getNroHistorial() {
        return nroHistorial;
    }

    public void setNroHistorial(String nroHistorial) {
        this.nroHistorial = nroHistorial;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }
    
    
    
}
