## Mapeamento Java para UML (e vice-versa)

> Esclarecer como pode ser realizado o mapeamento de UML para Java e vice-versa.

### Classe

A classe _Pessoa_, nenhum atributo, nenhum método em uma representação na
UML onde tais elementos não foram considerados relevantes para o interesse em questão.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-pessoa-3.png" width="100px">

A relação entre esta classe e o código Java correspondente. 

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-pessoa.png" width="350px">

Outro exemplo de relação entre código em Java e classe na UML.

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-livro.png" width="350px">

Outras versões alternativas para representação de uma classe. 
Em tempo, qual usar? Dependendo do contexto será relevante registrar
um membro de dados, por exemplo, enquanto noutro, tal informação
pode não ser necessária. 

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-pessoa-detalhes.png" width="350px">

### Classe com atributos

Os membros de dados _dia_, _mes_ e _ano_, todos do tipo _short_, todos privados (_private_) em Java e a correspondente versão na UML.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-4.png" width="350px">

Membros de dados, em geral, quando referenciam "tipos" clássicos, conforme
ilustrados abaixo, são representados sem a indicação explícita das associações.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-pds.png" width="350px">

Ainda é possível a opção abaixo.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-dependencia.png" width="350px">


### Classe com atributo e métodos

_Prova_ com um único atributo, _numQuestoes_. Naturalmente, insuficiente para
caracterizar uma prova, de qualquer forma, aqui o foco não é na modelagem,
mas no mapeamento entre modelos e Java. Adicionalmente, esta classe faz uso dos
famosos métodos _get_ e _set_, por meio dos quais, respectivamente, pode-se obter
o valor e definir um valor para _numQuestoes_. Observe que não é possível definir um
valor para o total de questões de uma prova menor que 1.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-5.png" width="400px">

Uma consideração adicional é feita abaixo para os métodos _get_ e _set_. Observe a assinatura dos métodos, ou seja o tipo de retorno, parâmetros e nome do método.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-6.png" width="350px">

### Classe com membros

A classe _Pessoa_ com dois membros de dados, também chamados de propriedades, ou ainda atributos, além de duas associações com ela própria. As associações dão origem a dois membros de dados, _pai_ e _mae_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-8.png" width="350px">

### Classe _Object_

A classe _Object_ é a classe base de toda e qualquer classe em Java. Noutras
palavras, todo e qualquer objeto em Java possui os métodos citados abaixo.

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-object.png" width="350px">

Em consequência, apesar de correto, não é usual nem o código nem o 
diagrama abaixo, embora ambos estejam corretos.

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-livro-objeto.png" width="300px">

### Objeto

Uma aplicação trivial que cria uma instância da classe _Prova_. Nem a aplicação nem a classe _Prova_ são exibidas no modelo. Nenhum uso é feito desta classe, apenas o construtor é executado. O objeto criado não é anônimo. Ao contrário, é referenciado por _pf_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-objeto.png" width="350px">

### Como se cria um objeto?

Observe a classe _Casa_ e seu construtor. Em tempo, construtor é a 
operação executada quando se cria uma instância da classe. 

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-casa.png" width="300px">

Abaixo a classe _Casa_ é estendida com o método _main_, o que a torna
"executável". Em geral classes não são "executáveis" no sentido em 
dão origem a programas. Em geral, um programa ou aplicação cria classe
específica para tal e que usa outras classes. De qualquer forma, veja
abaixo como uma instância da própria classe é criada por meio do
operador _new_, que dispara a execução do construtor. 

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-construtor.png" width="350px">

Na figura abaixo, para que não persista dúvida, antes do uso do 
operador _new_ não há instância da classe _Casa_. Após a execução
satisfatória do construtor, por outro lado, uma instância é criada, o
objeto correspondente é referenciado por _c_. 

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-casa-nascimento.png" width="300px">


### Classe abstrata

A classe _Pessoa_, contudo, agora abstrata. Ou seja, uma classe da qual não é possível criar uma instância. Este tipo de classe é criada para ser estendida. Em tempo, extensão aqui tem o mesmo significado que herança (vista adiante).

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-abstract-pessoa.png" width="343px">

### Agregação

Uma _Festa_ possui pelo menos um _Convidado_ que, por sua vez, pode ser convidado de várias festas.

<img src="https://github.com/kyriosdata/oo/raw/04/media/festa-convidado.png" width="350px">

### Agregação e associação

A classe _Uniao_ está associada a duas instâncias de _Pessoa_ pela associação rotulada por _Casamento_. Ou seja, admite casamento exatamente entre duas pessoas. Adicionalmente, desta união podem derivar filhoes, zero ou mais.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-aggregation.png" width="350px">

### Associação n:n

Um aluno pode estar matriculado em vários cursos e, naturalmente, cada curso pode ter vários alunos matriculados.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association.png" width="370px">

### Algoritmo para Java

Tradução do algoritmo da esquerda para a versão correspondente em Java.
Embora a correspondência esteja correta, em Java não é usual métodos possuírem inicial maiúscula, como ocorre com C#. Estas convenções devem ser observadas visando melhor interação entre membros de uma equipe.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-1.png" width="350px">

### Aplicação Java

Aplicação que exibe todas possíveis da cadeia de caracteres fornecida na entrada.
Observe que uma instância anônima de _String_ e o parâmetro fornecido via linha de comandos são fornecidos para o método _Permutacao_ no método _main_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-permuta.png" width="350px">

### Composição

A classe _Religiao_ e seu conjunto de devotos. A implementação em Java, contudo,
faz uso de uma lista. Convém ressaltar que conjunto não admite duplicidade,
o que talvez seja mais natural, contudo, uma lista em Java admite duplicidade.
Adicionalmente, nesta implementação, a _Religiao_ conhece cada _Devoto_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-composicao.png" width="350px">

### Composição (associação bidirecional)

_Religiao_ possui devotos (_Devoto_), contudo, cada _Devoto_ sabe qual
a _Religicao_ correspondente, e cada _Religia_ conhece seus devotos.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-composition.png" width="350px">

### Herança

Neste caso, diz-que _Aluno_ estende _Pessoa_. Noutras palavras, _Aluno_ **é** uma _Pessoa_. Esta herança, contudo, talvez possa ser melhor expressa como "aluno é uma atribuição de uma pessoa", ou ainda "uma pessoa, ao longo da vida, desempenha várias atividades, inclusive de ensino".

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-heranca.png" width="300px">

### Herança (termos)

A classe que herda é dita _derivada_. A classe herdada é dita _base_. Também
é usual e correto o uso de _ancestral_ para a classe _base_ e _derivada_ para a classe _derivada_. Adicionalmente, observe que há uma _especialização_ da classe _base_ para a classe _derivada_. No sentido oposto, ocorre a _generalização_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-heranca-simples.png" width="300px">

### _Revista_ herda de _Referência_

<img src="https://github.com/kyriosdata/oo/raw/04/media/java-revista-referencia.png" width="350px">

### Herança de classe abstrata

Uma classe abstrata herdada pelas classes _PessoaFísica_ e _PessoaJurídica_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-abstract-pessoa-pfj.png" width="300px">

### Herança (pessoa)

A classe abstrata _Pessoa_ modela o cenário onde existe instância de _PessoaFísica_ ou de _PessoaJurídica_ que, conforme ilustrado, acrescenta informações específicas àquelas herdadas de _Pessoa_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-abstract.png" width="300px">

### Implementação de interface

Não se confunde com herança. Quando uma classe implementa uma interface, então esta classe possui métodos que permitem se comportar conforme definido na interface. Herança, por outro lado, é o tipo "mais forte" de relacionamento entre duas classes.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-implements.png" width="450px">

### Interface

A interface _Identificacao_ para indicar que, qualquer classe que a implementa,
pode receber a mensagem _getNome_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-interface.png" width="350px">

### Interface _Comparable_
Em Java, pode-se ordenar instâncias de objetos via [Collections](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List)). Como é possível estar implementada a ordenação de objetos 
de uma dada classe que nem era conhecida quando a ordenação foi implementada? Há alternativas em Java, a clássica é implementar a interface
[Comparable](https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html), conforme ilustrado abaixo.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-interface-nota-comparable.png" width="300px">

Abaixo segue uma representação alternativa àquela acima.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-interface-nota-comparable2.png" width="200px">

### Package
A orientação a objetos oferece o conceito de classe para decompor software.
Alguns domínios, contudo, são extensos e várias classes podem ser necessárias para registrar parte do domínio em questão. Em Java, várias
classes "coesas" podem ser agrupadas usando a noção de _package_. Abaixo segue a ilustração de um _package_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-package.png" width="300px">

No domínio acadêmico, por exemplo, várias classes pertinentes ao ensino, em geral, podem estar no _package_ denominado _ensino_, conforme abaixo. Em tal _package_ são esperadas classes como _Aluno_, _Avaliação_ e outras. No _package_ denominado _escola_, por outro lado, que depende de _ensino_, ou seja, faz uso de classes deste _package_, são esperadas classes como
_Colaborador_, _Diretoria_ e outras.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-package2.png" width="400px">


