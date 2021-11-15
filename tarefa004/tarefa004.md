<p style="text-align: center;"><font size="5"><b>Git <i>branching</i> (Exercícios:)</b></font></p1></p>
<div align="justify">

1. Qual o nome do branch padrão do Git?
2. O que o comando **<code>git branch nome</code>** realiza?
3. Como criar um branch a partir de um commit específico?
4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?
5. Qual o comando para se alternar para um branch de nome **experimento2**?
6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?
7. O que o comando **<code>git checkout -b</code>** nome faz?
8. Qual a função do <code>**comando git branch -d teste</code>**?
9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.

## Respostas

1. master
2. Cria a branch “nome” a partir da branch corrente.
3. git checkout -b nome_da_branch id_commit
4. Cria a branch bugfix/234 e alterna para esta.
5. git branch -m experimento2 novo_nome
6. São listadas as branches existentes e é indicado que a branch b1 é a corrente através da marcação com um asterisco (*)
7. Cria uma branch a partir da branch corrente e já alterna para a nova branch.
8. Deleta a branch teste.
9. Sequência simulando a criação da branch “feature-1”:
• git checkout master
• git checkout -b feature-1
• git add Main.java
• git commit -m “arquivo main”
• git push origin feature-1
• git checkout master
• git pull origin master
• git merge feature-1
• git push origin master

</div>