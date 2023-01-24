import java.util.Arrays;
import java.util.HashMap;

public class GradeBook {
    /*Vamos desenvolver uma classe GradeBook que professores
    podem usar para armazenar as notas de uma prova dos alunos e
    mostrar um relatório que contém as notas, média das notas,
    menor nota, maior nota, e uma distribuição de notas. A classe
    GradeBook deve ter como atributos o nome do curso e as notas
    dos alunos do curso. A distribuição de notas deve levar em
    consideração a frequência de notas em cada intervalo a seguir:
    [0.0, 1.0), [1.0, 2.0), [2.0, 3.0), [3.0, 4.0), [4.0, 5.0),
    [5.0, 6.0), [6.0, 7.0), [7.0, 8.0), [8.0, 9.0), [9.0, 10.0]*/

    public String nome;
    public int qtd;
    public float soma = 0f;
    public float[] notas;
    private double media;
    private float max;
    private float min;
    private final HashMap<String,Integer> frequencia = new HashMap<>();

    GradeBook(String nome, int qtd){
        this.nome = nome;
        this.qtd = qtd;
        this.notas = new float[this.qtd];
    }

    public void addNotas(float nota, int pos){
        if(pos<this.qtd) {
            this.notas[pos] = nota;
            soma += nota;
        }
        else System.out.println("Out of Bound!");
    }

    public void calcular(){
        this.media();
        this.getMaiorMenor();
        this.getDistribution();
    }

    private void media(){
        media = (double) soma/this.qtd;
    }

    private void getMaiorMenor(){
        Arrays.sort(this.notas);
        max = this.notas[this.notas.length-1];
        min = this.notas[0];
    }

    private void getDistribution(){
        for(float nota : this.notas){
            if(nota >=0.0 && nota<1.0){
                String string = "[0.0, 1.0)";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
            else if(nota >=1.0 && nota<2.0){
                String string = "[1.0, 2.0)";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
            else if(nota >=2.0 && nota<3.0){
                String string = "[2.0, 3.0)";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
            else if(nota >=3.0 && nota<4.0){
                String string = "[3.0, 4.0)";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
            else if(nota >=4.0 && nota<5.0){
                String string = "[4.0, 5.0)";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
            else if(nota >=5.0 && nota<6.0){
                String string = "[5.0, 6.0)";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
            else if(nota >=7.0 && nota<8.0){
                String string = "[7.0, 8.0)";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
            else if(nota >=8.0 && nota<9.0){
                String string = "[8.0, 9.0)";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
            else if(nota >=9.0 && nota<=10.0){
                String string = "[9.0, 10.0]";
                if(frequencia.containsKey(string)) frequencia.put(string,frequencia.get(string)+1);
                else frequencia.put(string,1);
            }
        }
    }

    public void result(){
        System.out.print("Notas: ");
        for(float nota : this.notas){
            System.out.print(nota+", ");
        }
        System.out.println("");
        System.out.printf(
                "%nMédia: %.2f"+
                "%nMaior Nota: %.2f"+
                "%nMenor Nota: %.2f"
        ,media,max,min);

        System.out.println("");
        System.out.println(this.frequencia);
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

