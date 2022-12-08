package entities;


public class Circle implements Shape {

    // ATRIBUTOS
    private Double radius;
    // ATRIBUTOS

    // CONSTRUTORES
    public Circle(Double radius) {
        this.radius = radius;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    
    // ENCAPSULAMENTO

    // METODOS
    @Override
    public Double area() {
        return radius * radius;
    }
    // METODOS
    

}