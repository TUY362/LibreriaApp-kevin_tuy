# Cuestionario Diagnóstico - LibraryApp
**Estudiante:** Kevin Tuy - 2026320

### Java y POO

1. **Diferencia entre clase y objeto.**
   * **¿Qué es?:** La clase es como el plano o molde de algo, y el objeto es lo que ya construimos y podemos usar en el programa.
   * **Ejemplo:** La clase es `Libro` y el objeto es `Libro libro1 = new Libro();`.

2. **¿Qué es un atributo?**
   * **¿Qué es?:** Son las características o variables que describen al objeto (lo que guarda por dentro).
   * **Ejemplo:** `private String titulo;`.

3. **¿Qué es un método?**
   * **¿Qué es?:** Las acciones que puede hacer el objeto o las funciones que le ponemos a la clase.
   * **Ejemplo:** El método `getTitulo()`.

4. **¿Para qué sirve un constructor?**
   * **¿Qué es?:** Es un método especial que sirve para crear el objeto y llenarle sus datos iniciales de un solo golpe.
   * **Ejemplo:** `public Libro(int id, String titulo...)`.

5. **Diferencia entre private, public y protected.**
   * **¿Qué es?:** `public` deja que cualquiera vea el código, y `private` le pone candado para que solo se use dentro de esa misma clase.
   * **Ejemplo:** Los atributos siempre van en `private` para protegerlos.

6. **¿Para qué sirven get y set?**
   * **¿Qué es?:** Como los datos están bloqueados con `private`, el `get` sirve para leerlos y el `set` sirve para cambiarlos o asignarles un valor.
   * **Ejemplo:** `setPrecio(50.0);`.

7. **¿Qué significa encapsulamiento?**
   * **¿Qué es?:** Es la técnica de proteger los datos ocultándolos en `private` y dándoles acceso solo mediante los getters y setters.
   * **Ejemplo:** Todo nuestro paquete de modelos está encapsulado.

8. **Diferencia entre clase e interfaz.**
   * **¿Qué es?:** La clase tiene todo el código y la lógica escrita, mientras que la interfaz es solo un contrato o lista de métodos que la clase obligatoriamente debe programar.
   * **Ejemplo:** La interfaz `ILibroDAO` y la clase `LibroDAOImpl`.

9. **¿Qué significa implements?**
   * **¿Qué es?:** La palabra que usamos en Java para decirle a una clase que va a cumplir con las reglas de una interfaz.
   * **Ejemplo:** `public class LibroDAOImpl implements ILibroDAO`.

10. **¿Qué significan static y final?**
    * **¿Qué es?:** `static` es para usar algo sin necesidad de crear un objeto nuevo, y `final` sirve para que una variable o clase ya no se pueda cambiar (es una constante).
    * **Ejemplo:** Las rutas fijas o configuraciones.

### Base de datos y persistencia

11. **¿Qué es una tabla relacional?**
    * **¿Qué es?:** Una tabla de filas y columnas en la base de datos que se conecta con otras tablas para no repetir información.
    * **Ejemplo:** La tabla de libros conectada con categorías.

12. **¿Qué es una clave primaria?**
    * **¿Qué es?:** El identificador único de cada registro en la tabla que nunca se puede repetir.
    * **Ejemplo:** `idLibro`.

13. **¿Qué es una clave foránea?**
    * **¿Qué es?:** Una llave que traemos de otra tabla para hacer la relación o puente entre ambas.
    * **Ejemplo:** `idCategoria` dentro de la tabla libros.

14. **¿Qué significa CRUD?**
    * **¿Qué es?:** Las cuatro operaciones básicas que le hacemos a una base de datos: Crear, Leer, Actualizar y Borrar.
    * **Ejemplo:** Agregar un nuevo libro a la base de datos.

15. **¿Qué es JDBC?**
    * **¿Qué es?:** El conector o puente oficial para que Java pueda comunicarse y mandar comandos a MySQL.
    * **Ejemplo:** El archivo `.jar` del conector de MySQL.

16. **¿Qué es un procedimiento almacenado?**
    * **¿Qué es?:** Una consulta de SQL que dejamos guardada directamente en la base de datos para llamarla rápido desde el código.
    * **Ejemplo:** Un script para buscar un libro.

17. **¿Qué es DAO?**
    * **¿Qué es?:** El patrón que usamos para separar todo lo relacionado con la base de datos del diseño visual.
    * **Ejemplo:** `LibroDAOImpl.java`.

18. **¿Por qué separar SQL del Controller?**
    * **¿Qué es?:** Para tener ordenado el código y no mezclar las pantallas con las conexiones a la base de datos.
    * **Ejemplo:** Que el controlador solo llame al DAO y no tenga código SQL revuelto.

### JavaFX y arquitectura

19. **¿Qué es JavaFX?**
    * **¿Qué es?:** La librería de Java que usamos para hacer aplicaciones de escritorio con diseño moderno.
    * **Ejemplo:** Las pantallas de nuestro proyecto.

20. **¿Qué es FXML?**
    * **¿Qué es?:** Un archivo tipo XML que sirve para diseñar la interfaz gráfica de forma ordenada.
    * **Ejemplo:** `LibroView.fxml`.

21. **¿Qué función cumple SceneBuilder?**
    * **¿Qué es?:** El programa visual donde arrastramos botones, textos y tablas para armar la interfaz sin escribir tanto código a mano.
    * **Ejemplo:** Diseñar el formulario de ingreso.

22. **¿Qué es un Controller?**
    * **¿Qué es?:** El archivo de Java que conecta la parte visual (FXML) con la parte de datos (Modelo/DAO).
    * **Ejemplo:** El que hace que al presionar un botón se guarde el libro.

23. **¿Qué significa @FXML?**
    * **¿Qué es?:** Una etiqueta que le avisa a Java que ese botón o cuadro de texto viene directo del diseño de SceneBuilder.
    * **Ejemplo:** `@FXML private TextField txtTitulo;`.

24. **¿Qué significa MVC?**
    * **¿Qué es?:** Modelo-Vista-Controlador. La forma en que organizamos el proyecto en tres partes para no tener todo en un solo archivo.
    * **Ejemplo:** Tener carpetas separadas para vistas, modelos y controladores.

25. **¿Qué responsabilidad tiene el modelo?**
    * **¿Qué es?:** Únicamente guardar los datos de las entidades del negocio.
    * **Ejemplo:** La clase `Libro`.

26. **¿Qué responsabilidad tiene la vista?**
    * **¿Qué es?:** Mostrarle las pantallas al usuario y recibir lo que escribe o presiona.
    * **Ejemplo:** Las ventanas de la aplicación.

27. **¿Qué responsabilidad tiene el controlador?**
    * **¿Qué es?:** Escuchar los eventos de la vista y mandar a llamar al modelo o al DAO para procesar la información.
    * **Ejemplo:** Ejecutar la acción de guardar.

28. **Dibuja el recorrido de un dato hasta MySQL.**
    * **Recorrido:** Pantalla (FXML) -> Controlador -> Modelo -> DAO -> JDBC -> Base de Datos (MySQL).
    * **Explicación sencilla:** El usuario escribe en la ventana, el controlador lo atrapa, arma el objeto, se lo pasa al DAO, el DAO usa JDBC y lo guarda en la base de datos.