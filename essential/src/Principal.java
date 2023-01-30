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

        System.out.println("-------------------");

        //!Identidad de un objeto
        //*Las variables en el detras guardan un identificador del objeto*/
        Auto aA= new Auto();
        aA.color = "AZUL";
        //a2.conAire = true;
        aA.patente = "DEF456";
        aA.kml = 150;

        System.out.println(aA); //! IDENTIFICADOR DEL OBJETO Auto@3764951d 

        //System.out.println(aA.patente + " " + aA.color + " " + aA.kml + " " + aA.conAire); 

        Auto aB= new Auto();
        aB.color = "AZUL";
        //a2.conAire = true;
        aB.patente = "DEF456";
        aB.kml = 150;

        System.out.println(aB);//! IDENTIFICADOR DEL OBJETO Auto@4b1210ee
        //System.out.println(aB.patente + " " + aB.color + " " + aB.kml + " " + aB.conAire);

    }
}   
