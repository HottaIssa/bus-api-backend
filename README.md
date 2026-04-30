# 🚌 Buses API

Backend REST API para la gestión de buses, construido con Spring Boot y seguridad JWT.

---

## 🛠️ Tecnologías

- Java + Spring Boot
- Spring Security + JWT (jjwt)
- Spring Data JPA + PostgreSQL
- Lombok
- BCrypt

---

## 🔐 Autenticación

Todos los endpoints (excepto `/api/auth/**`) requieren un token JWT en el header:
Authorization: Bearer <token>
### Endpoints de autenticación

| POST | `/api/auth/register` | Registrar nuevo usuario |

| POST | `/api/auth/login` | Iniciar sesión |

**Body de ejemplo:**
```json
{
  "name": "Juan",
  "email": "juan@email.com",
  "password": "123456"
}
```

---

## 🗂️ Modelos

| GET | `/api/model` | Listar todos los modelos |

| POST | `/api/model` | Crear nuevo modelo |

**Body para crear modelo:**
```json
{
  "name": "Volvo"
}
```

---

## 🚌 Buses


| GET | `/api/bus?page=0&size=10` | Listar buses paginados |

| GET | `/api/bus/{id}` | Obtener bus por ID |

| POST | `/api/bus` | Crear nuevo bus |

**Body para crear bus:**
```json
{
  "num": "001",
  "placa": "ABC-123",
  "caracteristica": "Aire acondicionado",
  "modelId": 1
}
```

---

## ⚙️ Configuración

El proyecto permite conexiones CORS desde `http://localhost:5173` por defecto.  
El token JWT tiene una duración de **24 horas**.

---

## 🚀 Ejecución

```bash
git clone https://github.com/HottaIssa/bus-api-backend.git
cd bus-api-backend
./mvnw spring-boot:run
```

Requiere configurar el `application.properties` con las credenciales de la base de datos.

```
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

La API estará disponible en `http://localhost:8080`.