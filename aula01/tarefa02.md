## Tarefa 002 - 28/07/2021 - Pesquisa Rest API

1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

APIs REST, ou melhor,  APIs RESTful são aplicações que seguem padrões e protocolos da arquitetura REST, definido por Roy T. Fielding em sua tese de doutorado. Para entender o conceito de uma API RESTful, temos que dissecar os termos “API” e “REST”, para termos uma visão geral do conceito.

# API

As chamadas APIs (Application Programming Interface) são formalmente descritas como um “conjunto de definições e protocolos usado no desenvolvimento e na integração de aplicações”. As APIs podem ser descritas como um intermediário entre um cliente e os recursos e/ou serviços que este cliente deseja manipular. As APIs podem ser disponibilizadas de diferentes formas, como por exemplo: SDK (Software Development Kit), ou através de um CLI (Command Line Interface), ou como nesse contexto que estamos trabalhando, pode ser fornecida através de um Serviço Web. Vale ressaltar que este “cliente” citado anteriormente pode ser o próprio usuário final ou até mesmo outra aplicação, assim podemos entender a importância de APIs na integração de sistemas de software.

# REST

Tendo em mente o conceito de API, no nosso contexto de APIs RESTful, sempre estaremos se referindo a Serviços Web que respeitam o padrão REST.

A arquitetura REST possui algumas características primordiais, vejamos algumas:

1. Estabelecimento de uma comunicação cliente/servidor. Onde um servidor é responsável por prover os recursos REST e outro para consumi-los. Esta comunicação ocorre via protocolo HTTP.
2. Stateless, ou seja, o servidor não armazena nenhum dado do cliente. Por exemplo: não ocorre nenhum esquema de sessão de usuário.
3. Os dados podem ser armazenados em cache para otimização da performance dos serviços.
4. Arquitetura em camadas.
5. As APIs RESTful devem ter uma interface uniforme.

Para atingir a característica de “interface uniforme”, alguns critérios devem ser levados em conta:

* Baseado em recursos, ou seja, as APIs RESTful trabalham com recursos (representações de dados que podem descrever alguma ação), ao invés da execução de métodos.
* Manipulação de recursos através de representações: estes recursos devem ser manipulados através de uma representação padronizada, como JSON ou XML, hoje em dia o JSON é mais adotado por conta de sua simplicidade.
* Mensagens auto-descritivas: todas as mensagens e respostas são suficientes para que o cliente entenda.
* HATEOAS (Hypermedia as the engine of application state): Basicamente, o usuário deve poder navegar entre os recursos disponíveis através de Hiperlinks, estes que devem ser obtidos nos próprios recursos.

É importante também ressaltar que todas as utilizações de recursos devem estar em conformidade com os verbos HTTP, vejamos os mais utilizados:

* GET (Obtenção de dados)
* POST (Envio/criação de dados)
* PUT (Atualização total de dados)
* PATCH (Atualização parcial de dados)
* DELETE (Remoção de dados)

Também é possível identificar a falha ou sucesso da requisição HTTP através dos códigos de status de resposta, que são números que identificam o status da requisição, vejamos algumas famílias de respostas mais recorrentes:

* (200 - 299) Respostas de sucesso.
* (400 - 499) Erros do cliente.
* (500 - 599) Erros do servidor.

Há uma maneira de categorizar a maturidade de uma API RESTful, o chamado Modelo de Maturidade de Richardson. O modelo propõe 4 níveis de maturidade, sendo o nível 0 a ausência das características REST. Os níveis 1 ao 3 são identificados pela existência das características anteriores e uma exclusiva do próprio nível. Vejamos as características de cada nível:

1. Utilização de recursos.
2. Uso correto dos verbos HTTP (GET, POST etc…)
3. Uso de HATEOAS.


# USO DE APIs REST NA ATUALIDADE

A arquitetura REST é usada de maneira quase majoritária ao redor do mundo, nos mais diversos tipos de projetos. Com o advento de aplicações
mobile e aplicações front-end isoladas, a adoção em massa da arquitetura de microsserviços e necessidade de aplicações se integrarem de maneira
fluída, o REST se apresentou com um modelo bem sucedido, por conta de sua simplicidade em relação à arquiteturas anteriores como o SOAP e RPC.
Hoje a maioria das empresas fornecedoras de serviços web (ex: Google, Amazon, Microsoft etc.) fornecem API RESTful para acessarem seus serviços.

# FERRAMENTAS PARA IMPLEMENTAÇÃO DE APIs RESTful.

Hoje, a maioria das linguagens de programação adotadas no mercado possuem ferramentas para construção de APIs REST. Podemos citar alguns frameworks/bibliotecas utilizadas:

* Spring REST (Java)
* ExpressJS (Javascript/Nodejs)
* Flask (Python)
* ASP.NET (C#)
* Symfony (PHP)
* Ruby On Rails (Ruby)

Além disso, podemos ressaltar o uso da ferramenta Swagger/OpenAPI, que fornece formas e especificações para documentação de APIs RESTful. Temos também ferramentas como Postman e Insomnia que fornecem interfaces gráficas para consumo e teste de APIs RESTful.
