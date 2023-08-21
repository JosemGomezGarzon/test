public class Automovil {
    enum tipoMarca {KIA, HONDA, BMW, AUDI, MAZDA, CHEVROLET};
    tipoMarca marca;
    enum tipoTransmision { AUTOMATICO, MANUAL }
    tipoTransmision transmision;
    int modelo;
    enum TipoCombustible { GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL }
    TipoCombustible tipoCombustible;
    enum TipoAutomovil { CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV }
    TipoAutomovil tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    enum TipoColor { BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA }
    TipoColor color;

    int velocidadActual = 0;
    int multas = 0;

    Automovil( Automovil.tipoMarca marca, tipoTransmision transmision, int modelo, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil,
            int numeroPuertas, int cantidadAsientos, int velocidadMaxima, TipoColor color) {
        this.marca = marca;
        this.transmision = transmision;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

        public tipoTransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(tipoTransmision transmision) {
        this.transmision = transmision;
    }
    

    public Automovil.tipoMarca getMarca() {
        return marca;
    }



    public void setMarca(Automovil.tipoMarca marca) {
        this.marca = marca;
    }



    public int getModelo() {
        return modelo;
    }



    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }



    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }



    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }



    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }



    public int getNumeroPuertas() {
        return numeroPuertas;
    }



    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }



    public int getCantidadAsientos() {
        return cantidadAsientos;
    }



    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }



    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }



    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }



    public TipoColor getColor() {
        return color;
    }



    public void setColor(TipoColor color) {
        this.color = color;
    }



    public int getVelocidadActual() {
        return velocidadActual;
    }



    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }



    public int getMultas() {
        return multas;
    }



    public void setMultas(int multas) {
        this.multas = multas;
    }



    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            generarMulta();
            System.out.println("Se ha generado una multa por exceso de velocidad.");
        }
    }

    void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Tipo Transmision = " + transmision);
        System.out.println("Modelo = " + modelo);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
    }

    boolean tieneMultas() {
        return multas > 0;
    }

    int valorTotalMultas() {
        return multas * 180; // Valor arbitrario de multa
    }

    private void generarMulta() {
        multas++;
    }

    public static void main(String[] args) {

        Automovil auto1 = new Automovil(tipoMarca.CHEVROLET, tipoTransmision.MANUAL, 2018, TipoCombustible.DIESEL, TipoAutomovil.EJECUTIVO,5, 6,150, TipoColor.NEGRO);

        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(0);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(0);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

            System.out.println("Tiene multas: " + auto1.tieneMultas()); 
            System.out.println("Valor total de multas: $" + auto1.valorTotalMultas());
        
    }


}
