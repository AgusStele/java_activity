public class CuentaBancariaMain {
    public static void main(String[] args) throws Exception {

        //!Comportamientos de los objetos

        CuentaBancaria cb = new CuentaBancaria();

        System.out.println(cb.CBU + " " + cb.alias + " " + cb.saldo);
        cb.CBU= "5469843216986458";
        cb.alias = "miCuenta";
        System.out.println(cb.CBU + " " + cb.alias + " " + cb.saldo);

        //ahora vamos a usar el metodo de la clase
        cb.mostrarDatos();
        System.out.println("*************************");

        //ahora llamo al metodo obtener saldo
        System.out.println(cb.obtenerSaldo()); 
        System.out.println("*****************");

        //llamo al metodo depositar
        cb.depositar(200);
        System.out.println(cb.obtenerSaldo()); 

        //llamo al metodo saldoDisponible
        System.out.println(cb.saldoDisponible(100));
        System.out.println(cb.saldoDisponible(300)); 
        
        //llamo al metodo extraer
        cb.extraer(180);
        System.out.println(cb.obtenerSaldo());

    }
}
