# PESQUISA SOBRE CONFIGURAÇÃO DE SOFTWARE EM TEMPO DE EXECUÇÃO

A configuração de software em tempo de execução basicamente é a alteração de comportamentos e apontamentos do software durante o tempo de execução. Exemplos de configurações que podem ser alteradas durante tempo de execução e efetam diretamente o funcionamento do software:

- Alteração de configurações de banco de dados (host, usuário, senha, porta, etc...)
- Alteração de de configurações de chamadas HTTP/REST para outros serviços/API (url, verbo HTTP)
- Injeção de dependências com comportamentos diferentes dependendo do cenário/ambiente

Alguns mecanismos foram criados para realizar este tipo de configuração, vejamos alguns:

- Profile: suportado pela maioria dos frameworks e linguagens de programação, esta é uma forma de definir um conjunto de variáveis que podem ser utilizadas internamente pelo software. Este conjunto de variáveis é atribuído a um perfil, que na maioria das vezes representa o ambiente no qual o software está sendo executado, por exemplo, o perfil de "prod" possui uma série de variáveis e configurações que fazem referência ao ambiente de produção do software, configurações como: dados de acesso ao banco de dados, chamadas para serviços externos, configurações do servidor web e etc.

- Inversão de Controle e Injeção de Dependência: de maneira resumida, inversão de controle permite que uma classe "A" use a classe "B" sem que "A" saiba detalhes sobre "B" que não façam sentido para o contexto em que "A" está sendo utilizada, alguns desses detalhes são: como uma instância da classe "B" é criada e quais os parâmetros que a classe "B" necessita para ser criada. Uma forma de resolver este tipo de implementação é utilizando a técnica de Injeção de Dependência, onde todas as dependências externas de determinada classe, são passadas via construtor, por exemplo, para que a classe cliente possa utilizá-la sem saber mais detalhes. E isso pode ser usado diretamente para configuração de software, de maneira que, em determinado ambiente uma dependência que obedeça à mesma interface, possa ser passada ao invés da dependência usada em outro ambiente. Por exemplo: é comum em ambiente de teste (no cenário de testes unitários), usarmos dependências "mockadas", que são dependências que não possuem seu comportamento normal, mas sim um comportamento pré-estabelecido por quem está criando o teste, uma vez que o objetivo deste tipo de teste é testar apenas a classe em questão e não suas dependências envolvidas.

