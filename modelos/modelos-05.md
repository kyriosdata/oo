### Um computador compreende mouse, teclado, monitor e placa-mãe. A placa-mãe compreende memória e CPU. A CPU faz acesso à memória.

![image](https://user-images.githubusercontent.com/1735792/90352450-cc067180-e019-11ea-8830-55628e1a99bd.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima01/mod05ima01.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima01/mod05ima01.plantuml)

IMAGEM 01

O modelo acima pode ser “trabalhado”, resultando naquele abaixo onde podemos acrescentar outros dispositivos à medida que se fizer necessário. No modelo abaixo optamos por não representar outros compartimentos de uma classe, ou seja, aquele dos atributos e das operações (métodos). São formas alternativas, que devem ser empregadas conforme a necessidade. Para este caso, por exemplo, nem atributos nem operações fazem falta.

![image](https://user-images.githubusercontent.com/1735792/90352466-d9bbf700-e019-11ea-8583-87c6688e6595.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima02/mod05ima02.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima02/mod05ima02.plantuml)

IMAGEM 02

### Aeroporto

Em um aeroporto tem-se a ocorrência de vôos. Alguns decolam outros aterrissam. Para cada vôo há um avião, contendo vários lugares, cada um deles possivelmente ocupado por um passageiro. Para cada vôo também está associada toda a tripulação que inclui, necessariamente, um piloto, um co-piloto e uma ou mais aeromoças.
Para o caso acima é fácil observar alguns elementos principais a serem considerados. A simples identificação dos substantivos empregados nos revela os conceitos vôo, aeroporto, avião, lugar, passageiro, tripulação, piloto, co-piloto e aeromoça. Este conjunto candidado de classes é refinado à medida que modelamos e acrescentamos outros elementos. Neste caso estão faltando os relacionamentos entre estas classes. Por exemplo, deve ser destacado o fato de que um aeroporto decolam e aterrisam vôos. Avião contém lugares e assim por diante. Um modelo possível é fornecido abaixo.

![image](https://user-images.githubusercontent.com/1735792/90352494-f22c1180-e019-11ea-9f89-733d91131787.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima03/mod05ima03.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima03/mod05ima03.plantuml)

IMAGEM 03


### Lanchonete

Em lanchonetes são servidos vários tipos de sanduíche, alguns com vários tipos de acompanhamento como, por exemplo, ovo, salada, queijo e outros. O acompanhamento é opcional, não faz parte do sanduíche. Cada pedido recebido pelas garçonetes também inclui, em geral, bebidas.

![image](https://user-images.githubusercontent.com/1735792/90352519-05d77800-e01a-11ea-8314-ef70ed358574.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima04/mod05ima04.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima04/mod05ima04.plantuml)

IMAGEM 04


### Festa

Em uma festa convencional homens dançam com mulheres. Cada dança está associada a uma música. Cada convidado da festa pode ou não ir acompanhado.

![image](https://user-images.githubusercontent.com/1735792/90352565-26073700-e01a-11ea-9f6b-8911d5b22008.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima05/mod05ima05.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima05/mod05ima05.plantuml)

IMAGEM 05

### Um trabalhador pode ser um açougueiro, um padeiro, um professor e um advogado.

![image](https://user-images.githubusercontent.com/1735792/90352630-4afbaa00-e01a-11ea-92dd-29d11799adbe.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima06/mod05ima06.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima06/mod05ima06.plantuml)

IMAGEM 06

### Pagamento

Uma determinada tarefa desempenhada por um trabalhador pode ser paga por hora, por um salário mensal ou por contrato. Vários pagamentos de formas distintas podem ser efetuados para uma mesma tarefa.

![image](https://user-images.githubusercontent.com/1735792/90352676-6961a580-e01a-11ea-8a80-89902b667921.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima07/mod05ima07.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima07/mod05ima07.plantuml)

IMAGEM 07

### Pessoas dirigem automóveis, cada um deles de uma determinada marca, modelo e ano.

![image](https://user-images.githubusercontent.com/1735792/90352722-86967400-e01a-11ea-84c1-ee2c6fc56bc4.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima08/mod05ima08.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima08/mod05ima08.plantuml)

IMAGEM 08

### Empregados

Uma empresa possui empregados organizados hierarquicamente onde gerentes gerenciam funcionários que, por sua vez, podem gerenciar outros funcionários. Todo empregado possui um gerente, exceto aquele do topo da hierarquia. Este último não é gerenciado por ninguém.

![image](https://user-images.githubusercontent.com/1735792/90352749-99a94400-e01a-11ea-923d-b679578af58b.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima09/mod05ima09.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima09/mod05ima09.plantuml)

IMAGEM 09

### Presidência de comitê

Pessoas podem ser membros de comitês. Cada comitê necessariamente possui dois ou três presidentes.

![image](https://user-images.githubusercontent.com/1735792/90352774-afb70480-e01a-11ea-952a-a333b2738959.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima10/mod05ima10.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima10/mod05ima10.plantuml)

IMAGEM 10

### Nota fiscal

Uma nota fiscal contém vários itens, cada um descreve um produto, a quantidade correspondente e o preço unitário.

![image](https://user-images.githubusercontent.com/1735792/90352793-bfcee400-e01a-11ea-9fa2-d241532be9db.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima11/mod05ima11.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima11/mod05ima11.plantuml)

IMAGEM 11


### Avaliação

Em um dado sistema acadêmico, avaliação é o nome que se dá a um conjunto de questões, elaborada com determinada finalidade e aplicada em uma determinada data. Neste sistema prova é o nome que se dá às respostas fornecidas por um aluno. Ou seja, alunos são submetidos a avaliações e, para cada uma delas, cada prova correspondente tem o o aluno tem a correspondente prova.

![image](https://user-images.githubusercontent.com/1735792/90352843-ea20a180-e01a-11ea-80cf-e67641828eae.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-05/mod05ima12/mod05ima12.plantuml)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/marcuspadilha/oo/master/imagens/modelos-05/mod05ima12/mod05ima12.plantuml)

IMAGEM 12

