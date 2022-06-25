######  Em construção... 

# Spring-mvc
No curso o projeto  mudi é uma plaicação web java com spring-mvc. Por ser conhcido no mercado peloa fato de se implemetar muita funções, como persistência de dados,injeção de dependência , seguinodo o padão de arquitetura MVC . 



# 🗃️ Configuração para conectar ao banco de dados 

```
server.port = 8090
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mariadb://127.0.0.1:3306/mudi
spring.datasource.username=****
spring.datasource.password=****
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
#spring.jpa.show-sql: true
```
### Imagem docker mariadb

```
docker run -p 3306:3306 --name mariadb -e MARIADB_ROOT_PASSWORD=**** -d mariadb
```
### Criação de tabela para autenticação 
```
create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);
```


## 🛠️ Ferramentas para o desenvolvimento

 * [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html) - JDK instalado na maquina.
 * [Eclipse](https://www.eclipse.org/downloads/) - IDE utilizada.
 * [Dbeaver](https://dbeaver.io/download/) - Visualisar o banco de dados.
 * [Docker](https://docs.docker.com/desktop/windows/install/) - Docker utilização da imagem do Banco MariaDB.
 * [MariaDB](https://hub.docker.com/_/mariadb) - Banco de dados utilizado.
 * [Spring Initializr](https://start.spring.io/)- Para iniciar o projeto com  as caracterias do spring. 
