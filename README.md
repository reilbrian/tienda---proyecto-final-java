# 🛒 Tienda API REST

API REST desarrollada con **Spring Boot** para la gestión de productos y categorías de una tienda.

El proyecto implementa operaciones CRUD completas utilizando Spring Boot, Spring Data JPA y MySQL.

---

# Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Hibernate
- VS Code

---

# Funcionalidades

- Gestión de productos.
- Gestión de categorías.
- Persistencia de datos en MySQL.
- Arquitectura por capas.
- Excepciones personalizadas.
- Relación entre entidades mediante JPA.

---

# Estructura del proyecto

```
src
└── main
    ├── java
    │   └── com
    │       └── tecno
    │           └── tienda
    │               ├── config
    │               ├── controller
    │               ├── exception
    │               ├── model
    │               ├── repository
    │               ├── service
    │               └── EcommerceApplication.java
    │
    └── resources
        ├── application.properties
        └── static
```

---

# Modelo de datos

## Categoría

- id
- nombre

## Producto

- id
- nombre
- precio
- stock
- imagenUrl
- categoria

Relación:

```
Una Categoría
      │
      │ 1
      │
      └──────────< Muchos Productos
```

**Base de datos:** `ecommerce`

**URL base:** `http://localhost:8080`

# Cómo probar la API

1. Ejecutar la aplicación Spring Boot.
2. Abrir Thunder Client en VS Code.
3. Crear una nueva petición HTTP.
4. Seleccionar el método correspondiente (GET, POST, PUT o DELETE).
5. Utilizar los endpoints documentados a continuación.
6. Para POST y PUT, enviar el JSON indicado en el Body.
---------------------------------------------------------------------------

# Endpoints de Categorías

## Obtener todas las categorías

```
GET /categorias
URL:
http://localhost:8080/categorias
```

Respuesta

```json
[
  {
    "id": 1,
    "nombre": "Consola",
    "descripcion": "Consola de videojuegos"
  },
  {
    "id": 2,
    "nombre": "Videojuego",
    "descripcion": "juegos de video"
  },
  {
    "id": 3,
    "nombre": "Perifericos",
    "descripcion": "Auriculares, Teclados, Mouse, etc"
  },
  {
    "id": 4,
    "nombre": "Componentes",
    "descripcion": "Procesadores, Memorias, Placas de video, etc"
  }
]
```

---------------------------------------------------------------------------

## Obtener categoría por ID

```
GET /categorias/{id}
URL:
http://localhost:8080/categorias/1
```

Respuesta
```json
{
  "id": 1,
  "nombre": "Consola",
  "descripcion": "Consola de videojuegos"
}
```

---------------------------------------------------------------------------

## Crear categoría

```
POST /categorias
URL:
http://localhost:8080/categorias
```

Body

```json
{
    "nombre": "Computadoras",
    "descripcion": "computadoras y netbooks"
  }
```
Respuesta
```json
{
  "id": 5,
  "nombre": "Computadoras",
  "descripcion": "computadoras y netbooks"
}
```
---------------------------------------------------------------------------

## Modificar categoría

```
PUT /categorias/{id}
URL:
http://localhost:8080/categorias/4
```

Body

```json
{
    "nombre":"Periféricos"
}
```

---------------------------------------------------------------------------

## Eliminar categoría

```
DELETE /categorias/{id}
URL:
http://localhost:8080/categorias/5
```
Resultado: se borra la categoria "Computadoras" que creamos antes


------------------------------------------------------------------------------------------------------------------------------------------------------

# Endpoints de Productos

## Obtener todos los productos

```
GET /productos
URL:
http://localhost:8080/productos
```
Respuesta
```json
{
  "es bastante largo te va a confundir el readme jaja"
}
```
---------------------------------------------------------------------------

## Obtener producto por ID

```
GET /productos/{id}
URL:
http://localhost:8080/productos/2
```
Respuesta
```json
{
  "id": 2,
  "nombre": "Consola Nintendo Switch 2",
  "precio": 500.0,
  "stock": 50,
  "imagenUrl": "https://images.fravega.com/f300/90f7e78da47972d426dc32bffb291a7d.jpg.webp",
  "categoria": {
    "id": 1,
    "nombre": "Consola",
    "descripcion": "Consola de videojuegos"
  }
}
```
---------------------------------------------------------------------------

## Crear producto

```
POST /productos
URL:
http://localhost:8080/productos
```

Body

```json
{
  "nombre": "Notebook Lenovo",
  "precio": 1250000,
  "stock": 8,
  "imagenUrl": "https://p1-ofp.static.pub//fes/cms/2025/11/03/u55jxyp383ba6k6ubzbd4hvwhsi7gc761205.png?width=1200&height=1200",
  "categoria": {
    "id": 4
  }
}
```
Respuesta
```json
{
  "id": 12,
  "nombre": "Notebook Lenovo",
  "precio": 1250000.0,
  "stock": 8,
  "imagenUrl": "https://p1-ofp.static.pub//fes/cms/2025/11/03/u55jxyp383ba6k6ubzbd4hvwhsi7gc761205.png?width=1200&height=1200",
  "categoria": {
    "id": 4,
    "nombre": null,
    "descripcion": null
  }
}
```
---------------------------------------------------------------------------

## Modificar producto

```
PUT /productos/{id}
URL:
http://localhost:8080/productos/2
```
Body
```json
{
"nombre":"Play 5"
}
```
---------------------------------------------------------------------------

## Eliminar producto

```
DELETE /productos/{id}
URL:
http://localhost:8080/productos/2
```
Resultado: se borra el producto PlayStation 5 Pro 2 TB 

------------------------------------------------------------------------------------------------------------------------------------------------------


