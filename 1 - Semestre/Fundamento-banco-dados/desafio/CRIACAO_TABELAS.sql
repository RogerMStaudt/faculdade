CREATE TABLE Publicacao (
   ISSN VARCHAR2(20),
   Titulo VARCHAR2(100),
   Editora VARCHAR2(100),
   URL VARCHAR2(255),
	PRIMARY KEY (ISSN)
);

CREATE TABLE Area (
   AreaID NUMBER,
   Descricao VARCHAR2(100),
	PRIMARY KEY (AreaID)
);

CREATE TABLE Artigos (
   ArtigoID NUMBER,
   AreaID NUMBER,
   Titulo VARCHAR2(200),
   NPagina NUMBER,
   Ano NUMBER,
	PRIMARY KEY (ArtigoID),
   FOREIGN KEY (AreaID) REFERENCES Area(AreaID)
);

CREATE TABLE PalavraChave (
   PalavraChaveID NUMBER,
   DescricaoPC VARCHAR2(100),
	PRIMARY KEY (PalavraChaveID)
);

CREATE TABLE ArtigoPublicacao (
   ArtigoPublicacaoID NUMBER,
   ISSN VARCHAR2(20),
   ArtigoID NUMBER,
	PRIMARY KEY (ArtigoPublicacaoID),
   FOREIGN KEY (ISSN) REFERENCES Publicacao(ISSN),
   FOREIGN KEY (ArtigoID) REFERENCES Artigos(ArtigoID)
);

CREATE TABLE ArtigoPalavraChave (
   ArtigoPalavraChaveID NUMBER,
   ArtigoID NUMBER,
   PalavraChaveID NUMBER,
	PRIMARY KEY (ArtigoPalavraChaveID),
   FOREIGN KEY (ArtigoID) REFERENCES Artigos(ArtigoID),
   FOREIGN KEY (PalavraChaveID) REFERENCES PalavraChave(PalavraChaveID)
);

INSERT INTO Publicacao (ISSN,
                        Titulo,
                        Editora,
                        URL)
					 VALUES ('34567890',
					 		   'ArtificialIntelligenceReview',
					 		   'AIPress',
					 		   'Link');

INSERT INTO Publicacao (ISSN,
                        Titulo,
                        Editora,
                        URL)
					 VALUES ('23456789',
							   'JournalofComputing',
							   'TechPress',
							   'Link');

INSERT INTO Publicacao (ISSN,
                        Titulo,
                        Editora,
                        URL)
					 VALUES ('45678901',
							   'IoTJournal',
							   'TechPress',
							   'Link');

INSERT INTO Publicacao (ISSN,
                        Titulo,
                        Editora,
                        URL)
					 VALUES ('56789012',
							   'CyberSecurityJournal',
							   'SecureData',
							   'Link');

INSERT INTO Publicacao (ISSN,
                        Titulo,
                        Editora,
                        URL)
					 VALUES ('67890123',
							   'EducationandTechnology',
							   'EduTech',
							   'Link');

INSERT INTO Area (AreaID,
                  Descricao)
			 VALUES (1,
					   'InteligenciaArtificial');

INSERT INTO Area (AreaID,
                  Descricao)
			 VALUES (2,
					   'Computacao');

INSERT INTO Area (AreaID,
                  Descricao)
			 VALUES (3,
					   'AprendizadodeMaquina');

INSERT INTO Area (AreaID,
                  Descricao)
			 VALUES (4,
				 	   'Tecnologia');

INSERT INTO Area (AreaID,
                  Descricao)
			 VALUES (5,
					   'Seguranca');

INSERT INTO Artigos (ArtigoID,
                     Titulo,
                     Ano,
                     NPagina,
                     AreaID)
				 VALUES (1,
				 		   'OImpactoDaIAnaMedicina',
				 		   2023,
				 		   15,
				 		   1);

INSERT INTO Artigos (ArtigoID,
                     Titulo,
                     Ano,
                     NPagina,
                     AreaID)
				 VALUES (2,
				 		   'AlgoritmosGeneticosParaOtimizacao',
				 		   2022,
				 		   12,
				 		   2);

INSERT INTO Artigos (ArtigoID,
                     Titulo,
                     Ano,
                     NPagina,
                     AreaID)
				 VALUES (3,
						   'RedesNeuraisConvolucionais',
						   2021,
						   20,
						   3);

INSERT INTO Artigos (ArtigoID,
                     Titulo,
                     Ano,
                     NPagina,
                     AreaID)
				 VALUES (4,
						   'AEvolucaoDaInternetDasCoisas',
						   2023,
						   18,
						   4);

INSERT INTO Artigos (ArtigoID,
                     Titulo,
                     Ano,
                     NPagina,
                     AreaID)
				 VALUES (5,
						   'BlockchainNaSegurancaCibernetica',
						   2020,
						   14,
						   5);

INSERT INTO PalavraChave (PalavraChaveID,
                          DescricaoPC)
						VALUES (1,
								  'IA');

INSERT INTO PalavraChave (PalavraChaveID,
                          DescricaoPC)
						VALUES (2,
								  'Medicina');

INSERT INTO PalavraChave (PalavraChaveID,
                          DescricaoPC)
						VALUES (3,
								  'Diagnostico');

INSERT INTO PalavraChave (PalavraChaveID,
                          DescricaoPC)
						VALUES (4,
								  'Algoritmos');

INSERT INTO PalavraChave (PalavraChaveID,
                          DescricaoPC)
						VALUES (5,
								  'Otimizacao');

INSERT INTO ArtigoPalavraChave (ArtigoPalavraChaveID,
										  ArtigoID,
										  PalavraChaveID)
								VALUES (1,
										  1,
										  1);

INSERT INTO ArtigoPalavraChave (ArtigoPalavraChaveID,
										  ArtigoID,
										  PalavraChaveID)
								VALUES (2,
										  1,
										  2);

INSERT INTO ArtigoPalavraChave (ArtigoPalavraChaveID,
										  ArtigoID,
										  PalavraChaveID)
								VALUES (3,
										  1,
										  3);

INSERT INTO ArtigoPalavraChave (ArtigoPalavraChaveID,
										  ArtigoID,
										  PalavraChaveID)
								VALUES (4,
										  2,
										  4);

INSERT INTO ArtigoPalavraChave (ArtigoPalavraChaveID,
										  ArtigoID,
										  PalavraChaveID)
								VALUES (5,
										  2,
										  5);

INSERT INTO ArtigoPublicacao (ArtigoPublicacaoID,
										ArtigoID,
                              ISSN)
							 VALUES (1,
										1,
									   '34567890');

INSERT INTO ArtigoPublicacao (ArtigoPublicacaoID,
										ArtigoID,
                              ISSN)
					 		 VALUES (2,
										2,
									   '23456789');

INSERT INTO ArtigoPublicacao (ArtigoPublicacaoID,
										ArtigoID,
                              ISSN)
							 VALUES (3,
										3,
									   '34567890');

INSERT INTO ArtigoPublicacao (ArtigoPublicacaoID,
										ArtigoID,
                              ISSN)
							 VALUES (4,
										4,
									   '45678901');

INSERT INTO ArtigoPublicacao (ArtigoPublicacaoID,
										ArtigoID,
                              ISSN)
							 VALUES (5,
										5,
									   '56789012');