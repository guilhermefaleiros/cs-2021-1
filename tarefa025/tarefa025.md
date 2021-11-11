# PESQUISA SOBRE TÉCNICAS DE CONSTRUÇÃO BASEADA EM TABELAS E ESTADOS

## Padrão State

De forma geral, o padrão state permite que diferentes implementações/comportamentos sejam realizadas de acordo com o estado do objeto atual. De maneira prática, vamos pensar no seguinte caso:

- Existe uma classe "A" baseada em estados, de acordo com o estado atual desta classe, determinados métodos possuem um comportamento esperado.
- O resultado comum disso são diversos condicionais nos métodos, fazendo verificações relativas ao estado atual e executando determinado comportamento.
- O padrão State resolve isso da seguinte forma: é criado uma classe abstrata de estado, e diversas classes são criadas implementando essa abstração, cada uma representando um estado da classe "A", e dentro dessas classes, são feitas as implementações pertinentes ao estado, de modo que agora, a classe "A" tenha um estado atual e apenas delegue a execução de seus métodos para esse estado, se comportando da maneira adequada e controlando os estados.

Além disso, podemos pensar nesse padrão de forma macro. De modo que o sistema inteiro se comporte de maneira diferente de acordo com o estado, ou seja, que sejam criados estados diferentes para o sistema inteiro e assim alterando seu comportamento de maneira adequada e eficaz.