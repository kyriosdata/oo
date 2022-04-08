### Comente o diagrama abaixo

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-08/mod08ima01/mod08ima01.plantuml)

O diagrama informa que para uma instância da classe B há uma instância de A, via a associação que é uma agregação, da qual B é membro. A composição diz que, para uma instância de B tem-se que esta é parte de uma instância de A e, portanto, sugere que uma instância de B pode ser parte de uma instância de A e membro de outra, ao mesmo tempo. Para ressaltar que uma instância de B pode estar associada a uma instância de A por uma associação ou, exclusivamente por outra, a cardinalidade destas associações do lado da classe A deveria ser 0..1.

### Marque os itens abaixo que sugerem a quebra do princípio de substituição de Liskov.

O princípio de substituição de Liskov é atendido quando, onde é esperada uma instância de um determinado tipo, qualquer instância de um subtipo daquele esperado pode ser fornecido. Cada item é uma relação (herança) entre dois nomes que devem ser interpretados da seguinte forma: o primeiro refere-se à superclasse e o segundo à subclasse.

(a) Biblioteca/Livro
(b) Telefone/Comunicação
(c) Animal/Macaco
(d) Música/CD-ROM
(e) Janela/Vidro
(f) Moradia/Casa
(g) Retângulo/Quadrado

Quebrar o princípio de substitutição de Liskov é fazer uso de uma herança na qual uma instância da subclasse não pode se comportar adequadamente como uma instância da superclasse.

Dos itens acima, claramente: (a) um livro não se comporta como uma biblioteca pois, por exemplo, biblioteca tem horário de funcionamento, local, telefone, funcionários e várias outras considerações que simplesmente não existem em um livro; (b) comunicação não se comporta como telefone pois, por exemplo, telefone tem marca, cor e peso, entre outras, que não estão presentes em uma comunicação; (d) CD-ROM não se comporta como música, por exemplo, porque música possui compositor e intérpretes, entre outros, não presentes em um CD-ROM; (e) Uma janela possui um estado que pode ser aberta ou fechado, o que não existe em vidro; (g) em um retângulo podemos atribuir um valor para dois dos lados e outro valor para os outros dois lados, o que não é possível em um quadrado.

### Analise o diagrama

Analise cada um dos itens abaixo. Entenda cada item como um cenário. Para cada um deles, verifique se o modelo abaixo o contempla, ou seja, se o cenário pode ocorrer dado o modelo fornecido. Também entenda que a palavra “revisão” deve ser interpretada como uma instância criada a partir da classe Revisão e a palavra “versão” como uma instância criada a partir da classe Versão. Por último, “software” é uma instância criada a partir da classe Software.

![image](https://user-images.githubusercontent.com/1735792/90354870-ec85fa00-e020-11ea-88b5-191ec0652cd2.png)

(a) Há softwares e nenhum deles possui uma revisão.
(b) Há revisão sem software.
(c) Há versão sem revisão.
(d) Há revisões sem versão.
(e) Pode haver mais versões que revisões.
(f) Pode haver mais revisões que versões.
(g) Para cada revisão há uma versão correspondente.
(h) Para cada versão há uma revisão correspondente.
(i) Uma revisão não pode participar de uma ligação com outra revisão da qual a primeira desempenha o papel de próximo.

Itens verdadeiros: (a), (b), (c), (d), (e), (f) e (i)

Itens falsos: (g) e (h)

Itens comentados: (d) observe que uma instância de Revisão está associada, necessariamente, a uma instância que pode se comportar como uma instância de Versão através da associação na qual esta instância desempenha o papel de anterior. Observe que não é necessário a criação de uma instância de Versão, afinal, toda instância de Revisão pode se comportar como uma Versão. Se tivermos apenas instâncias de Revisão então elas formarão um ciclo onde uma sucede e precede qualquer outra. (g) pelo comentado no item (d) observa-se que podemos criar várias instâncias de Revisão sem explicitamente criarmos instâncias de Versão.

### Adapter

Uma empresa de grande tradição no ramo de materiais esportivos, com milhares de funcionários, faz uso de um sistema de folha de pagamento fornecido por uma empresa goiana. O sistema da folha de pagamento faz uso de inúmeras informações fornecidas pelos vários sistemas em operação da empresa de materiais esportivos. A interação entre o sistema da folha de pagamento e os sistemas da empresa de materiais esportivos sempre é um problema. Motivo: grande volatilidade dos sistemas da empresa de materiais esportivos. Embora as informações requisitadas pela folha de pagamento nunca tenham sido alteradas, as mudanças nos sistemas da empresa de materiais esportivos sempre forçaram mudanças no código do sistema da folha de pagamento com o propósito de obter, como já sabemos, as mesmas informações. Questão: modele uma solução para este problema.

Um dos padrões de projeto orientado a objetos é conhecido por Adapter. Quando duas partes precisam de interagir e uma delas sofre freqüentes mudanças, pode-se empregar o padrão Adapter para encapsutar a parte volátil e oferecer uma interface estável para uso da outra parte.
Tratando FolhaPagamento como uma destas partes, a parte estável, SistemasEsporte como a partil volátil, abstratamente representando os sistemas existentes na empresa de materiais esportivos, InterfaceExigida como o conjunto de requisições da folha de pagamento com o propósito de obter as informações necessárias (bem estável conforme o enunciado) e, por último, Adaptador como uma abstração para os possíveis e vários adaptadores a serem produzidos para cada mudança nos sistemas que lidam com os materiais esportivos, teremos o seguinte modelo como resultado:

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-08/mod08ima03/mod08ima03.plantuml)

Observação: (a) a seta de Adaptador para InterfaceExigida deve ser tracejada, com a mesma ponta de ceta, desta forma, indica-se implementação, ou seja, que a classe Adaptador implementa tal interface; (b) em vez da composição de Adaptador para SistemasEsporte o melhor seria um simples associação, pois Adaptador faz uso do SistemasEsporte. 

Nesta proposta, observe que FolhaPagamento está imune às mudanças que eventualmente ocorrerem nos sistemas da empresa de materiais esportivos.
