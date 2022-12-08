package entities;
public class Rectangle implements Shape {
    
    // ATRIBUTOS
    private Double largura;
    private Double altura;
    // ATRIBUTOS

    // CONSTRUTORES
    public Rectangle(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    // ENCAPSULAMENTO
    

    // METODOS
    @Override
    public Double area() {
        return largura * altura;
    }
    // METODOS


    

}
