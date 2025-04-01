import org.Alumno;
import org.Inscripcion;
import org.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class AprobadaTestFalse {
    @Test
    public void test(){
        Inscripcion inscripcion = new Inscripcion();
        Alumno alumno = new Alumno();
        Materia fisica = new Materia();
        Materia fisica2 = new Materia();
        Materia paradigmas = new Materia();
        Materia analisisDeSistemas = new Materia();
        Materia diseñoDeSistemas = new Materia();
        Materia SeminarioIntegrador = new Materia();

        inscripcion.setAlumno(alumno);

        Set<Materia> aCursar = new HashSet<>();
        aCursar.add(diseñoDeSistemas);
        aCursar.add(SeminarioIntegrador);
        inscripcion.setMateriasACursar(aCursar);

        Set<Materia> aprobadas = new HashSet<>();
        aprobadas.add(fisica);
        aprobadas.add(fisica2);
        aprobadas.add(paradigmas);
        aprobadas.add(analisisDeSistemas);
        alumno.setMateriasAprobadas(aprobadas);

        Set<Materia> correlativasDiseño = new HashSet<>(); //está bien que haya hecho esto?
        correlativasDiseño.add(fisica);
        correlativasDiseño.add(paradigmas);
        correlativasDiseño.add(analisisDeSistemas);
        diseñoDeSistemas.setCorrelativas(correlativasDiseño);

        Set<Materia> correlativasSeminario = new HashSet<>();
        correlativasSeminario.add(fisica2);
        correlativasSeminario.add(diseñoDeSistemas);
        SeminarioIntegrador.setCorrelativas(correlativasSeminario);

        //Algunos print que usé para hacer pruebas
        /*System.out.println(inscripcion.getMateriasACursar());
        System.out.println(diseñoDeSistemas);
        System.out.println(diseñoDeSistemas.getCorrelativas());
        System.out.println(alumno.getMateriasAprobadas());*/

        Assert.assertFalse(inscripcion.aprobada());
    }

}
