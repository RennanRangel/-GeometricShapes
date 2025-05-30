package Sistema;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();


        Circulo circulo = new Circulo("Vermelho", 5);
        Retangulo retangulo = new Retangulo("Azul", 4, 6);


        formas.add(circulo);
        formas.add(retangulo);


        for (Forma forma : formas) {
            System.out.println("Forma: " + forma.getClass().getSimpleName());
            System.out.println("Cor: " + forma.getCor());
            System.out.printf("Área: \n", forma.calcularArea());
            System.out.printf("Perímetro: \n", forma.calcularPerimetro());
            System.out.println("===========================================");
        }


        System.out.println("Redimensionando o círculo por fator 2");
        circulo.redimensionar(2);

        System.out.printf("Nova Área do Círculo: \n", circulo.calcularArea());
        System.out.printf("Novo Perímetro do Círculo: \n", circulo.calcularPerimetro());
    }
}
