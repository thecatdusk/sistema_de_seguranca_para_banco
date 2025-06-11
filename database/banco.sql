-- Cria tabela boletos

--CREATE TABLE boletos(
--    cod_boleto INT PRIMARY KEY
--);

-- Cria tabela usuarios

--CREATE TABLE usuarios(
--    numero_da_conta INT PRIMARY KEY,
--    nome TEXT NOT NULL,
--    senha TEXT NOT NULL,
--    email TEXT UNIQUE NOT NULL,
--    saldo FLOAT,
--    tipo_conta TEXT CHECK(tipo_conta='CheckingAccount' OR tipo_conta='admin') NOT NULL
--);

-- Cria tabela transacao

--CREATE TABLE transacao(
--    cod_transacao INTEGER PRIMARY KEY AUTOINCREMENT,
--    numero_da_conta INT NOT NULL,
--    cod_boleto INT NOT NULL,
--    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
--    FOREIGN KEY (numero_da_conta) REFERENCES usuarios(numero_da_conta),
--    FOREIGN KEY (cod_boleto) REFERENCES boletos(cod_boleto)
--);
