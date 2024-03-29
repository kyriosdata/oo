### Uma pessoa possui pode possuir zero ou mais hábitos.

Talvez nenhum hábito. Todo hábito está associado a uma pessoa, ou seja, conforme modelado abaixo, hábitos não são compartilhados, cada um possui os seus.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima01/mod02ima01.plantuml)

### Uma pessoa possui um nome, idade e hábitos. Um hábito possui uma descrição.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima02/mod02ima02.plantuml)

### Um círculo é descrito por uma posição (x,y), correspondente ao centro e um valor para o raio, além da possibilidade de ser transladado de um deslocamento em x e outro em y.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima03/mod02ima03.plantuml)

### Um círculo é descrito por um ponto, correspondente ao centro, e um valor para o raio. O círculo é transladado de um deslocamento em x e outro em y. (Alternativa para o modelo acima.)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima04/mod02ima04.plantuml)

### Um usuário de um sistema computacional é uma pessoa.

Embora o modelo abaixo permita que uma instância de Usuário seja tratada como uma instância de Pessoa, o que decorre da herança, convém ressaltar que um modelo alternativo, talvez melhor seja uma simples associação entre Usuário e Pessoa. Nesta associação, a instância de Usuário ressaltaria uma atividade, um papel que a instância de Pessoa correspondente desempenharia.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima05/mod02.ima05.plantuml)

### Um elefante é um mamífero.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima06/mod02ima06.plantuml)

### Um contêiner contém contêineres e objetos.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima07/mod02ima07.plantuml)

Observe que um contêiner agrega vários elementos. Ou seja, uma instância de Contêiner está associada, possivelmente, a vários objetos da classe Elemento. Estes objetos "fazem parte" (agregação) do contêiner em questão. Adicionalmente, o que é um Elemento? Um Elemento é herdado por Objeto e por Contêiner. Ou seja, quando se fala em um Elemento estamos falando ou de um Objeto ou de um Contêiner. Quando são reunidos vários objetos Elemento em um Contêiner, portanto, o que se tem "lá dentro" são instâncias de Objeto e/ou instâncias de Contêiner. 

### Caixeiro-viajante.

Um caixeiro-viajante faz uso de uma lista de cidades pelas quais terá que percorrer em uma viagem, na ordem fornecida e, para cada uma das cidades, colhe pedidos de armazéns lá localizados. A lista de cidades corresponde a uma viagem do caixeiro-viajante. Espera-se uma lista de cidades para cada viagem. Ou seja, um caixeiro-viajante está associado a várias viagens, cada uma delas é descrita por uma lista de cidades, conforme ilustrado abaixo. Observe que as cidades estão ordenadas (ordered).

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima08/mod02ima08.plantuml)

### Caixeiro-viajante e lista de pedidos.

Falta ao modelo acima informação pertinente aos pedidos colhidos em cada armazém. Naturalmente será preciso associar a lista de pedido ao armazém do qual esta foi gerada. Esta informação, contudo, não é suficiente, pois também será preciso identificar a viagem na qual esta foi definida. Uma alternativa é estabelecer uma associação de cada lista de pedido para o armazém do qual esta originou-se e outra com a viagem em questão, conforme modelado abaixo.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima09/mod02ima09.plantuml)

### Cliente e fornecedor envolvem-se em transações econômicas.

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-02/mod02ima10/mod02ima10.plantuml)
