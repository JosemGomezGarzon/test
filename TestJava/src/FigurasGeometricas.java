import java.lang.Math;

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class TrianguloRectangulo {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String determinarTipoTriangulo() {
        if (base == altura) {
            return "Equilátero";
        } else if (base == altura || base == calcularHipotenusa() || altura == calcularHipotenusa()) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}

    class Rombo {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}

public class FigurasGeometricas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(7);
        System.out.println("Círculo - Área: " + circulo.calcularArea() + " Perímetro: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(3, 8);
        System.out.println("Rectángulo - Área: " + rectangulo.calcularArea() + " Perímetro: " + rectangulo.calcularPerimetro());

        Cuadrado cuadrado = new Cuadrado(2);
        System.out.println("Cuadrado - Área: " + cuadrado.calcularArea() + " Perímetro: " + cuadrado.calcularPerimetro());

        TrianguloRectangulo triangulo = new TrianguloRectangulo(6, 3);
        System.out.println("Triángulo Rectángulo - Área: " + triangulo.calcularArea() + " Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());

        Rombo rombo = new Rombo(3, 5, 59);
        System.out.println("Rombo - Área: " + rombo.calcularArea() + " Perímetro: " + rombo.calcularPerimetro());

        Trapecio trapecio = new Trapecio(17, 6, 9, 1, 7);
        System.out.println("Trapecio - Área: " + trapecio.calcularArea() + " Perímetro: " + trapecio.calcularPerimetro());
    }
}
