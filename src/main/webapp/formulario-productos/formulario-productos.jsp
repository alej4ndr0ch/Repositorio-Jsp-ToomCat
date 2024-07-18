<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Sistema de gestión de productos</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Dark offcanvas</h5>
                        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link active" href="../index.jsp">Inicio</a>
                                <a class="nav-link" aria-current="page" href="formulario-productos.jsp">Formulario Producto</a>
                                <a class="nav-link active" href="../producto-servlet">Lista Productos</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>  
        <div class="container text-center">
            <h1>Lista Productos</h1>
            <% ArrayList<String> datosProducto = (ArrayList) request.getAttribute("datosProducto"); %>
            <% if (datosProducto != null) { %>
            <% for (String producto : datosProducto) { %>
            <ul>
                <li class="list-unstyled"><%= producto %></li>
            </ul>
            <% } %>
            <% } %>
        </div>
            <form action="/producto-servlet/" method="post" enctype="multipart/form-data">
                <div class="form-floating mb-4">
                    <input class="form-control" id="nombreProducto" name="nombreProducto" type="text">
                    <label for="nombreProducto">Nombre del Producto</label>
                </div>

                <div class="form-floating mt-4">
                    <textarea class="form-control" id="descripcionProducto" name="descripcionProducto" type="text"></textarea>
                    <label for="descripcionProducto">Descripción del Producto</label>
                </div>

                <div class="form-floating mt-4">
                    <input class="form-control" id="marcaProducto" name="marcaProducto" type="text">
                    <label for="marcaProducto">Marca del Producto</label>
                </div>

                <div class="form-floating mt-4">
                    <input class="form-control" id="precioProducto" name="precioProducto" type="text" style="color: #066699 ">
                    <label for="precioProducto">Q.</label>
                </div>
                <div class="form-floating mt-5">
                    <input type="submit" value="Agregar" class="btn btn-success">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
