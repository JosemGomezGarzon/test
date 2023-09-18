public class Planeta {

    // Atributo que define el nombre de un planeta
    String nombre = null;
    // Atributo que define la cantidad de satélites que tiene un planeta
    int cantidadSatélites = 0;
    // Atributo que define la masa de un planeta
    double masa = 0;
    // Atributo que define el volumen de un planeta
    double volumen = 0;
    // Atributo que define el diámetro de un planeta
    int diámetro = 0;
    // Atributo que define la distancia al sol de un planeta
    int distanciaSol = 0;
    // Atributo que define el tipo de planeta como un valor enumerado
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    // Atributo que define el tipo de planeta
    tipoPlaneta tipo;
    // Atributo que define si el planeta es observable o no
    boolean esObservable = false;

    /**
    * Constructor de la clase Planeta
    * @param nombre Parámetro que define el nombre del planeta
    * @param cantidadSatélites Parámetro que define la cantidad de
    * satélites del planeta
    * @param masa Parámetro que define la masa del planeta (en
    * kilogramos)
    * @param volumen Parámetro que define el volumen del planeta
    * (en kilómetros cúbicos)
    * @param diámetro Parámetro que define el diámetro del planeta
    * (en kilómetros)
    * @param distanciaSol Parámetro que define la distancia media del
    * planeta al sol (en kilómetros)
    * @param tipo Parámetro que define el tipo de planeta (puede ser
    * GASEOSO, TERRESTRE o ENANO)
    * @param esObservable Parámetro que define si el planeta es
    * observable o no
    */


    Planeta(String nombre, int cantidadSatélites, double masa, double volumen, int diámetro, int distanciaSol, tipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getCantidadSatélites() {
        return cantidadSatélites;
    }

    public void setCantidadSatélites(int cantidadSatélites) {
        this.cantidadSatélites = cantidadSatélites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiámetro() {
        return diámetro;
    }

    public void setDiámetro(int diámetro) {
        this.diámetro = diámetro;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public tipoPlaneta getTipo() {
        return tipo;
    }

    public void setTipo(tipoPlaneta tipo) {
        this.tipo = tipo;
    }

    public boolean isEsObservable() {
        return esObservable;
    }

    public void setEsObservable(boolean esObservable) {
        this.esObservable = esObservable;
    }


    /**
    * Método que imprime en pantalla los datos de un planeta
    */
    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatélites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diámetro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
    }

    /**
    * Método que calcula y devuelve la densidad de un planeta
    * @return La densidad calculada del planeta
    */
    double calcularDensidad() {
        return masa/volumen;
    }

    
    /**
    * Método que determina y devuelve si un planeta es exterior o no
    * @return Valor booleano que indica si el planeta es exterior o no
    */
    boolean esPlanetaExterior(){
        float límite = (float) (149597870 * 3.4);
        /* Un planeta exterior está situado más allá del cinturón de
        asteroides */
        /* El cinturón se encuentra entre 2,1 y 3,4 UA (UA =
        149.597.870 Km) */
        if (distanciaSol > límite) {
            return true;
        } else {
           return false;
        }
    }

    public static int suma (int a, int b){
        return a + b;
    }
    public static void main(String args[]) {
        Planeta p1 = new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000,tipoPlaneta.TERRESTRE,false);
        //p1.imprimir();
        //System.out.println("Densidad del planeta = " +p1.calcularDensidad());
        System.out.println("Es planeta exterior = " +p1.esPlanetaExterior());
        //System.out.println();
        //Planeta p2 = new Planeta("Júpiter",79,1.899E27,1.4313E15,139820,750000000,tipoPlaneta.GASEOSO,false);
        //p2.imprimir();
        //System.out.println("Es planeta exterior = " +p2.esPlanetaExterior());
        //System.out.println("Densidad del planeta = " +p2.calcularDensidad());
        //System.out.println("Es planeta exterior = " +p2.esPlanetaExterior());
    }

}
