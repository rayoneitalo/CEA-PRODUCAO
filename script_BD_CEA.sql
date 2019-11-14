/* TABELA ALUNO */
USE CEA;
CREATE TABLE ALUNO (
	idAluno  int primary key auto_increment,
    nuRA     int,
    nmPessoa varchar(60),
    nmCurso  varchar(45),
    nmTurno  varchar(30),
    nmCampus varchar(45)
);
/* DROP TABLE ALUNO */

/* TABELA CADEDO */
CREATE TABLE CADEADO (
	idCadeado int primary key auto_increment,
    coCadeado varchar(45),
    coSenha   varchar(45),
    icAtivo   boolean
);
/* DROP TABLE CADEADO */

/* TABELA LOCALIZAÇÃO */
CREATE TABLE LOCALIZACAO (
	idLocalizacao int primary key auto_increment,
    nmLocalizacao varchar(45),
    icAtivo       boolean,
    coLocalizacao varchar(45)
);
/* DROP TABLE LOCALIZACAO */

/* TABELA ARMARIO */
CREATE TABLE ARMARIO (
	idArmario   int primary key auto_increment,
	localizacao varchar(45) not null,
    bloco       int not null,
    nuArmario   int,
    icAtivo     boolean,
    IdCadeado   int null,
				foreign key FK_ARMARIO_CADEADO(idCadeado) 
                references CADEADO(idCadeado)
);
/* DROP TABLE ARMARIO */





