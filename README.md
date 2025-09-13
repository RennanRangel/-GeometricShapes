# Sistema de Formas Geométricas em Java

## Descrição
Este projeto implementa um sistema simples de **formas geométricas** em Java, utilizando **herança, interfaces e enumerações**.  
Permite criar diferentes formas, calcular área e perímetro, e redimensionar algumas delas.

As formas implementadas neste projeto são:

- **Círculo**: pode ser redimensionado.
- **Retângulo**: possui largura e altura.

---


### Classes e Interfaces

- **Forma.java**  
  Classe abstrata que define os métodos:
  - `double calcularArea()`
  - `double calcularPerimetro()`
  - Atributo `cor` e seu getter.

- **Circulo.java**  
  - Extende `Forma` e implementa `Redimensionavel`.  
  - Atributo: `raio`.  
  - Métodos: `calcularArea`, `calcularPerimetro` e `redimensionar`.

- **Retangulo.java**  
  - Extende `Forma`.  
  - Atributos: `largura` e `altura`.  
  - Métodos: `calcularArea` e `calcularPerimetro`.

- **Redimensionavel.java**  
  Interface que define o método:
  - `void redimensionar(double fator)`

- **TipoForma.java**  
  Enum que define os tipos de formas: `CIRCULO`, `RETANGULO`.

- **Main.java**  
  Demonstra o uso das classes:
  - Criação de formas.
  - Cálculo de área e perímetro.
  - Redimensionamento do círculo.

---

## Como Executar

1. Abra o projeto em uma IDE Java (Eclipse, IntelliJ, NetBeans).  
2. Compile e execute `Main.java`.  
3. Observe a saída no console mostrando:

   - Tipo da forma.  
   - Cor da forma.  
   - Área e perímetro calculados.  
   - Alterações após redimensionar o círculo.

```java
Circulo circulo = new Circulo("Vermelho", 5);
Retangulo retangulo = new Retangulo("Azul", 4, 6);

formas.add(circulo);
formas.add(retangulo);

for (Forma forma : formas) {
    System.out.println("Forma: " + forma.getClass().getSimpleName());
    System.out.println("Cor: " + forma.getCor());
    System.out.printf("Área: %.2f\n", forma.calcularArea());
    System.out.printf("Perímetro: %.2f\n", forma.calcularPerimetro());
}

circulo.redimensionar(2);
System.out.printf("Nova Área do Círculo: %.2f\n", circulo.calcularArea());
System.out.printf("Novo Perímetro do Círculo: %.2f\n", circulo.calcularPerimetro());


