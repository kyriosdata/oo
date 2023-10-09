## Interface (encapsular o que varia)

Encapsular o que varia em uma classe e "ocultar" esta implementação por uma interface.
Desta forma, quem precisa do comportamento desejado não estará
dependente de uma implementação específica, apenas conhece a 
interface por meio da qual requisita o comportamento, cuja 
implementação é desconhecida.

## Princípio

_Programe para uma interface, não para uma implementação_.

## Cenário

Temos uma lista de estudantes que estão matriculados em uma determinada
discipina. Nosso usuário deseja a possibilidade de ordená-la por 
vários critérios, por exemplo, nome (ordem alfabética ou inversa), pelo sobrenome, pela idade, 
pelas notas, ou pela média e por outros critérios. Isto é o que software
deve fazer. Ainda há muitos outros conceitos no software a ser desenvolvido, por 
exemplo, professor, turma e outros, curiosamente, o cliente também deseja tal funcionalidade
para estes conceitos. 

Qual a sua proposta de software para fazer isso (design)?


## Proposta Java

- [Collections.sort()](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collections.html#sort(java.util.List))
- Interface [Comparator](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Comparator.html)
- Interface [Comparable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Comparable.html)

