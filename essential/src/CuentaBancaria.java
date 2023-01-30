public class CuentaBancaria {
    
    String CBU;
    String alias;
    double saldo;

    //!Comportamiento para mostrar el estado de la cuenta
    void mostrarDatos(){
        System.out.println(CBU + " " + alias + " " + saldo);
    }

    //!obtener el saldo desde un metodo
    double obtenerSaldo(){
        return  saldo;
    }

    //!metodos con parametros
    void depositar(double monto){
        if (monto >0) saldo += monto; 
    }

    //metodo que reciba y devuelva algo
    boolean saldoDisponible(double monto){
        return saldo >= monto;
    }

    //metodo extraer
    void extraer (double monto){  
        if (saldoDisponible(monto)){
            saldo-= monto;
        }
    }
}
