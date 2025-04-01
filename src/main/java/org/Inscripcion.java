package org;

import java.time.LocalDateTime;
import java.util.Set;


public class Inscripcion {
    private Set<Materia> materiasACursar;
    public boolean fueAprobada;
    public Alumno alumno;
    public LocalDateTime fechaDeEvaluacion;

    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Set<Materia> getMateriasACursar() {
        return materiasACursar;
    }
    public void setMateriasACursar(Set<Materia> materiasACursar) {
        this.materiasACursar = materiasACursar;
    }

    public boolean aprobada(){
        for(Materia materia : materiasACursar){
            if(!materia.cumpleCorrelativas(this.getAlumno())){
                //System.out.println("Hola, mundo!");
                return false;}
        }
        fueAprobada = true;
        return true;
    }
}
