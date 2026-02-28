# DOSW_ParcialT1_CristianGonzalez

### Autor : Cristian Jose Gonzalez Rodriguez

## Puntos Del Parcial

## 1. Realice el diagrama de contexto con las generalidades de su sistema.

![image](docs/uml/Diagrama_De_Contexto.png)

## 2. Identifique 2 patrones de diseño que puedan aplicarse al caso de estudio,  especificando por cada uno:

## Patron1.

a. Nombre del Patrón

Patron a usar es Abstract Factory

b. Tipo de patrón (creacional, estructural o de comportamiento).

Este es un patron Creacional

c. Justificación de la decisión.

Decidi usar este patron creacional ya que nos permite producir familias de objetos relacionados sin especificar sus clases concretas.

En este caso tenemos todos los tipos de evento y reglas, cada una con sus diferencias pero cuentan con la misma estructura, lo mismo pasa con los usuarios, son estudiantes, profesores y administratuvos pero cuentan con nombre, correo y otros atributos y metodos similares.

Con esto en mente, es la mejor opcion ya que creamos clases abstractas que tendran lo que tienen en comun y cada clase aparte se hace cargo de saber implementarlas  a su necesidad.


## Patron2.

a. Nombre del Patrón

Patron a usar es Observer

b. Tipo de patrón (creacional, estructural o de comportamiento).

Este es un patron de comportamiento

c. Justificación de la decisión.

Decidi usar este patron creacional ya que nos permite definir un mecanismo de suscripción para notificar a varios objetos sobre cualquier evento que le suceda al objeto que están observando.

En este caso todos los usuarios estan observando al notificador o pulicador que es el encagado de decir cuando se genera un evento nuevo, bien sea una conferencia, taller o hackaton

## 3. Identifique 5 requerimientos del sistema y clasifíquelos en funcionales  y no funcionales. Garantiza que al menos un requerimiento funcional seleccionado utilice un patrón identificado. 

Requerimientos del sistema:

Funcionales: 
* Crear eventos segun el tipo a usar. **Aca se aplica el patron de Abstract Factory ya que cada evento cumple con ciertos criteorios que otros no**

* Registrar inscripciones. 

* Notificar a los incritos los cambios relevante en el evento. 

No Funcionales:
* Generar informes que cuenten con el logo de la institucion

* Checkear el formato de las reglas de correos, ya que solo permite el  @mail.escuelaing.edu.co

## 4. Del listado anterior, seleccione los 2 requerimientos funcionales más importantes del sistema y desarrolle un diagrama de casos de uso con su respectiva historia de usuario. Garantiza que al menos un requerimiento funcional seleccionado utilice un patrón identificado.

Caso de uso 1.

Como: Profesor

Quiero: Crear un evento

Para Poder: Generar mas eventos academicos del campus(conferencias, talleres y hackathons) ayudando a los estudiantes en su formacion academica
**Este tiene implementado el patron de diseño Abstract Factory ya que cada Evento es diferente entre si, pero comparten similitudes que heredaran de una clase abstracta**

![alt text](docs/uml/CasoProfesor.png)


Caso de uso 2.

Como: Estudiante

Quiero: Inscribirme a una Conferencia

Para Poder: Participar activamente y adquir mayor conocimiento sobre el tema o aprender cosas nuevas.

![alt text](docs/uml/CasoEstudiante.png)







