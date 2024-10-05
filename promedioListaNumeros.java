
public class promedioListaNumeros {

    public static void main(String[] args) {
        
        double[] numeros = {3,46,12};

        double sumador = 0;
        
        for (int lector1 = 0; lector1<= numeros.length;lector1++){
            double sumador2 = 0;

            sumador = numeros[lector1]++;
            System.out.println(sumador);

            for (int lector2 = 0; lector2 <= numeros.length;lector2++){
                sumador = sumador+sumador2;
            }
        }
    }
}
