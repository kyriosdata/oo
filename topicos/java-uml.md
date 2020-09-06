## Mapeamento Java para UML (e vice-versa)

> Esclarecer como pode ser realizado o mapeamento de UML para Java e vice-versa.

### Classe

A classe _Pessoa_, nenhum atributo, nenhum método e, portanto, corpo omitido.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-pessoa.png" width="300px">

### Classe com atributos

Os membros de dados _dia_, _mes_ e _ano_, todos do tipo _short_, todos privados (_private_) em Java e a correspondente versão na UML.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-4.png" width="300px">

### Classe com atributo e métodos

_Prova_ com um único atributo, _numQuestoes_. Naturalmente, insuficiente para
caracterizar uma prova, de qualquer forma, aqui o foco não é na modelagem,
mas no mapeamento entre modelos e Java. Adicionalmente, esta classe faz uso dos
famosos métodos _get_ e _set_, por meio dos quais, respectivamente, pode-se obter
o valor e definir um valor para _numQuestoes_. Observe que não é possível definir um
valor para o total de questões de uma prova menor que 1.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-5.png" width="400px">

Uma consideração adicional é feita abaixo para os métodos _get_ e _set_. Observe o que é chamado de "assinatura" dos métodos, o que inclui o tipo de retorno, parâmetros e nome do método.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-6.png" width="300px">

### Classe com membros

A classe _Pessoa_ com dois membros de dados, também chamados de propriedades, ou ainda atributos, além de duas associações com ela própria. As associações dão origem a dois membros de dados, _pai_ e _mae_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-8.png" width="300px">

### Objeto

Uma aplicação trivial que cria uma instância da classe _Prova_. Nem a aplicação nem a classe _Prova_ são exibidas no modelo. Nenhum uso é feito desta classe, apenas o construtor é executado. O objeto criado não é anônimo. Ao contrário, é referenciado por _pf_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-objeto.png" width="350px">

### Classe abstrata

A classe _Pessoa_, contudo, agora abstrata. Ou seja, uma classe da qual não é
possível criar uma instância. Este tipo de classe é criada para ser estendida.
Em tempo, extensão aqui tem o mesmo significado que herança (vista adiante).

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-abstract-pessoa.png" width="343px">

### Agregação

Uma _Festa_ possui pelo menos um _Convidado_ que, por sua vez, pode ser convidado de várias festas.

<img src="https://github.com/kyriosdata/oo/raw/04/media/festa-convidado.png" width="300px">

### Agregação e associação

A classe _Uniao_ está associada a duas instâncias de _Pessoa_ pela associação rotulada por _Casamento_. Ou seja, admite casamento exatamente entre duas pessoas. Adicionalmente, desta união podem derivar filhoes, zero ou mais.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-aggregation.png" width="350px">

### Associação n:n

Um aluno pode estar matriculado em vários cursos e, naturalmente, cada curso pode ter vários alunos matriculados.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association.png" width="350px">

### Programa em Java

Tradução do algoritmo da esquerda para a versão correspondente em Java.
Embora a correspondência esteja correta, em Java não é usual métodos possuírem
inicial maiúscula, como ocorre com C#. Estas convenções devem ser observadas
visando melhor interação entre membros de uma equipe.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-1.png" width="300px">

### Composição

A classe _Religiao_ e seu conjunto de devotos. A implementação em Java, contudo,
faz uso de uma lista. Convém ressaltar que conjunto não admite duplicidade,
o que talvez seja mais natural, contudo, uma lista em Java admite duplicidade.
Adicionalmente, nesta implementação, a _Religiao_ conhece cada _Devoto_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-composicao.png" width="300px">

### Composição (associação bidirecional)

_Religiao_ possui devotos (_Devoto_), contudo, cada _Devoto_ sabe qual
a _Religicao_ correspondente, e cada _Religia_ conhece seus devotos.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-composition.png" width="300px">

### Dependências explícitas

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-dependencia.png" width="300px">

### Herança

Neste caso, diz-que _Aluno_ estende _Pessoa_. Noutras palavras, _Aluno_ **é** uma _Pessoa_. Esta herança, contudo, talvez possa ser melhor expressa como "aluno é uma atribuição de uma pessoa", ou ainda "uma pessoa, ao longo da vida, desempenha várias atividades, inclusive de ensino".

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-heranca.png" width="300px">

### Herança (termos)

A classe que herda é dita _derivada_. A classe herdada é dita _base_. Também
é usual e correto o uso de _ancestral_ para a classe _base_ e _derivada_ para a classe _derivada_. Adicionalmente, observe que há uma _especialização_ da classe _base_ para a classe _derivada_. No sentido oposto, ocorre a _generalização_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-heranca-simples.png" width="300px">

### Herança de classe abstrata

Uma classe abstrata herdada pelas classes _PessoaFísica_ e _PessoaJurídica_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-abstract-pessoa-pfj.png" width="200px">

### Herança (pessoa)

A classe abstrata _Pessoa_ modela o cenário onde existe instância de _PessoaFísica_ ou de _PessoaJurídica_ que, conforme ilustrado, acrescenta informações específicas àquelas herdadas de _Pessoa_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-abstract.png" width="300px">

### Implementação de interface

Não se confunde com herança. Quando uma classe implementa uma interface, então esta classe possui métodos que permitem se comportar conforme definido na interface. Herança, por outro lado, é o tipo "mais forte" de relacionamento entre duas classes.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-implements.png" width="300px">

### Interface

A interface _Identificacao_ para indicar que, qualquer classe que a implementa,
pode receber a mensagem _getNome_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-interface.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-interface-nota-comparable.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-interface-nota-comparable2.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-package.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-package2.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-pds.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-pessoa-detalhes.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-pessoa-3.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-casa.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-casa-nascimento.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-construtor.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-livro.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-livro-objeto.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-object.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-permuta.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-revista-referencia.png" width="300px">
