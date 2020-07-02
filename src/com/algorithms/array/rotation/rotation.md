#### Rotação de Arrays
Existem pelo menos três principais técnicas para rotacionar um _Array_:

- Utilizando um _Array_ temporário
- Efetuando a rotação de um elemento de cada vez _n_ vezes
- Método do _"Malabarismo"_ que utiliza o máximo divisor comum.

**Utilizando um Array temporário**: Primeiro é partilhado o _Array_ inicial no tamanho da rotação dependendo da direção.
Após essa ação o _Array_ inicial é deslocado entre as posições respeitando o tamanho da rotação e por fim o _Array_ temporário é realocado novamente empurrando os elementos.

**Efetuando a rotação de um elemento de cada vez _n_ vezes**: Efetuado _n_ vezes o processo de deslocar os índices do _Array_ em uma posição de acordo com a direção.


