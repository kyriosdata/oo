## Toda disciplina possui um nome.

Observe que nome não é considerado um conceito que mereça o tratamento de classe. Um atributo fornece um detalhe intimamente ligado à classe na qual é definido. Infelizmente não existe um conjunto de diretrizes que, uma vez seguidas, identificam com clareza, se uma determinada informação deve ser tratada como atributo ou como classe. Felizmente, a prática tem mostrado que esta questão torna-se cada vez menor com o aumento da experiência do responsável pela modelagem.

![image](https://user-images.githubusercontent.com/1735792/90348459-6e1f5d00-e00c-11ea-82e1-3519f87a994f.png)

## Um projeto de software pode empregar várias linguagens de programação.

![image](https://user-images.githubusercontent.com/1735792/90348611-20efbb00-e00d-11ea-88f8-9b919bc8e852.png)

## Toda escola possui um endereço.

Embora alguns especulem a definição de endereço como atributo da classe Escola, a proposta abaixo ressalta a distinção entre os conceitos envolvidos. Enquanto entidade, uma instância de Escola possui atributos como nome, capacidade de alunos e outros. Endereços nos dias atuais inclui CEP, logradouro e outros. Tratar estas informações como atributos espalhados por várias classes é inconveniente óbvio de não tratar endereço como uma classe.

![image](https://user-images.githubusercontent.com/1735792/90348478-87280e00-e00c-11ea-957e-c708d8e1ae12.png)

## Um texto é uma combinação de parágrafos que, por sua vez, são combinações de sentenças.

Talvez você imagine que uma composição seja mais apropriada, por ressaltar que a destruição do texto significa a destruição dos parágrafos e respectivas sentenças e que, em outro sentido, quando se criam as sentenças e os parágrafos o texto está sendo criado. Por outro lado, apesar de não usual, o modelo abaixo permite compartilhar parágrafos e sentenças, possibilidade que desaparece caso seja empregada a composição.

![image](https://user-images.githubusercontent.com/1735792/90348499-a45cdc80-e00c-11ea-851c-6931da0c433d.png)

## Em um país há várias cidades.

Dado um país temos zero ou mais cidades correspondentes. Em sentido inverso, dada uma cidade há um país correspondente (exatamente um). Pode-se modelar esta relação conforme ilustrado abaixo. O losango representa uma agregação, um tipo de relacionamento todo/parte, como normalmente as pessoas imaginam existir entre um país e as cidades deste país. Esta agregação encontra-se rotulada por Contém. Um rótulo é empregado para esclarecer, quando considerado conveniente, o significado da relação. Afinal, várias outras relações podem existir entre um país e uma cidade (vende produtos para, por exemplo). Ainda é possível observar a cardinalidade desta relação, do lado esquerdo o numeral 1 e do lado direito o asterisco. O asterisco indica zero ou mais, noutras palavras, o modelo abaixo admite a existência de um País que não possui nenhuma cidade com a qual está associado. Por outro lado, se existe uma cidade, então há um país que a contém, necessariamente. Se, em vez do asterisco a cardinalidade fosse 1..\*, então não teríamos um país sem a existência de pelo menos uma cidade nele contido.

![image](https://user-images.githubusercontent.com/1735792/90348517-c8b8b900-e00c-11ea-992a-0b427807c5c7.png)

## Uma das cidades de um país é a capital.

Dado um país necessariamente teremos uma cidade correspondente que é a capital deste país. A figura abaixo ilustra esta informação. O relacionamento é rotulado por Capital, a cardinalidade indica que todo país necessariamente possui uma cidade associada (a capital). No sentido inverso, uma cidade pode ou não ser uma capital e, portanto, nem todas possuem esta relação com país. Desta forma, a cardinalidade é indicada por 0..1. Se a cardinalidade fosse 1, em vez de 0..1, então teríamos um modelo no qual toda cidade é necessariamente capital de algum país.

![image](https://user-images.githubusercontent.com/1735792/90348527-dc641f80-e00c-11ea-8d39-ffdba159a1bd.png)

## Em um país há várias cidades e uma delas é a capital.

Esta informação é uma combinação das anteriores, contudo, foi modelado de forma distinta da simples união dos diagramas acima. Existem dois relacionamentos rotulados por Capital e Contém. Ambos aparecem dirigidos (ou orientados) de País para Cidade. Isto significa que é fácil identificar as cidades contidas em um país, assim como é fácil identificar a capital de um país., contudo, dada uma cidade, não saberemos com tal facilidade se ela é capital ou mesmo a qual país ela pertence. Se tal facilidade é desejada em ambos os sentidos, então o relacionamento deve ser bidirecional, como os anteriores. As cardinalidades e rótulos se mantiveram. Foi acrescentado o papel capital (lado da entidade Cidade). Este exemplo reforça que, dado um país e uma cidade relacionados por meio desta associação, a cidade desempenha o papel de capital. Naturalmente, neste caso, o emprego pode ser considerado desnecessário por muitos.

![image](https://user-images.githubusercontent.com/1735792/90348568-ef76ef80-e00c-11ea-80f7-2222dc5eaac3.png)

## Um projeto envolve várias pessoas.

A agregação (losango) indica que pessoas fazem parte de projetos. Neste exemplo a multiplicidade não é fornecida. Há pelo menos dois casos para serem analisados. Em um deles a multiplicidade não é fornecida por não ser relevante no contexto. Em muitos casos é natural identificar as entidades e associações entre estas, e deixar para momento posterior a identificação precisa de quantas entidades se relacionam com quantas entidades no outro extremo da relação. No outro caso a ser analisado, a multiplicidade não foi fornecida porque está sendo adotada a multiplicidade padrão da UML, ou seja, \*, zero ou mais entidades (ou instâncias). Neste caso a interpretação seria que um projeto pode estar associado a zero ou mais pessoas assim como uma pessoa pode estar associada a zero ou mais projetos.

![image](https://user-images.githubusercontent.com/1735792/90348582-04538300-e00d-11ea-97ee-c99de7c690b8.png)

## Uma curva pode ser definida como uma coleção de pontos ordenados.

O modelo informa que toda curva está associada a pelo menos dois pontos ordenados. Podem existir bem mais de 2 pontos, mas todos eles estão ordenados, o que assegura a possibilidade de reconstrução da curva em questão. O modelo indica que as instâncias da classe Ponto associadas a uma instância da classe Curva estão ordenados pela restrição {ordered} associada ao extremo direito da associação apresentada.

![image](https://user-images.githubusercontent.com/1735792/90348628-3533b800-e00d-11ea-9a18-5e9ff241aff2.png)

## Uma janela gráfica (interface com o usuário) compreende vários elementos de interação.

Por exemplo, botões, menus e barras de rolagem. Embora uma instância de Janela possa ser interpretada como uma agregação de instâncias de Elemento de interação, convém ressaltar um relacionamento “mais forte” entre instâncias desta classe. Quando uma instância de Janela é criada, as instâncias correspondentes da classe Elemento de interação também são criadas. Quando uma instância de Janela é destruída, naturalmente as instâncias da classe Elemento de interação associadas também são destruídas. Quando objetos apresentam este relacionamento todo/parte com semântica mais rigorosa que aquela da agregação, empregamos uma composição, conforme ilustrado no diagrama. Em tempo, os elementos de interação de uma janela considerados no modelo abaixo incluem botões, menus e barras de rolagem, conforme as classes exibidas.

![image](https://user-images.githubusercontent.com/1735792/90348659-598f9480-e00d-11ea-97a8-647248262808.png)

## Um arquivo possui permissões de acesso.

Cada permissão está associada a um grupo (de usuários). Conforme o diagrama, toda Permissão está associada necessariamente a um Grupo e a um Arquivo. Naturalmente, dada uma instância de Arquivo, podem existir várias instâncias de Permissão, cada uma delas conforme a instância de Grupo associada. Observe que pode não existir nenhuma permissão correspondente para um dado arquivo. No outro sentido a interpretação é a mesma, ou seja, um Grupo possui uma instância de Permissão para cada Arquivo. Por último, um Grupo define um conjunto de instâncias de Usuário, cada uma delas representa um usuário que é membro do grupo em questão, daí o emprego da agregação.

![image](https://user-images.githubusercontent.com/1735792/90348676-6dd39180-e00d-11ea-8b4d-f0a4867f9073.png)

## Pessoas trabalham para empresas por um determinado salário e intervalo de tempo.

Conforme o modelo, uma empresa oferece vários empregos, cada um deles ocupado exclusivamente por um empregado. No sentido inverso, uma pessoa pode ocupar vários empregos, cada um deles oferecido por um empregador. Cada instância de Emprego possui informações pertinentes à vaga em questão.

![image](https://user-images.githubusercontent.com/1735792/90348702-8348bb80-e00d-11ea-8a05-033d0664fe2b.png)

## Uma pessoa (empregado) trabalha para uma empresa (empregador).

No modelo abaixo, ao lado do papel empregado e empregador há o símbolo +. Isto significa que os empregados de uma determinada empresa podem ser obtidos além das fronteiras da classe Empresa, ou seja, não se trata de informação privada de uma instância desta classe. Analogamente, dada uma instância de Pessoa, podemos saber quais as empresas pelas quais o ser humano em questão ofereceu os seus serviços além das fronteiras da classe. Em geral este modificador de acesso associado aos papéis não é fornecido. São elementos específicos de implementação e, portanto, em geral, podem ser decididos pelos responsáveis pela construção propriamente dita do software em questão.

![image](https://user-images.githubusercontent.com/1735792/90348743-9b203f80-e00d-11ea-9349-c093178a6f35.png)

## Um usuário é o “dono” de um diretório. Cada diretório pode ser consultado por usuários autorizados.

Dada uma instância de Usuário temos instâncias de Diretório que são propriedades do usuário em questão. Dado um Diretório, aqueles autorizados (instâncias de Usuário) devem estar ligados pela associação Autorizado-a-usar.

![image](https://user-images.githubusercontent.com/1735792/90348812-b2f7c380-e00d-11ea-85d7-d38b7759696d.png)
