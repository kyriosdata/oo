## Implemente o que se pede abaixo.

1. Implemente as classes _Casa_ e _Sapato_ em conformidade com as restrições seguintes.

1. Conforme boa prática de programação, cada classe é fornecida em seu próprio arquivo. Ou seja, para estas duas classes teremos dois arquivos: **Casa.java** e **Sapato.java**.

1. Acrescente pelo menos 5 (cinco) propriedades, também denominadas de atributos ou membros de dados, para cada uma destas classes. Seja cuidadoso, um atributo típico de sapato é o número (tamanho), por exemplo. Há muitos outros, por outro lado, não faz sentido "nome do usuário", por exemplo. Para uma casa, um atributo típico é a área construída. Pergunte-se, para auxiliar a identificar atributos relevantes, o que você gostaria de saber sobre um dado sapato e que é atribuição ou responsabilidade dele saber ou realizar? O que você gostaria de saber sobre uma casa? Desenvolver software orientado a objetos é, de certa forma, favorecer a perspectiva do "mundo real".

1. Acrescente pelo menos 5 (cinco) métodos a cada uma das classes. Um método útil para Sapato é getNumero() ou getTamanho(), conforme a decisão acima. Para casa, um método útil é getNumeroComodos(). Observe que, em ambos os casos, os nomes dos métodos são sugestivos, outra prática imprescindível.

1. Crie duas classes, TestaCasa e TestaSapato, para testar as classe Casa e Sapato, respectivamente. Esta é uma prática recomendada: separar o código que testa uma classe do código testado propriamente dito, ou seja, mantenha em locais distintos questões de naturezas distintas. Em inglês o termo comumente empregado, na literatura de engenharia de software, é separation of concerns. TestaCasa deverá criar pelo menos duas instâncias de Casa, fornecer valores para os atributos das instâncias e enviar mensagens para cada uma das instâncias. Faça o mesmo para a classe TestaSapato e Sapato. Em vez do comum uso do método estático main (início de uma aplicação em Java) e do emprego de sentenças System.out.println, por exemplo, todas estas duas opções estão proibidas. Você deverá se familiarizar e fazer udo do JUnit.
