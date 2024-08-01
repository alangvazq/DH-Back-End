import org.apache.log4j.Logger;

public class Calculadora {

    private static final Logger logger = Logger.getLogger(Calculadora.class);

    private int valor1;
    private int valor2;

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double suma(){
        return valor1+valor2;
    }

    public double resta(){
        return valor1-valor2;
    }

    public double multiplicacion(){
        return valor1*valor2;
    }

    public double division(){
        logger.info("Empezamos la división: " + valor1 + "/" + valor2);
        double resultado;
        try{
            resultado = valor1/valor2;
        }catch (Exception e){
            logger.error("Ocurrio un error al dividir: ", e);
            return 0;
        }
        logger.debug("Se dividio: "+ valor1 + "/" + valor2);
        return resultado;
    }
}
