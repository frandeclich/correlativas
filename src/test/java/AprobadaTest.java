import org.Alumno;
import org.Inscripcion;
import org.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class AprobadaTest {
    @Test
    public void test(){
        Inscripcion inscripcion = new Inscripcion();
        Alumno alumno = new Alumno();
        Materia fisica = new Materia();
        Materia fisica2 = new Materia();
        Materia paradigmas = new Materia();
        Materia analisisDeSistemas = new Materia();
        Materia diseñoDeSistemas = new Materia();

        inscripcion.setAlumno(alumno);

        Set<Materia> aCursar = new HashSet<>();
        aCursar.add(diseñoDeSistemas);
        inscripcion.setMateriasACursar(aCursar);

        Set<Materia> aprobadas = new HashSet<>();
        aprobadas.add(fisica);
        aprobadas.add(fisica2);
        aprobadas.add(paradigmas);
        aprobadas.add(analisisDeSistemas);
        alumno.setMateriasAprobadas(aprobadas);

        Set<Materia> correlativas = new HashSet<>(); //está bien que haya hecho esto?
        correlativas.add(fisica);
        correlativas.add(paradigmas);
        correlativas.add(analisisDeSistemas);
        diseñoDeSistemas.setCorrelativas(correlativas);

        //Algunos print que usé para hacer pruebas
        /*System.out.println(inscripcion.getMateriasACursar());
        System.out.println(diseñoDeSistemas);
        System.out.println(diseñoDeSistemas.getCorrelativas());
        System.out.println(alumno.getMateriasAprobadas());*/

        Assert.assertTrue(inscripcion.aprobada());
    }

}
