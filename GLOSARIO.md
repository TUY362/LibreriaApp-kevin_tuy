# Glosario Técnico - LibraryApp
**Estudiante:** Kevin Tuy - 2026320

### Conceptos de Programación Orientada a Objetos (POO)

1. **Clase**
   * **Definición:** Plantilla o molde que define la estructura y el comportamiento de un conjunto de objetos.
   * **En mis palabras:** El molde principal que usamos para crear elementos en el sistema.
   * **Ejemplo:** La clase `Libro.java`.

2. **Objeto**
   * **Definición:** Instancia en memoria creada a partir de una clase.
   * **En mis palabras:** El elemento real y funcional creado con el molde.
   * **Ejemplo:** `Libro miLibro = new Libro();`.

3. **Atributo**
   * **Definición:** Variable que define las características o estado de un objeto.
   * **En mis palabras:** Los datos internos que guarda el objeto.
   * **Ejemplo:** `private String titulo;`.

4. **Método**
   * **Definición:** Bloque de código que define las acciones o comportamientos que puede realizar un objeto.
   * **En mis palabras:** Las funciones exclusivas de la clase.
   * **Ejemplo:** `getTitulo()`.

5. **Constructor**
   * **Definición:** Método especial que se ejecuta automáticamente al crear un objeto para inicializar sus atributos.
   * **En mis palabras:** La función que le da vida al objeto y le asigna sus primeros valores.
   * **Ejemplo:** `public Libro(int id, String titulo)`.

6. **Encapsulamiento**
   * **Definición:** Ocultamiento del estado interno de una clase protegiendo sus atributos.
   * **En mis palabras:** Poner los atributos en `private` y usar getters y setters.
   * **Ejemplo:** `private double precio;`.

7. **Getter y Setter**
   * **Definición:** Métodos de acceso para leer (`get`) y modificar (`set`) atributos privados.
   * **En mis palabras:** Las únicas puertas autorizadas para ver o cambiar los datos.
   * **Ejemplo:** `setPrecio(100.0);`.

8. **Tipo Primitivo**
   * **Definición:** Tipos de datos básicos nativos de Java que almacenan valores simples.
   * **En mis palabras:** Variables sencillas que no tienen métodos adjuntos.
   * **Ejemplo:** `int`, `double`, `boolean`.

9. **Clase Wrapper**
   * **Definición:** Clases que envuelven un tipo primitivo para convertirlo en un objeto.
   * **En mis palabras:** La versión "objeto" de los tipos primitivos para usarlas en colecciones o tablas.
   * **Ejemplo:** `Integer`, `Double`.

10. **Interfaz**
    * **Definición:** Estructura que declara un conjunto de métodos abstractos que las clases deben implementar obligatoriamente.
    * **En mis palabras:** Un contrato de reglas que dice qué métodos hay que programar sí o sí.
    * **Ejemplo:** `ILibroDAO`.

11. **Implements**
    * **Definición:** Palabra clave utilizada por una clase para firmar y cumplir el contrato de una interfaz.
    * **En mis palabras:** Decirle a Java que la clase va a desarrollar los métodos de la interfaz.
    * **Ejemplo:** `public class LibroDAOImpl implements ILibroDAO`.

12. **Static**
    * **Definición:** Modificador que indica que un miembro pertenece a la clase en sí y no a los objetos individuales.
    * **En mis palabras:** Algo que se puede usar sin necesidad de instanciar un objeto nuevo con `new`.
    * **Ejemplo:** Métodos de configuración o patrones Singleton.

13. **Final**
    * **Definición:** Modificador que indica que una variable, método o clase es constante y no puede ser modificada o heredada.
    * **En mis palabras:** Un candado definitivo para que nadie altere su valor.
    * **Ejemplo:** Constantes de conexión.

### Conceptos de Base de Datos y Persistencia

14. **Tabla Relacional**
    * **Definición:** Estructura organizada en filas y columnas que almacena datos relacionados entre sí.
    * **En mis palabras:** Una cuadrícula de información conectada con otras tablas.
    * **Ejemplo:** Tabla `Libros`.

15. **Clave Primaria (Primary Key)**
    * **Definición:** Campo o combinación de campos que identifica de forma única cada registro en una tabla.
    * **En mis palabras:** El código único que no se puede repetir nunca.
    * **Ejemplo:** `idLibro`.

16. **Clave Foránea (Foreign Key)**
    * **Definición:** Campo en una tabla que hace referencia a la clave primaria de otra tabla para crear relaciones.
    * **En mis palabras:** El puente que une dos tablas diferentes.
    * **Ejemplo:** `idCategoria` en la tabla libros.

17. **CRUD**
    * **Definición:** Acrónimo de las cuatro operaciones básicas de bases de datos: Create, Read, Update, Delete.
    * **En mis palabras:** Crear, leer, actualizar y borrar registros.
    * **Ejemplo:** Registrar un nuevo libro en el sistema.

18. **JDBC (Java Database Connectivity)**
    * **Definición:** API de Java que permite ejecutar sentencias SQL y conectarse a bases de datos relacionales.
    * **En mis palabras:** El traductor oficial para que Java pueda hablar con MySQL.
    * **Ejemplo:** El archivo `.jar` del conector de MySQL.

19. **Procedimiento Almacenado**
    * **Definición:** Conjunto de código SQL guardado y ejecutado directamente en el servidor de la base de datos.
    * **En mis palabras:** Consultas guardadas en Workbench listas para llamarse rápido.
    * **Ejemplo:** `sp_agregar_libro`.

20. **DAO (Data Access Object)**
    * **Definición:** Patrón de diseño que separa la lógica de acceso a datos de la lógica de negocios.
    * **En mis palabras:** El archivo exclusivo que se encarga de hablar con la base de datos.
    * **Ejemplo:** `LibroDAOImpl.java`.

### Conceptos de JavaFX y Arquitectura

21. **JavaFX**
    * **Definición:** Plataforma de software para crear aplicaciones de escritorio enriquecidas en Java.
    * **En mis palabras:** La librería oficial que usamos para armar las interfaces gráficas.
    * **Ejemplo:** Las ventanas de nuestra aplicación.

22. **FXML**
    * **Definición:** Lenguaje basado en XML utilizado para definir la interfaz de usuario en JavaFX de forma estructurada.
    * **En mis palabras:** Código tipo HTML para diseñar las pantallas.
    * **Ejemplo:** `LibroView.fxml`.

23. **Scene Builder**
    * **Definición:** Herramienta visual de arrastrar y soltar para diseñar interfaces de usuario FXML.
    * **En mis palabras:** El programa para acomodar botones y tablas sin programar todo a mano.
    * **Ejemplo:** Diseñar formularios de registro.

24. **Controller**
    * **Definición:** Clase encargada de manejar la interacción del usuario, eventos y la comunicación entre la vista y el modelo.
    * **En mis palabras:** El cerebro que escucha cuando el usuario hace clic en un botón.
    * **Ejemplo:** `LibroController.java`.

25. **MVC (Modelo-Vista-Controlador)**
    * **Definición:** Patrón de arquitectura de software que separa la aplicación en tres componentes interconectados.
    * **En mis palabras:** Organizar el proyecto en tres carpetas (datos, diseño y lógica de clics).
    * **Ejemplo:** Paquetes `model`, `view` y `controller`.