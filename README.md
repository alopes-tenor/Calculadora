# Calculadora
##Descrição

Este repositório armazena o código de uma calculadora contendo testes manuais e testes automatizados no JUnit.

##Funcionalidades

A calculadora possui as operações de adição, subtração, multiplicação e divisão. Para cada operação, foram realizados testes que buscam verificar o desempenho das funções com diversas variáveis. 

1.**Soma**
Realiza a soma entre duas variáveis.
Exemplo 
Método: sum.somar(int a, int b) return a + b

2.**Subtração**
Realiza a subtração entre duas variáveis.
Exemplo 
Método: sub.subtrair(int a, int b) return a - b

3.**Multiplicação**
Realiza a multiplicação entre duas variáveis
Exemplo 
Método: mult.multiplicar(int a, int b) return a * b

4.**Divisão**
Realiza a divisão entre duas variáveis
Exemplo 
Método: div.dividir(int a, int b) return a / b

## Estrtura do projeto
O projeto está estruturado em pastas:
-- src/calculadora
  -Soma.java = Classe que possui o método soma.
  
  -Subtracao.java = Classe que possui o método subtração.
  
  -Multiplicacao.java = Classe que possui o método multiplicação.
  
  -Divisao.java = Classe que possui o método divisão.
  
  -Calculadora.java = Classe main para os testes e instanciação das classes, de maneira manual.
  
  -CalculadoraJUnitTest.java = Classe main para testar as operações utilizando o JUnit
