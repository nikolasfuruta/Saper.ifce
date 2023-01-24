public class Main {
    public static void main(String[] args) throws Exception {
        float[] notas = {5.5f,8.6f,6.9f,4.5f,7.3f};
        GradeBook registro = new GradeBook("TI",4);
        registro.addNotas(10.0f,0);
        registro.addNotas(5.0f,1);
        registro.addNotas(5.5f,2);
        registro.addNotas(2.0f,3);

        registro.calcular();
        registro.result();
    }
}