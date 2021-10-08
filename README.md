# CLInformática

O programa tem o objetivo de gerenciar serviços de uma empresa especializada em manutenção de computadores. Buscando a facilidade no uso de sistema.

### Dependências 
1. Apache Derby

### Script SQL

#### Criação da tabela Usuários
`CREATE TABLE users (id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1), 
name VARCHAR(32) NOT NULL,
userName VARCHAR(10) UNIQUE,
password VARCHAR(32) NOT NULL,
profile INTEGER NOT NULL);`

#### Consulta específica para realizar o ‘login’
`SELECT username, password, profile FROM APP.USERS WHERE username = ?`