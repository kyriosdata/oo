### Xadrez

Xadrez é um jogo de tabuleiro, 8x8, onde cada um dos jogadores inicia a partida com 16 peças. Detalhes em http://en.wikipedia.org/wiki/Chess. Neste exercício, modele o jogo empregando a UML.

Algumas classes candidatas facilmente podem ser identificadas. Tabuleiro, para representar o tabuleiro em determinado instante de tempo. Ou seja, dado um instante de tempo de uma partida (jogo), há uma configuração do tabuleiro que será representada por Tabuleiro. Ou seja, uma partida ou jogo será definida por uma sequência de instâncias de Tabuleiro, conforme abaixo.

![image](https://user-images.githubusercontent.com/1735792/90530306-1afff400-e14b-11ea-8681-3dbd4ce9cd02.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-06/mod06ima01/mod06ima01.plantuml)


Esta não parece uma modelagem apropriada, afinal, muitos interpretam uma Partida como uma sequência de lances, onde cada lance define uma peça que se desloca de uma posição de origem para uma posição de destino, além de ser realizado por um jogador, conforme abaixo.

![image](https://user-images.githubusercontent.com/1735792/90530363-2fdc8780-e14b-11ea-94ba-b3298a5f8975.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-06/mod06ima02/mod06ima02.plantuml)

A posição pode ser definida por um esquema de coordenadas x e y. Neste modelo falta ressaltar que a composição de lances forma uma sequência. Nesta modelagem observe que não se faz necessário a entidade que represente um tabuleiro (recurso apenas visual empregado pela interface gráfica).

![image](https://user-images.githubusercontent.com/1735792/90530425-3e2aa380-e14b-11ea-833f-8e1e83e8d71d.png)

![modelo](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/kyriosdata/oo/master/imagens/modelos-06/mod06ima03/mod06ima03.plantuml)

