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

### Objeto

Uma aplicação trivial que cria uma instância da classe _Prova_. Nem a aplicação nem a classe _Prova_ são exibidas no modelo. Nenhum uso é feito desta classe, apenas o construtor é executado. O objeto criado não é anônimo. Ao contrário, é referenciado por _pf_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-objeto.png" width="350px">

### Classe abstrata

A classe _Pessoa_, contudo, agora abstrata. Ou seja, uma classe da qual não é
possível criar uma instância. Este tipo de classe é criada para ser estendida.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-abstract-pessoa.png" width="343px">

### Herança de classe abstrata

Uma classe abstrata herdada pelas classes _PessoaFísica_ e _PessoaJurídica_.

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-abstract-pessoa-pfj.png" width="200px">

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

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-6.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-association-8.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-composicao.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-composition.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-dependencia.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-heranca.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-heranca-simples.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-java-implements.png" width="300px">

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

<img src="https://github.com/kyriosdata/oo/raw/04/media/uml-abstract.png" width="300px">

<img src="https://github.com/kyriosdata/oo/raw/04/media/festa-convidado.png" width="300px">
