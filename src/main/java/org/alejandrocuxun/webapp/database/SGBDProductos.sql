create database SGBDProductos2023518;

use SGBDProductos2023518;

 -- */*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/ Table */*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/ --
 
 create table Productos(
	productoId int not null auto_increment,
    nombreProducto varchar(30),
    marcaProducto varchar(30),
    descripcionProducto varchar(30),
    precio decimal(10,2),
    primary key pk_productoId(productoId)
 );
 
  -- */*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/ Datos */*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/ --
  
select * from Productos;