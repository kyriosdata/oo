## Observações (baseadas nas submissões):

- Variáveis e referências empregam inicial minúscula, depois, a cada nova palavra concatenada, a inicial maiúscula ([camelCase](https://en.wikipedia.org/wiki/Camel_case#:~:text=Camel%20case%20(stylized%20as%20camelCase,word%20starting%20with%20either%20case.).
- Classes empregam [CamelCase](https://en.wikipedia.org/wiki/Camel_case#:~:text=Camel%20case%20(stylized%20as%20camelCase,word%20starting%20with%20either%20case.) com a inicial maiúscula.
- Constantes usam todas as letras maiúsculas.
- Uma classe que representa um conceito, por exemplo, "Monitor" (tela), provavelmente não é capaz 
de criar, a partir de si própria uma instância. Ou seja, usar um Monitor precisa de outra classe, para 
mantermos a "coerência" e não a "conveniência" do modelo.
- Classes, em geral, não usam System.out.println, pois pressupõe contato via linha de comandos da classe
com um usuário humano. Não é algo "bem distante"? Permita-me perguntar: como uma instância da classe
Monitor pode estabelecer uma comunicação com um usuário humano via texto? Isto não seria assunto
para outra classe?
- Quando se cria uma classe, encapsulamento, assunto ainda não apresentado, é muito
importante, pois é a base para criarmos abstrações. Se não encapsular, provavelmente então também
não cria abstração e uma classe apenas se transforma num depósito arbitrário de código (o que não
desejamos, nem é a proposta de orientação a objetos). Em consequência, quando se cria uma classe,
ocultar suas propriedades é quase sempre uma recomendação. Isto é feito com o modificador "private" em Java.
Idealmente, o usuário de uma classe sequer deveria saber qual o tipo de dados empregado para armazenar
um determinado atributo, por exemplo. 
