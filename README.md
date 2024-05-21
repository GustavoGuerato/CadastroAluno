# Sistema de Cadastro de Alunos em Java

## Descrição
Este sistema em Java proporciona um cadastro mais robusto de alunos, incluindo detalhes pessoais e acadêmicos. Composto por três classes principais: `CadastraAluno`, `Aluno`, e `Disciplina`, o projeto possibilita o registro de múltiplos alunos, com informações sobre disciplinas cursadas, notas, e verificações de desempenho acadêmico.

## Estrutura do Projeto

### 1. CadastraAluno.java
- **Objetivo:** Gerenciar o cadastro de alunos e interagir com as classes `Aluno` e `Disciplina`.

- **Funcionalidades:**
  - Cria instâncias de objetos da classe `Aluno`.
  - Captura informações detalhadas, como nome, idade, e dados acadêmicos.
  - Permite o cadastro de até 4 disciplinas para cada aluno, incluindo nome e nota.
  - Exibe informações detalhadas sobre os alunos cadastrados, incluindo média das notas e status de aprovação.

- **Como Executar:**
  1. Abra um terminal na pasta do projeto.
  2. Compile o arquivo `CadastraAluno.java` e as demais classes usando o comando:
     ```bash
     javac CadastraAluno.java Aluno.java Disciplina.java
     ```
  3. Execute o programa compilado com o comando:
     ```bash
     java CadastraAluno
     ```
  4. Siga as instruções no console para cadastrar os alunos e suas disciplinas.

### 2. Aluno.java
- **Objetivo:** Representar a estrutura do objeto `Aluno` e suas operações.

- **Atributos:**
  - `nome`, `idade`, `nascimento`, `rg`, `numeroCPF`, `nomeMae`, `nomePai`, `matricula`, `escola`, `serieMatriculado`: Informações pessoais do aluno.
  - `disciplinas`: Lista de disciplinas cursadas pelo aluno.

- **Métodos:**
  - `getMediaNota()`: Calcula a média das notas do aluno.
  - `getAlunoAprovado()`: Verifica se o aluno foi aprovado com base na média das notas.
  - Métodos getters e setters para acessar e modificar os atributos.

- **HashCode, Equals e ToString:**
  - Implementações para suporte a operações em coleções e facilitar a depuração.

### 3. Disciplina.java
- **Objetivo:** Representar a estrutura do objeto `Disciplina`.

- **Atributos:**
  - `nota`: Nota obtida na disciplina.
  - `disciplina`: Nome da disciplina.

- **Métodos:**
  - Métodos getters e setters para acessar e modificar os atributos.

- **HashCode, Equals e ToString:**
  - Implementações para suporte a operações em coleções e facilitar a depuração.

## Como Executar
- Certifique-se de ter o ambiente Java configurado corretamente em sua máquina.

- Compile os arquivos antes de executar o programa usando o comando:
  ```bash
  javac CadastraAluno.java Aluno.java Disciplina.java
