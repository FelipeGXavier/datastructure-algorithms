#### Busca binária
A busca binária efetua sua pesquisa supondo um _Array_ ou estrutura de dados ordenada, dessa forma são realizadas _n_ divisões até encontrar o valor desejado ou não.

- Verifica-se se o número desejado está exatamente no meio
- Caso não esteja e o valor seja maior o **início** da busca é limitado pelo meio atual mais um
- Caso não esteja e o valor seja menor o **fim** da busca é limitado pelo meio atual menos um

Sendo o meio a soma do **início** com o **fim** dividido por 2 