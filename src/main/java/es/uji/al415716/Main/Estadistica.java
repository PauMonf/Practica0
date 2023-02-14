package es.uji.al415716.Main;

public class Estadistica {
    public double MediaAritmetica(double[] vector) {
        if(vector.length==0) return 0;

        double media = 0;
        for (int i = 0; i < vector.length; i++) {
            media += vector[i];
        }
        return media / vector.length;
    }

    public double Varianza(double[] vector) {
        if(vector.length==0) return 0;

        double varianza = 0;
        double media = MediaAritmetica(vector);
        for (int i = 0; i < vector.length; i++) {
            varianza += Math.pow(vector[i] - media, 2);
        }
        return varianza / vector.length;
    }

    public double DesviacionEstandar(double[] vector){
        return Math.sqrt(Varianza(vector));
    }
}
