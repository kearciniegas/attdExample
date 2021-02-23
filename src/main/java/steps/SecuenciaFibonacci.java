package steps;

public class SecuenciaFibonacci {
    public Integer secuenciaposiciones(Integer valorIngresado) {
        if(valorIngresado>1){
            return secuenciaposiciones(valorIngresado-1)  +   secuenciaposiciones(valorIngresado-2);
        }
        if(valorIngresado<=1){
            return valorIngresado;
        }
        return valorIngresado;
    }
}
