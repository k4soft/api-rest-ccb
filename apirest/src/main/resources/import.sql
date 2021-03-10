INSERT INTO tipodocumento (idTipoDocumento, nombreDocumento) values (1,'Cédula')
INSERT INTO tipodocumento (idTipoDocumento, nombreDocumento) values (2,'Tarjeta identidad')
INSERT INTO tipodocumento (idTipoDocumento, nombreDocumento) values (3,'Cédula extrangería')


INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (1,'diego','$2a$10$LXvl9cEhPNTO9pX9ApvPG.sPlrm0LuvxHDLmmw8gMFE6BZiwGCwhO', true)
INSERT INTO roles (id_rol,nombre_rol) values (1,'ADMIN')
INSERT INTO users_authorities (id_usuario, id_rol ) values (1,1)