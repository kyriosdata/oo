### Uma casa compreende quartos, banheiros, salas, áreas e garagens.

O diagrama abaixo não apresenta as cardinalidades nos extremos das agregações, o que pode não ser suficientemente preciso em alguns casos. Por exemplo, o diagrama admite uma casa que não possui quartos, banheiros e assim por diante. Se o correto é que uma casa possui pelo menos um quarto, por exemplo, então a cardinalidade 1..\* deveria ser empregado do lado da classe Quarto. Ainda convém ressaltar que o próprio verbo “compreender”, empregado na descrição do domínio, ressalta a relação do tipo todo/parte. Para tal tipo de relação há duas opções: agregação ou composição. Dado que uma Sala ou Garagem, por exemplo, podem ser interpretados como indissociáveis de uma Casa, a associação abaixo deveria representar uma composição (losango hachurado) em vez da agregação (losango não hachurado).

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-03/mod03ima01/mod03ima01.plantuml)

### Toda cadeira possui um proprietário (mulher ou homem).

O modelo abaixo não é explícito quanto ao sexo da pessoa. Dado o fato de que os atributos foram omitidos, não há porque imaginar que este não será incluído. Também não foi incluída a cardinalidade. Os mais rigorosos podem indicar que a associação no extremo de Pessoa possui como cardinalidade o valor 1, enquanto para o outro extremo a sentença não fornece nenhuma pista.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-03/mod03ima02/mod03ima02.plantuml)

### Há janelas com vidros, outras sem.

Toda janela com vidro encontra-se dividida em duas áreas: aquela ocupada pelo vidro e a restante. Naturalmente, a área total da janela é a soma destas duas áreas.

Uma janela com vidro pode ser interpretada como uma especialização de uma janela, digamos, comum, sem vidro, ou vice-versa. Aquela com vidro possui como atributo areaVidro, que informa a área da janela ocupada pelo vidro, enquanto a janela sem vidro possui como atributo area. Uma janela com vidro, portanto, possui pelo menos dois atributos suficientes para determinarmos duas informações relevantes: a área do vidro e aquela área da janela que não é ocupada por vidro. Uma alternativa é exibida no lado esquerdo da figura abaixo.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-03/mod03ima03/mod03ima03.plantuml)

### Armário

Todo armário possui várias prateleiras. Cada uma delas divididas em compartimentos. Em cada compartimento são armazenados objetos de dois tipos: livros e CDs. Cada compartimento pode guardar no máximo 3 livros, enquanto deve guardar 2, 4, 7, ou mais de 7 CDs.

No modelo acima Armário é uma composição de Prateleira, ou seja, não existe Prateleira sem que seja parte de um armário. Um raciocínio similar é válido entre Prateleira e Compartimento. Este último guarda vários objetos em seu interior. Até três livros e uma combinação exótica mas bem definida de CDs. Afinal, ou teremos 2, ou teremos 4, ou teremos 7, ou teremos um número superior a 7 CDs.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-03/mod03ima04/mod03ima04.plantuml)

### Toda lanchonete possui pelo menos 2 funcionários, é possível que um deles seja gerente.

Um funcionário pode desempenhar o papel de gerente de uma lanchonete. Cada funcionário, além da possibilidade de estar ligado à lanchonete via Gerência, é empregado da lanchonete.

![image](https://user-images.githubusercontent.com/1735792/90349460-534ee780-e010-11ea-9a6a-7fb0713f5c99.png)

### Carnê.

Todo carnê de prestações refere-se a uma determinada compra, que pode incluir vários produtos, em quantidades distintas para cada um deles. Cada prestação possui um valor correspondente e uma data limite para a quitação correspondente.

![image](https://user-images.githubusercontent.com/1735792/90349507-7ed1d200-e010-11ea-9315-58c56f4690cc.png)

### Uma frase é uma seqüência de palavras. Cada palavra é uma seqüência de caracteres.

Não queremos confusão com os lingüistas e, dessa forma, podemos estar assumindo que existe frase formada por apenas uma única palavra, conforme o modelo abaixo registra. Tirando este cenário no mínimo sui generis, todas as palavras estão em uma seqüência, assim como as letras correspondentes a cada uma delas.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-03/mod03ima07/mod03ima07.plantuml)

### Preço é uma combinação de um valor e uma moeda. Por exemplo, valor 10 e moeda dólar.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-03/mod03ima08/mod03ima08.plantuml)

### Período é formado por uma data inicial e uma data final.

Abaixo este cenário foi modelado com o emprego de associações. Também poderíamos ter empregado atributos na classe Período. A decisão entre estas opções é quase sempre uma questão do contexto para o qual o modelo está sendo construído. Se uma data é um elemento relevante do modelo, então trate-o como uma classe, doutra forma, um atributo é suficiente.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-03/mod03ima09/mod03ima09.plantuml)

### Florestas

Florestas são formadas por árvores que, por sua vez, são formadas por folhas. Cada folha possui sua forma, dentre todo um conjunto de formas possíveis. Existem árvores que participam de mais de uma floresta.

Se uma árvore pode participar de mais de uma floresta, então Floresta não é uma composição de Árvore, mas uma agregação. Por outro lado, não é razoável imaginar que uma folha possa participar de mais de uma árvore. Para cada Folha há um TipoFolha correspondente.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-03/mod03ima10/mod03ima10.plantuml)

