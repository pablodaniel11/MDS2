ALTER TABLE `Tema` ADD COLUMN `ModeradorUsuarioID2` bigint(20) NOT NULL;
ALTER TABLE `Seccion` ADD COLUMN `AdministradoresUsuarioID` bigint(20) NOT NULL;
ALTER TABLE `Usuario` ADD COLUMN `IDusuario` bigint(20);
ALTER TABLE `Ticket` ADD COLUMN `ModeradorUsuarioID2` bigint(20) NOT NULL;
ALTER TABLE `mds2bd`.`seccion` DROP FOREIGN KEY `FKSeccion561015`;
ALTER TABLE `mds2bd`.`seccion` DROP INDEX `FKSeccion561015`;
ALTER TABLE `mds2bd`.`ticket_administrador` DROP FOREIGN KEY `FKTicket_Adm962413`;
ALTER TABLE `mds2bd`.`ticket_administrador` DROP INDEX `FKTicket_Adm962413`;
ALTER TABLE `mds2bd`.`administrador` DROP PRIMARY KEY;
ALTER TABLE `Administrador` ADD PRIMARY KEY(`UsuarioID`);
ALTER TABLE `mds2bd`.`ticket_administrador` DROP PRIMARY KEY;
ALTER TABLE `ticket_administrador` ADD PRIMARY KEY(`AdministradorID`);
CREATE TABLE `Moderador` (`UsuarioID` bigint(20) NOT NULL, PRIMARY KEY (`UsuarioID`)) ENGINE=InnoDB;
CREATE TABLE `Administradores` (`UsuarioID` bigint(20) NOT NULL, PRIMARY KEY (`UsuarioID`)) ENGINE=InnoDB;
CREATE TABLE `Ticket_Administradores` (`TicketID` bigint(20) NOT NULL, `AdministradoresUsuarioID` bigint(20) NOT NULL, PRIMARY KEY (`TicketID`, `AdministradoresUsuarioID`)) ENGINE=InnoDB;
ALTER TABLE `Seccion` ADD CONSTRAINT `FKSeccion561015` FOREIGN KEY (`AdministradoresUsuarioID`) REFERENCES `Administradores` (`UsuarioID`);
ALTER TABLE `Moderador` ADD CONSTRAINT `FKModerador273169` FOREIGN KEY (`UsuarioID`) REFERENCES `Usuario` (`ID`);
ALTER TABLE `Administradores` ADD CONSTRAINT `FKAdministra513052` FOREIGN KEY (`UsuarioID`) REFERENCES `Usuario` (`ID`);
ALTER TABLE `Ticket_Administradores` ADD CONSTRAINT `FKTicket_Adm779468` FOREIGN KEY (`TicketID`) REFERENCES `Ticket` (`ID`);
ALTER TABLE `Ticket_Administradores` ADD CONSTRAINT `FKTicket_Adm119969` FOREIGN KEY (`AdministradoresUsuarioID`) REFERENCES `Administradores` (`UsuarioID`);
