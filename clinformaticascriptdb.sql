CREATE TABLE usuario (
  idusuario INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  username VARCHAR(20) NOT NULL,
  password_2 VARCHAR(32) NOT NULL,
  profile INTEGER(1) UNSIGNED NOT NULL,
  PRIMARY KEY(idusuario)
);

CREATE TABLE bairro (
  idbairro INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(20) NULL,
  PRIMARY KEY(idbairro)
);

CREATE TABLE endereco (
  idendereco INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  bairro_idbairro INTEGER UNSIGNED NOT NULL,
  rua VARCHAR(20) NOT NULL,
  numero INTEGER UNSIGNED NOT NULL,
  cep VARCHAR(9) NULL,
  PRIMARY KEY(idendereco),
  INDEX endereco_FKIndex1(bairro_idbairro),
  FOREIGN KEY(bairro_idbairro)
    REFERENCES bairro(idbairro)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Cliente (
  idCliente INTEGER UNSIGNED NOT NULL,
  endereco_idendereco INTEGER UNSIGNED NOT NULL,
  nome VARCHAR(20) NOT NULL,
  email VARCHAR(32) NOT NULL,
  PRIMARY KEY(idCliente),
  INDEX Cliente_FKIndex1(endereco_idendereco),
  FOREIGN KEY(endereco_idendereco)
    REFERENCES endereco(idendereco)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE ordem_servico (
  idordem_servico INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Cliente_idCliente INTEGER UNSIGNED NOT NULL,
  usuario_idusuario INTEGER UNSIGNED NOT NULL,
  date_os DATETIME NOT NULL,
  defeito VARCHAR(150) NOT NULL,
  servico VARCHAR(150) NOT NULL,
  valor DOUBLE PRECISION NULL,
  status_2 INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(idordem_servico),
  INDEX ordem_servico_FKIndex1(usuario_idusuario),
  INDEX ordem_servico_FKIndex2(Cliente_idCliente),
  FOREIGN KEY(usuario_idusuario)
    REFERENCES usuario(idusuario)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Cliente_idCliente)
    REFERENCES Cliente(idCliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE equipamento (
  idequipamento INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Cliente_idCliente INTEGER UNSIGNED NOT NULL,
  processador VARCHAR(20) NOT NULL,
  placa_mae VARCHAR(20) NOT NULL,
  memoria_ram VARCHAR(20) NOT NULL,
  memoria VARCHAR(20) NOT NULL,
  gabinete VARCHAR(20) NULL,
  PRIMARY KEY(idequipamento),
  INDEX equipamento_FKIndex1(Cliente_idCliente),
  FOREIGN KEY(Cliente_idCliente)
    REFERENCES Cliente(idCliente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);


