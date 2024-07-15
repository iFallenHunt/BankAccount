# Projeto de conta bancária

## Índice
- [Visão geral](#visão-geral)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Características](#características)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Utilização](#utilização)
- [Explicação do código](#explicação-do-código)
    - [Pacote de modelo](#pacote-modelo)
    - [Pacote de serviço](#pacote-de-serviço)
    - [Pacote de visualização](#pacote-de-visualização)
    - [Classe principal](#classeprincipal)
- [Melhorias futuras](#melhorias-futuras)
- [Contribuir](#contribuir)
- [Licença](#licença)

## Visão Geral
O **Bank Account Project** é uma aplicação bancária simples que permite aos utilizadores criar e gerir contas bancárias, incluindo contas correntes e contas poupança. Ele oferece funcionalidades como visualização de saldo, histórico de transações e atualização das configurações da conta, tudo com uma interface gráfica de usuário (GUI) usando o `JOptionPane`.

## Estrutura do projeto
O projeto está estruturado em vários pacotes para manter uma base de código limpa e organizada:

```plaintext
com.bankaccount
Main.java
├─── modelo
│ ├── Conta.java
│ ├── ContaCorrente.java
│ ├─── ContaPoupança.java
│ ├─── Cliente.java
│ ├─── Banco.java
├─── serviço
├── IAccount.java
├─── view
├─── LoginScreen.java
│ ├─── CriarContaEcrã.java
│ ├─── BalançoScreen.java
│ ├─── TransactionHistoryScreen.java
│ ├── AccountSettingsScreen.java
│ ├─── MainMenu.java
```

## Características
- **Criar contas**: Os utilizadores podem criar contas correntes ou de poupança.
- **Ver Saldo**: Os utilizadores podem ver o saldo das suas contas.
- **Histórico de transacções**: Os utilizadores podem ver o seu histórico de transacções.
- **Atualizar definições da conta**: Os utilizadores podem atualizar as informações da sua conta.
- **Início de sessão**: Funcionalidade básica de início de sessão para simular a autenticação do utilizador.

## Pré-requisitos
- Java Development Kit (JDK) 8 ou superior
- Biblioteca Lombok

## Instalação
1. Clone o repositório:
    ```sh
    git clone https://github.com/yourusername/bank-account-project.git
    ```
2. Abra o projeto em seu IDE favorito (por exemplo, IntelliJ IDEA, Eclipse).
3. Certifique-se de que o Lombok esteja configurado corretamente na sua IDE.
4. Construa e execute o projeto.

## Utilização
1. Execute a classe Main localizada no pacote com.bankaccount.
2. Utilize a GUI para interagir com a aplicação:
    - **Login**: Introduzir nome de utilizador e palavra-passe (user / password).
    - **Criar conta**: Selecionar o tipo de conta e introduzir o nome do cliente.
    - **Ver saldo**: Ver o saldo da conta criada.
    - **Histórico de Transações**: Ver o histórico de transacções.
    - **Definições da conta**: Atualizar o nome do cliente.
    - **Sair**: Fechar a aplicação.

## Código Explicação

### Pacote Modelo
- **Bank.java**: Representa o banco com um nome.
- **Client.java**: Representa um cliente com um nome.
- **Account.java**: Classe abstrata que representa uma conta bancária genérica.
- **CheckingAccount.java**: Representa uma conta corrente.
- **SavingsAccount.java**: Representa uma conta poupança.

### Pacote de Serviços
- **IAccount.java**: Interface que define as operações básicas da conta.

### Pacote View
- **LoginScreen.java**: Trata do login do usuario.
- **CreateAccountScreen.java**: Trata da criação de contas.
- **BalanceScreen.java**: Apresenta o saldo da conta.
- **TransactionHistoryScreen.java**: Apresenta o histórico de transacções.
- **AccountSettingsScreen.java**: Trata das atualizações das definições da conta.
- **MainMenu.java**: Menu principal para navegar na aplicação.

### Classe principal
- **Main.java**: Ponto de entrada da aplicação, inicializa o menu principal.

## Melhorias futuras
- Implementar mecanismos de autenticação e autorização mais robustos.
- Adicionar um histórico de transações mais detalhado com carimbos de data e hora e descrições.
- Aprimorar a GUI com melhor design e usabilidade.
- Integrar uma base de dados para manter os dados da conta e das transacções.

## Contribuição
As contribuições são bem-vindas! Por favor, abra uma issue ou submeta um pull request para quaisquer melhorias ou correcções de bugs.

## Licença
Este projeto está licenciado sob a licença MIT. Veja o ficheiro [LICENSE](LICENSE) para mais detalhes.