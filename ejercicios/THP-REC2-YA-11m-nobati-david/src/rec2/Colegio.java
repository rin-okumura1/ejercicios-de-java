package rec2;

import java.util.ArrayList;

public class Colegio {
	private String nombre;
	private ArrayList<Curso> cursos;
	private ArrayList<Docente> docentes;
	public Colegio(String nombre, ArrayList<Curso> cursos, ArrayList<Docente> docentes) {
		setNombre(nombre);
		this.cursos = new ArrayList<>();
		this.docentes =new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean agregarcurso(String curso,String dni) {
		boolean resultado=false;
		Curso cursoss=buscarcurso(curso);
		if(cursoss==null) {
			cursos.add(new Curso(curso,new Docente(dni)));
			resultado=true;
		}
		return resultado;
	}
	public Resultado informarCasoCovid(String curso,String dniestudiante){
	Curso cursoss=buscarcurso(nombre);
	Resultado result;
	if(cursoss==null) {
		result=Resultado.ERROR_CURSO_INEXISTENTE;
	}
	
	}
	public void agregarestudiante(String nombredecurso ,String dniEstudiante,String apellido) {
		
	}
	private ArrayList<Curso> agregarcursosaislados(){
		
	}
	private ArrayList<Docente> recorrercurso
	
	private Curso buscarcurso(String curso) {
	int pos=0;
	Curso cursoss=null;
	while(pos<cursos.size()&&cursoss==null) {
	if(cursos.get(pos).getNombre().equals(curso)) {
	cursoss=cursos.get(pos);	
	}
	else {
		pos++;
	}
	
	}
	return cursoss;
	}
	private Estudiante buscarestudiante(String dni) {
		int pos=0;
		Estudiante estudiante;
		if
	}
}
