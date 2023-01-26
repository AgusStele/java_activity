public class Principal {
    public static void main(String[] args) {
        Auto a = new Auto();
        
        System.out.println(a.patente + " " + a.color + " " + a.kml + " " + a.conAire);
        System.out.println("");

        a.color = "Verde";
        a.conAire = true;
        a.patente = "ABC123";
        a.kml = 500;

        System.out.println(a.patente + " " + a.color + " " + a.kml + " " + a.conAire);

        Auto a2= new Auto();
        a2.color = "AZUL";
        //a2.conAire = true;
        a2.patente = "DEF456";
        a2.kml = 150;

        System.out.println(a2.patente + " " + a2.color + " " + a2.kml + " " + a2.conAire);
    }
}
