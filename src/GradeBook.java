public class GradeBook {

    public String nome;
    public int qtd;
    public float[] notas;

    GradeBook(String nome, int qtd, float[] notas){
        this.nome = nome;
        this.qtd = qtd;
        this.notas = notas;
    }

    public String getNome(){
        return nome;
    }
    public int getQtd(){
        return qtd;
    }
    public float[] getNotas(){
        return notas;
    }

    public void setNome(String nome){
        this.nome = nome;
    };
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    public void setNotas(float[] notas){
        this.notas = notas;
    }
}

