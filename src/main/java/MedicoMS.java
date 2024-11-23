/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MedicoMS extends PersonaMS {
    
    private String EspecialidadMS;
    private String AniosexperienciaMS;

    public MedicoMS(String EspecialidadMS, String AniosexperienciaMS, String NombreMS, String EdadMS, String DireccionMS) {
        super(NombreMS, EdadMS, DireccionMS);
        this.EspecialidadMS = EspecialidadMS;
        this.AniosexperienciaMS = AniosexperienciaMS;
    }

    public String getEspecialidadMS() {
        return EspecialidadMS;
    }

    public void setEspecialidadMS(String EspecialidadMS) {
        this.EspecialidadMS = EspecialidadMS;
    }

    public String getAniosexperienciaMS() {
        return AniosexperienciaMS;
    }

    public void setAniosexperienciaMS(String AniosexperienciaMS) {
        this.AniosexperienciaMS = AniosexperienciaMS;
    }

    
    
    
}
