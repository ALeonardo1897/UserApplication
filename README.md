
# UserApplication
Prueba técnica Nisum.

<img alt="Diagrama de Actividades" src="Diagrama de Actividades.drawio.png"/>

## Postman

Para facilitar las pruebas del componente, usted encontrará una colección Postman en la raiz del proyecto.

La colección posee una solicutd POST Create User que contiene el siguiente requestBody de ejemplo para la creación de un usuario.

```json
{
    "name": "Alvaro",
    "email": "test@hotmail.com",
    "password": "P@ssw0rd",
    "phones": [
        {
            "cityCode": "1",
            "number": "1234567",
            "countryCode": "51"
        }
    ]
}
```

Con él usted podrá hacer las pruebas necesarias para la aplicación.
## Backend

Para poder correr la aplicación deberá clonar repositorio y luego agregar la siguiente variable de entorno.

```json
"USER_PASSWORD_REGEX_PATTERN":"^([a-zA-Z0-9@*#]{8,15})$"
```

Con él usted podra establecer la configuración para el patrón de contraseñas.

No olvidar que las contraseñas deben cumplir con las siguientes caracteristicas: Mínimo 8 y Máximo 15 carácteres, se permiten ciertos caracteres especiales.
## Pruebas

Una vez terminada las configuraciones anteriores usted ya tiene todo listo para poder empezar a probar la aplicación.

Disfrute la experiencia.