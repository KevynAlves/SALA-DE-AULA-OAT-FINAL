package livrokotlin.com.br.saladeaula;

public class Curso {
    public String nomeCurso;
    public String nomeSemestre;
    public String numeroSala;

    Curso(String nomeCurso,String nomeSemestre,String numeroSala){
        this.nomeCurso=nomeCurso;
        this.nomeSemestre=nomeSemestre;
        this.numeroSala=numeroSala;

    }
    Curso(){

    }
    @Override
    public String toString(){
        return this.nomeCurso;
    }
}
