Drop database if exists Gestion_materiels ;
     
create database Gestion_materiels;
	use Gestion_materiels;
	create table Professeurs(idprof int (3) not null auto_increment,
		Nom varchar(20),
        Prenom varchar(20),
        Adresse varchar(25),
        Diplome varchar(15),
        primary key(idprof));
	insert into Professeurs values('','VOUANDZA','Cedric','31 Rue du Docteur Guerin','Doctorat');

		create table Materiels(idm int (3) not null auto_increment, 
		designation varchar(100),
        DateAchat date,
        Etat varchar(25),
       primary key(idm));

	insert into Materiels values('', 'Ordinateur portable', '2021-07-10', 'Bonne Etat');

	create table Location( 
		idm int (3) not null auto_increment,
		idprof int(5)not null,
		DATEL date not null,
       heureL Varchar(20) not null,
        Duree varchar(9) not null,
        primary key(idm,idprof),
        foreign key(idm) references Materiels(idm) ,
        foreign key(idprof) references Professeurs(idprof) );

	insert into Location values(null,'01','2020-10-10','14:20','1 mois');
	create view Profs as select Nom, Prenom, Adresse , Diplome from professeurs;