package org;

import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }
    public void setCorrelativas(Set<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean cumpleCorrelativas(Alumno alumno) {
        return(this.getMateriasAprobadas(alumno).containsAll(this.getCorrelativas()));
    };
    public Set<Materia> getMateriasAprobadas(Alumno alumno) {
        return(alumno.getMateriasAprobadas());
    };
}
