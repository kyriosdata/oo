## Implemente o modelo de colaboração abaixo.

Um objeto identificado por _Programa_ cria duas instâncias: uma da classe _A_ e posteriormente uma da classe _B_. A instância de _A_ é identificada por _objA_, enquanto a instância de _B_ é anônima. Após a criação das instâncias, o objeto _Programa_ envia a mensagem _useA(objA)_ para a instância anônima de _B_, ou seja, chama o método _useA_ da instância de _B_ e passa como argumento a instância de _A_ criada. Observe que esta é a única forma da instância de _B_ tomar conhecimento da existência da instância de _A_ e enviar a mensagem _facaAlgo_ para _objA_. Assuma que a mensagem _facaAlgo_ simplesmente imprima, na saída padrão, o texto “fiz algo”.

![image](https://user-images.githubusercontent.com/1735792/90346228-b1260400-dffd-11ea-8b60-6c45f9c694b6.png)
