# Padrão de Projeto Mediator — Sistema de Atendimento de uma Clínica

## Descrição

Este projeto demonstra a aplicação do padrão de projeto comportamental **Mediator** em um sistema de atendimento de uma clínica.

O sistema permite que pacientes enviem elogios, reclamações e sugestões sobre o atendimento. As mensagens são encaminhadas por um mediador, responsável por centralizar a comunicação com a recepcionista.

## Objetivo

Demonstrar como o padrão Mediator reduz o acoplamento entre objetos, centralizando a comunicação em um componente intermediário.

## Estrutura do projeto

- **Pessoa:** disponibiliza os métodos para enviar elogios, reclamações e sugestões.
- **Paciente:** representa o paciente e herda os comportamentos da classe Pessoa.
- **Atendimento:** atua como mediador, recebendo as mensagens e encaminhando-as à recepcionista.
- **Recepcionista:** implementa a interface Setor e processa as mensagens recebidas.
- **Setor:** define os métodos para receber elogios, reclamações e sugestões.
- **PacienteTest:** contém os testes automatizados das três operações.

## Padrões de projeto utilizados

### Mediator

O padrão Mediator centraliza a comunicação entre objetos. Neste projeto, a classe Atendimento recebe as solicitações e as encaminha à Recepcionista, evitando que a classe Pessoa precise se comunicar diretamente com ela.

### Singleton

As classes Atendimento e Recepcionista utilizam o padrão Singleton para disponibilizar uma única instância de cada classe por meio do método getInstancia().

## Funcionamento

1. O paciente solicita o envio de um elogio, uma reclamação ou uma sugestão.
2. A classe Pessoa encaminha a mensagem ao Atendimento.
3. O Atendimento direciona a mensagem à Recepcionista.
4. A Recepcionista processa a solicitação e retorna uma resposta.
5. O Atendimento retorna ao paciente uma mensagem contendo a resposta.

## Exemplos de mensagens

**Elogio:**

Entrada: `Ótimo atendimento`

Resposta: `A Clínica agradece seu contato.` seguida da resposta da recepção.

**Reclamação:**

Entrada: `Lentidão no atendimento`

Resposta: a recepção informa que procurará melhorar o atendimento referente à reclamação.

**Sugestão:**

Entrada: `Ampliar horário de funcionamento`

Resposta: a recepção informa que analisará a sugestão.

## Testes

Os testes automatizados estão na classe PacienteTest e verificam:

- O envio e o processamento de elogios.
- O envio e o processamento de reclamações.
- O envio e o processamento de sugestões.

O projeto utiliza JUnit 5 para a execução dos testes.

## Tecnologias utilizadas

- Java
- JUnit 5
- Padrões de projeto comportamentais

## Conclusão

O padrão Mediator facilita a manutenção e a organização do sistema ao centralizar a comunicação entre os componentes. Dessa forma, as classes que enviam mensagens não precisam conhecer diretamente os detalhes da classe responsável por processá-las.
