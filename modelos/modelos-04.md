### Vetor (_array_)

Sequência de elementos homogêneos. Observe que o índice do array é suficiente para identificar um único elemento desta estrutura de dados. Em decorrência foi empregada uma associação qualificada pelo índice, conforme ilustrado abaixo. Os elementos de um array formam uma seqüência, o que é indicado no modelo pela restrição {ordered}. Por último, é comum o emprego da navegabilidade para dizer, neste caso, que a classe Array possui um atributo, denominado de elementos, através do qual pode-se obter cada um dos elementos, instância de Elemento, do array em questão.

![image](https://user-images.githubusercontent.com/1735792/90349760-526a8580-e011-11ea-9ec2-a3a4498686c0.png)

### Árvore 1

Toda árvore possui um elemento denominado raiz, conforme o modelo abaixo. Em conseqüência, este modelo não contempla árvores nulas, sem nenhum elemento. Cada elemento pode ou não possuir descendentes. Se não possuir, então o elemento considerado é uma folha. Observe que nem todo elemento da árvore possui ancestral. Este caso particular ocorre quando o elemento em questão é a raiz da árvore.

![image](https://user-images.githubusercontent.com/1735792/90349790-66ae8280-e011-11ea-86ef-cd2b01dce508.png)

### Árvore 2

3. Nesta proposta observe que cada elemento pode ou não possuir um ancestral (pai), assim como também pode ou não possuir um irmão (irmão). Se um elemento é filho único, então não possui irmãos. Se um elemento é a raiz, então não possui ancestral. Se tivermos um elemento da árvore que possui vários descendentes, então cada um deles irá indicar este elemento como pai e, além disso, todos os irmãos formarão uma lista circular. Cada irmão indica o seguinte formando esta lista.

![image](https://user-images.githubusercontent.com/1735792/90349819-82198d80-e011-11ea-9bc9-f0d77c4099b2.png)

### Grafo

4. Um grafo dirigido pode ser modelado como abaixo. Para cada aresta tem-se um nó que funciona como origem e outro como destino. Se fosse desejável adicionar pesos a cada uma das arestas, seria suficiente definir um atributo para a classe Aresta.

![image](https://user-images.githubusercontent.com/1735792/90349841-92316d00-e011-11ea-81eb-c19eeb63c6fe.png)

### FIFO

5. A fila FIFO (first-in first-out) pode ser modelada conforme abaixo. Observe a presença de um primeiro elemento e, deste, todos os demais na fila, em ordem bem definida pela associação que indica o anterior e o próximo.

![image](https://user-images.githubusercontent.com/1735792/90349860-a1b0b600-e011-11ea-9907-ab044c52dc6f.png)

### Pilha

6. A estrutura de pilha permite o acesso somente ao elemento do topo da pilha. Dado o elemento do topo, o próximo elemento que se tem acesso é o que desempenha o papel de anterior na associação de Elemento para Elemento.

![image](https://user-images.githubusercontent.com/1735792/90349873-b12fff00-e011-11ea-9980-b58218479f58.png)

### Lista duplamente encadeada.

Uma lista duplamente encadeada apenas permite, dado um determinado elemento, a definição imediata do sucessor e do anterior, caso estes existam. Uma modelo correspondente é apresentado abaixo. Uma peculiaridade desta estrutura pode ser observada na cardinalidade da associação de anterior e próximo. Ambas são 1, indicando que, dado um elemento desta lista, necessariamente há um anterior e um elemento próximo, mesmo que seja o próprio elemento. Esta é uma característica comum de listas ditas duplamente encadeadas.

![image](https://user-images.githubusercontent.com/1735792/90349891-c1e07500-e011-11ea-9cb1-f962e1dd7eab.png)
