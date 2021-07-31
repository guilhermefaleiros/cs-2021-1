<p style="text-align: center;"><font size="5"><b>Git Exercícios</b></font></p1></p>
<DIV align="justify">

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
  b. git help checkout
  c. git help merge
  d. git init
  e. git add --all
  f. git add -u
  g. git config -l
  h. git mv a.txt b.txt
  i. git reset --hard
  j. git log -27
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
6. Qual o comando para efetuar um _commit_?
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
9. O que acontece se o seu repositório local for acidentalmente removido?
10. Como clonar um repositório remoto?
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
13. Qual o comando para criar um repositório local?
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
30. O que o comando **git push origin 3.4-gold** teria como efeito?
31. Após executar um commit, qual o efeito de **git commit --amend**?
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.


## Respostas

1. git version
2. 
    a. Mostra  um resumo rápido de comandos do Git.
    b. Mostra um resumo e funcionalidades do comando git checkout
    c. Mostra um resumo e funcionalidades do comando git merge
    d. Cria um repositório local na pasta corrente
    e. Adiciona todos os arquivos para staging
    f. Adiciona modificações, mas ignora novos arquivos adicionados.
    g. Mostra as configurações definidas no repositório local
    h. Renomeia o arquivo a.txt para b.txt
    i. Remove todos os commits locais.
    j. Mostra os últimos 27 commits.

3. Respectivamente: git add . e git commit -m “mensagem”
4. git status ou git diff
5. git status --untracked
6. git commit -m “mensagem”
7. git checkout teste.txt
8. O caminho do arquivo deve ser inserido no arquivo .gitignore
9. Todos os commits, branches e tags locais são perdidos.
10. git clone url_do_repositorio
11. git log --oneline
12. Na pasta .git
13. git init
14. .git
15. git add . ou git add --all
16. O SHA-1 é utilizado para gerar códigos de identificação para os commits. O SHA-1 se trata de uma função de hash.
17. git log -1
18. Não.
19. Ambos removem os commits locais feitos no repositório.
20. git clean -n
21. .gitignore
22. Deve se inserir a seguinte linha no arquivo .gitignore: nome_da_pasta/*.class.
23. Feito.
24. Mostra a lista de quantidade de commits por contribuidor do repositório.
25. Mostra a URL do repositório remoto
26. git tag
27. git tag 2.0*
28. Adiciona a tag 3.4-gold ao último commit.
29. Mostra o nome e a descrição da tag 3.4-gold e qual commit está associado a esta tag.
30. Enviaria a tag 3.4-gold para o repositório remoto.
31. Altera o commit anterior adicionando as novas modificações feitas desde o commit anterior, podendo modificar a mensagem do commit ou não.
32. Reseta o arquivo x.txt para último commit realizado.
33. Remove as alterações feitas no arquivo a.txt
34. O reset altera o estado do repositório para o último commit. Já o checkout remove as alterações feitas.
35. Feito.