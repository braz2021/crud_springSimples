CREATE TABLE atleta (
  id_atleta BIGINT(20) NOT NULL AUTO_INCREMENT,
  tx_nome VARCHAR(100) NOT NULL,
  int_idade INT NOT NULL,
  tx_posicao VARCHAR(100) NOT NULL,
  new_tablecol VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_atleta`));