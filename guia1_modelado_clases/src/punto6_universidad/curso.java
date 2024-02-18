package punto6_universidad;

import java.util.HashSet;

public class curso {
	
	String nombreCurso;

	int codigo;

	int numeroCreditos;

	int numeroSalon;

	String nombreEdificio;
	
	carrera carrera;
	
	HashSet<profesor>profesores= new HashSet<profesor>();
	
	HashSet<estudiante>estudiantes= new HashSet<estudiante>();
	
	public void guardarInformacion() {

	}

}
