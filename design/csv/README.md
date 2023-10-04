# Problema (perspectiva do cliente)

Um software que lê um arquivo no formato CSV e, para cada linha, 
calcula a soma das duas primeiras colunas e gera um arquivo CSV, 
contendo as mesmas linhas, mas o arquivo gerado contém uma coluna 
adicional que a soma obtida para cada linha. 

Crie um _design_ que atenda esta demanda, ou seja, 
defina o software correspondente. Não é necessário
implementar, apenas o _design_.

# Design (definição do software a ser implementado)

A proposta abaixo oculta vários "problemas":

- Aplicação via linha de comandos.
- Recebe como primeiro argumento o arquivo CSV de entrada.
- Recebe como segundo argumento o arquivo CSV de saída. Se arquivo
de saída não for informado, o arquivo de saída será o mesmo daquele
de entrada acrescido do sufixo `_out.csv`.
- Para cada linha do arquivo de entrada, calcula a soma das duas 
duas primeiras colunas e gera uma linha no arquivo de saída, 
contendo as mesmas colunas da linha de entrada acrescida de uma
coluna com a soma calculada.

