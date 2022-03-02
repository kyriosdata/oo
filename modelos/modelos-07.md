### Cartas

Em um jogo de cartas há dois tipos de conjuntos delas: um conhecido por “monte” e outro para cada jogador. O conjunto de cartas com cada jogador pode variar a cada jogada. O conjunto de cartas do monte também pode variar a cada jogada. Uma jogada é executada por um jogador e consiste em retirar uma carta daquelas disponíveis para serem “compradas” e, se assim preferir, esta carta pode ser substituída por alguma carta do conjunto de cartas do jogador. Neste caso, a carta substituída é depositada no monte. Um jogo é definido por uma sequência de jogadas.

![image](https://user-images.githubusercontent.com/1735792/90355034-7c2ba880-e021-11ea-87b6-828a52d5a688.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima01/mod07ima01.png" width="720">

#imagem01

### Círculo (pergunta 1)

Quais das associações abaixo é mais adequada para representar que um círculo, além de outras propriedades, não exibidas, possui um ponto como centro? Justifique.

![image](https://user-images.githubusercontent.com/1735792/90355082-ad0bdd80-e021-11ea-9c79-20931e4818c5.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima02/mod07ima02.png" width="800">

#imagem02


### Círculo (pergunta 2)

Quais dos modelos abaixo é mais adequado para representar o fato de que um círculo possui um ponto como centro? Justifique.

![image](https://user-images.githubusercontent.com/1735792/90355082-ad0bdd80-e021-11ea-9c79-20931e4818c5.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima03/mod07ima03.png" width="800">

#imagem03

A segunda versão oferece maior independência entre entidades distintas. Observe que na primeira versão é necessário conhecer como se move um ponto para que o círculo seja deslocado. Na segunda versão, sabe-se que para mover um círculo basta mover o centro deste círculo, cujo conhecmento correspondente para tal é melhor depositado na classe Ponto, em vez da classe Círculo, que entende de círculos.

Observe ainda que esta idéia não escala. Para um triângulo teríamos três pares ordenados, ou seja, seis propriedades para representar os três pontos. Já pensou em um polígono?

### Associações

Quais dos relacionamentos entre as classes abaixo é o mais adequado? Justifique.

![image](https://user-images.githubusercontent.com/1735792/90355289-518e1f80-e022-11ea-9e61-048030399b9f.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima04/mod07ima04.png" width="720">

#imagem04

Seria interessante afirmar que a herança está definitivamente errada e a associação está definitivamente correta. Contudo, a resposta depende do cenário em questão. Cenário omitido nos deixa apenas com especulações.

Uma possibilidade. Um usuário representa um papel dentre todo um conjunto deles que um ser humano (pessoa) pode desempenhar. Por exemplo, usuário e aluno podem ser papéis desempenhados por uma pessoa ao longo de sua vida. Se empregarmos a herança, então “confundimos” o papel com a pessoa. De fato, todo usuário é uma pessoa, contudo, tratar João da Silva Sauro como usuário e termos dificuldade de dissociar a pessoa do papel de usuário que este desempenha não parece elegante. O diagrama abaixo apresenta um modelo compatível com esta perpsectiva.

![image](https://user-images.githubusercontent.com/1735792/90355446-bea1b500-e022-11ea-9206-684460d7b66e.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima05/mod07ima05.png" width="800">

#imagem05

### Herança e agregação

Abaixo segue um diagrama contendo duas classes e dois relacionamentos.

![image](https://user-images.githubusercontent.com/1735792/90355517-f6a8f800-e022-11ea-87ef-5bf37eaa9f99.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima06/mod07ima06.png" width="300">

#imagem06

As classes A e B representam com mais fidelidade qual par de itens abaixo, respectivamente?

(a) moradia/casa;
(b) ItemDiretório/Diretório;
(c) Convidado/Festa
(d) Jogador/Time.

### Fidelidade de modelo

Prática de programação e Programação podem ser as classes referenciadas, respectivamente, por A e B no diagrama abaixo? (Assuma que programação refere-se a um esforço de desenvolvimento de código, ou seja, trata-se de uma prática de programação, que pode envolver várias atividades de desenvolvimento.) Justifique.

![image](https://user-images.githubusercontent.com/1735792/90355758-b0a06400-e023-11ea-9374-0de53bb4cd9b.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima07/mod07ima07.png" width="300">

#imagem07

### Revisão

Seja uma revisão um caso particular de versão de um produto de software. Todo software pode estar relacionado a várias versões (pelo menos uma). Para cada versão podem existir revisões subseqüentes, uma após a outra, em uma seqüência bem definida. Este cenário é modelado adequadamente pelo diagrama abaixo? Justifique.

![image](https://user-images.githubusercontent.com/1735792/90355800-d463aa00-e023-11ea-9ba4-6f077e0c3e83.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima08/mod07ima08.png" width="720">

#imagem08

Segundo este modelo, um software pode estar associado a várias versões. Contudo, pode existir software sem versão e, portanto, a cardinalidade deve ser ajustada.

Toda revisão é uma versão, conforme a herança, e não pode haver revisão sem uma instância de Versão que a preceda. Observe que para cada Revisão há uma Versão que desempenha o papel de anterior, conforme associação entre Revisão e Versão. Esta mesma associação também mostra que pode haver Revisão que irá suceder uma Versão, mas não se trata de uma obrigatoriedade, conforme a cardinalidade 0..1. Se existir, então a versão precede a revisão e, naturalmente, a revisão sucede a versão, em uma ordem muito bem definida.

O modelo contempla a situação de uma versão ser sucedida por uma seqüência bem definida de revisões? Vimos que para uma versão pode haver uma revisão. Caso exista uma revisão, sabemos que uma revisão também é uma versão, conforme a herança. Em conseqüência, toda revisão também pode possuir um sucessor, um próximo, pois uma versão pode possuir um próximo e uma revisão é uma versão. Ou seja, uma mesma instância de Revisão pode participar de duas associações: (a) como uma revisão e, neste caso, desempenha o papel de próximo de alguma versão e (b) como uma versão e, neste caso, desempenha o papel de anterior em alguma instância da associação que liga esta revisão à revisão seguinte.

O diagrama de objetos abaixo pode ser útil na compreensão deste modelo. Observe que uma instância de Software está ligado a três versões identificadas por v1, v2 e v3. Estas ligações são instâncias da associação entre as classes Software e Versão, exibida na figura anterior.

![image](https://user-images.githubusercontent.com/1735792/90355840-efceb500-e023-11ea-951b-decc2a4353c5.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima09/mod07ima09.png" width="800">

#imagem09

Se observarmos as instâncias v32 e v21 veremos que estas não participam de ligações onde desempenham o papel de anterior. Naturalmente, sempre teremos, em determinado instante de tempo, a última revisão para determinada versão. Ao observarmos o diagrama de classe veremos que uma revisão também é uma versão e, portanto, pode existir ou não uma instância de Revisão que sucede uma determinada versão. As instâncias citadas, v32 e v21, são exemplos de versões, pois são instâncias de Revisão, para as quais não há sucessores.

Enquanto v32 e v21 podem ou não possuir sucessores como versões, necessariamente possuem antecessores como revisões. Observe que o antecessor de uma revisão é uma instância de Versão que, portanto, pode ser outra revisão ou uma instância de Versão.

A instância v21 possui uma versão que a precede: v2. Esta ligação é “expliciatamente” modelada pela associação entre Versão e Revisão. A instância v32 possui como anterior uma revisão: v31. Esta ligação não é “explicitamente” modelada pela associação, como dizem alguns, pois a associação é entre Versão e Revisão. Devemos estar atentos, contudo, ao fato de uma Revisão ser uma Versão e, portanto, uma instância de Revisão pode estar associada a outra instância de Revisão. Neste caso, a primeira delas desempenha o papel de anterior, enquanto a segunda o papel de próximo. Este é exatamente o cenário exibido no diagrama com os objetos acima.

### Restaurante

Clientes de um restaurante sentam-se em mesas. Em geral, um ou mais clientes compartilham uma mesma mesa. Dada uma mesa é desejado conhecer todos os clientes que já fizeram uso desta mesa. Comente o modelo abaixo para representar este cenário.

![image](https://user-images.githubusercontent.com/1735792/90355884-18ef4580-e024-11ea-928e-a7560d1d35de.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima10/mod07ima10.png" width="800">

#imagem10

Se tratarmos pessoa como cliente e, conforme o enunciado, estivermos interessado em conhecer aqueles que tiveram o privilégio de se sentar à mesa de interesse, então o modelo esta completo. Se observarmos a nota ligada à classe Pessoa, contudo, seremos obrigados a reconhecer que a associação deve ser bidirecional, pois também gostaríamos de obter todas as mesas ocupadas por determinada pessoa.

A realidade, contudo, é um pouco diferente do que o enunciado estabelece. Por exemplo, conforme modelado, para uma mesa, digamos M, saberemos todas as pessoas que ocuparam algum lugar nesta mesa. Não saberemos, contudo, em que momento ocorreu esta ocupação. Também não saberemos a ordem em que estas pessoas ocuparam M, se nos primeiros dias do restaurante ou apenas mais recentemente. Também não saberemos quais os grupos que se formaram nesta mesa, ou seja, quem estava acompanhado de quem. Também não saberemos quantas vezes uma determinada pessoa sentou-se nesta mesa, ou seja, se se trata de um usuário casual ou freqüentador assíduo deste restaurante suspeito. Muitas informações não são possíveis de serem registradas com este modelo.

### Mesas ocupadas

Em restaurantes, mesas são ocupadas por pessoas ao longo do tempo. O modelo abaixo adequadamente reflete este fato? Justifique.

![image](https://user-images.githubusercontent.com/1735792/90355935-3d4b2200-e024-11ea-8bd8-b055714fb981.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima11/mod07ima11.png" width="500">

#imagem11

Veja que uma pessoa pode ocupar mesas e que uma mesa pode ser ocupada por pessoas. Esta ocupação ocorre em determinada data e, portanto, o modelo permite estabelecer um histórico, ao longo do tempo, de quem ocupou qual mesa. Com a identificação do tempo em que a ocupação ocorreu, pode-se estabelecer uma ordem das ocupações e, com algum esforço, até especular quais foram os grupos (pessoas) que se sentaram a mesa em determinada data.

### Agência bancária

Alguém estava preocupado, em uma grande agência bancária de Goiânia, com um modelo que refletisse as filas que lá eram freqüentes. Neste momento surge um funcionário! Extrovertido, logo tratou de apresentar os dois modelos seguintes. Explicou ambos e concluiu que o segundo é superior. Qual o argumento que o funcionário provavelmente utilizou para convencer seus ouvintes?

![image](https://user-images.githubusercontent.com/1735792/90355972-5eac0e00-e024-11ea-8d0f-f79b09f52c2e.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima12/mod07ima12.png" width="1200">

#imagem12

A versão à esquerda apenas agrupa clientes em uma fila, o que é pouco para organizar de forma justa o atendimento. Para tal é preciso estabelecer uma seqüência de atendimento e, neste caso, precisamos de ordenar nos clientes, conforme a versão fornecida à direita.

### Ônibus

Ao longo de sua vida útil um ônibus transporta um grande número de passageiros. Represente os passageiros transportados por um ônibus para cada uma de suas viagens.

![image](https://user-images.githubusercontent.com/1735792/90356025-813e2700-e024-11ea-934b-478d653db07e.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima13/mod07ima13.png" width="800">

#imagem13

Para cada ônibus podem existir várias viagens. Para cada viagem temos exatamente um único ônibus. Cada viagem envolve vários passageiros. Se desejarmos saber qual a origem, o destino, o horário de partida e chegada e o motorista pode ser que o modelo resultante se pareça com aquele abaixo.

![image](https://user-images.githubusercontent.com/1735792/90356054-961aba80-e024-11ea-90a3-786ecd2e0b70.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima14/mod07ima14.png" width="1000">

#imagem14

### Feriados

Ao longo de um ano há muitos dias que são feriados, enquanto outros referem-se a acontecimentos relevantes (seja uma data de aniversário ou outro).

![image](https://user-images.githubusercontent.com/1735792/90356081-aa5eb780-e024-11ea-9831-7c4f42f3b45a.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima15/mod07ima15.png" width="1000">

#imagem15

O modelo acima apenas registra, para um dado calendário de um certo ano, quais os feriados e datas relevantes. Não é possível, contudo, registrar o acontecimento relevante ou de quem é o aniversário, por exemplo. O modelo abaixo, por outro lado, já permite um número maior de informações que podem ser úteis ao contexto considerado.

![image](https://user-images.githubusercontent.com/1735792/90356096-b8143d00-e024-11ea-973e-d049b3af4144.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima16/mod07ima16.png" width="1000">

#imagem16

### Linha

Uma classe Linha com duas composições para uma classe Ponto, cujos papéis são p1 e p2 é uma versão melhor que uma classe Linha associada a Ponto onde o extremo da associação com Ponto possui cardinalidade 2 e encontra-se ordenado? Justifique.

![image](https://user-images.githubusercontent.com/1735792/90356117-cc583a00-e024-11ea-96f2-03aa1534bcba.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima17/mod07ima17.png" width="1000">

#imagem17

As duas propostas são equivalentes. Contudo, caso seja interesse ressaltar que uma linha é formada por dois pontos (definida por dois pontos), então a primeira versão é mais explícita.

### Computador do estudante

No âmbito da UFG, cada estudante possui um computador, que não é compartilhado com nenhum outro estudante. Fora da UFG, contudo, nem todos os alunos têm computador, enquanto alguns possuem vários computadores.

![image](https://user-images.githubusercontent.com/1735792/90356160-f14cad00-e024-11ea-8f6d-0b93369d02ae.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima18/mod07ima18.png" width="600">

#imagem18

Se na UFG cada aluno possui um computador, então da esquerda para a direita a associação UFG reflete este cenário. Contudo, isto não é suficiente para deduzir que todo computador possui um “aluno-dono”, o que justifica a cardinalidade do lado esquerdo. Nos domicílios dos estudantes, contudo, o cenário é diferente. Um aluno pode estar associado a vários computadores e um computador pode estar associado a vários alunos. Convém lembrar que alguns alunos podem compartilhar um mesmo computador fora da UFG.

### Expressões aritméticas

Modele expressões aritméticas como sendo sequências ordenadas de elementos que são operadores ou operandos.

![image](https://user-images.githubusercontent.com/1735792/90356221-1f31f180-e025-11ea-9799-940e6e4b9afc.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima19/mod07ima19.png" width="600">

#imagem19

Não cabe assegurar, via estrutura, que as sentenças são válidas. Este tipo de verificação é melhor realizado por software, não por um modelo. Sentenças aritméticas, válidas ou não, podem ser registradas conforme o modelo acima.

### Associações

Uma classe Associação possui uma associação que parte dela para ela mesma. Em ambos os extremos a cardinalidade é 1. Em um deles o papel é para, enquanto no outro é de. O nome da associação é Relação. Outra classe, denominada de Classe, possui uma associação que também parte dela para ela mesma. Os papéis são, à semelhança do caso anterior, para e de. Neste última associação, contudo, o nome é Associação e nenhuma cardinalidade foi fornecida. Quais destas classes, com a respectiva associação representa um modelo mais consistente? Justifique.

![image](https://user-images.githubusercontent.com/1735792/90356359-b303bd80-e025-11ea-8d73-27380ff0e5b3.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima20/mod07ima20.png" width="800">

#imagem20

Nomes são relevantes. Sabemos que uma associação é um relacionamento entre classes. Desta forma, de imediato, a versão mais à direita do modelo acima parece mais consistente. Contudo, apenas para associações unidirecionais, dado que os papéis são `de` e `para`. Associações bidirecionais com tais papéis não seriam adequadas.

A versão mais à esquerda informa que uma associação está relacionada à outra de forma unidirecional. É fácil perceber que semanticamente
este modelo carece de consistência, o que tornaria a versão da
direita mais adequada, apesar de considerar apenas associações
unidirecionais.

### Pixel (picture element)

Uma imagem é um conjunto de pixels, cada um deles possui uma determinada posição e uma cor. Faça a modelagem de uma imagem. Em tempo, um pixel (picture element) é a menor unidade exibida em um monitor.

![image](https://user-images.githubusercontent.com/1735792/90356594-7389a100-e026-11ea-898b-4396e9da3493.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima21/mod07ima21.png" width="720">

#imagem21

### Diretor

Estabeleça relações entre as classes Diretor, Vice-diretor, Docente, Funcionário e Aluno sabendo-se que, diretor e vice-diretor são docentes. Caso considere apropriado, acrescente outras classes. Um docente também pode ser funcionário e, possivelmente, também aluno.

![image](https://user-images.githubusercontent.com/1735792/90356643-9451f680-e026-11ea-81f8-ff201db6d138.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima22/mod07ima22.png" width="720">

#imagem22

No modelo acima, diretor, vice-diretor e demais elementos fornecidos foram tratados como casos particulares de cargo. Embora não seja natural tratar um aluno como ocupante de um cargo em uma instituição de ensino, este modelo permite relacionar um ser humano com vários “cargos”, o que é uma situação típica.

### Um presidente nomeia ministros e este seus respectivos assessores.

![image](https://user-images.githubusercontent.com/1735792/90356680-b3508880-e026-11ea-81a9-f89ffbda16dc.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima23/mod07ima23.png" width="1000">

#imagem23

Em um cenário mais realístico pode ser necessário indicar, por exemplo, a data da nomeação, entre outras. Uma classe associativa pode registrar a informação data de nomeação, caso seja necessário.

### Usuário e seu disco

Todo usuário possui, para cada arquivo nos diretórios de um disco, acesso de escrita, leitura e/ou gravação.

Um disco pode ser interpretado como uma composição de arquivos. Entre um usuário e um arquivo há uma permissão, que indica o grau de poder do usuário. Isto é melhor modelado como uma classe associativa, conforme abaixo. A interpretação é simples: dado um arquivo e um usuário nós teremos, necessariamente, uma permissão. Os atributos de uma classe associativas são atributos da associação. Lembre-se de que classe associativa é uma construção que possui características tanto de uma associação como de uma classe.

Para que não haja dúvida, dado um aluno e um arquivo associados, teremos os atributos leitura, escrita e execução, conforme o diagrama abaixo.

![image](https://user-images.githubusercontent.com/1735792/90356726-dd09af80-e026-11ea-8baa-59c421cf2ea5.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima24/mod07ima24.png" width="1200">

#imagem24

### Objetos e mensagens

Em um sistema orientado a objetos, objetos cooperam uns com os outros através da troca de mensagens.

![image](https://user-images.githubusercontent.com/1735792/90356747-f27ed980-e026-11ea-97f4-b4bd72df03b8.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima25/mod07ima25.png" width="300">

#imagem25

Uma mensagem é, necessariamente, um relacionamento direcionado de um objeto para outro. Para que exista uma mensagem é necessário a existência de um objeto que envia a mensagem. Para que esta possa ser enviada, é preciso a existência do objeto destino. Observe que a origem e o destino podem ser distintos. Não necessariamente precisam ser o mesmo objeto, nem o modelo acima sugere que seja o mesmo objeto, apesar de muitos se enganarem.

O modelo acima é interpretado da seguinte forma: dada uma instância obj de Objeto, podem existir várias instâncias de Objeto relacionadas a obj através da associação Mensagem. Ou seja, de obj podem partir várias ligações para instâncias de Objeto. O destino destas mensagens podem ser o próprio objeto, pois um objeto pode enviar várias mensagens, inclusive para si próprio.

A associação, contudo, não permite descreve qual a mensagem, o que pode ser uma informação de interesse e não apenas quais são os objetos que recebem mensagem de determinado objeto. Em conseqüência, o modelo abaixo parece mais completo.

![image](https://user-images.githubusercontent.com/1735792/90356763-075b6d00-e027-11ea-87d2-e344d905f6c7.png)

<img src="https://github.com/marcuspadilha/oo/blob/master/Imagens/modelos-07/mod07ima26/mod07ima26.png" width="600">

#imagem26
