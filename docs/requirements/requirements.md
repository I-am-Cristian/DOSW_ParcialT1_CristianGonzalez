# 📄 Requerimientos del Sistema

## 1. Lista general de requerimientos

El sistema de EventSync tiene los siguientes requerimientos (descripción a alto nivel):

### 1.1 Requerimientos funcionales

El sistema de EventSync debe tener la capacidad de:

1. Crear eventos por cada tipo
2. Aplicar reglas de negocio por los diferentes eventos
3. Notificar automaticamente los cambios relevantes del evento
4. Autenticar usuarios acorde su rol en la organizacion
5. Evitar inscripciones a eventos que ya cuentan con el cupo lleno o permitir inscripciones a los que cumplan los requisitos

## 2. Diagramas de caso de uso

### 2.1 Requerimiento Funcional 1

| Campo | Descripción |
|------|-------------|
| **ID** | RF-01 |
| **Nombre del requerimiento** | Crear eventos por cada tipo |
| **Descripción** | *El sistema debe Crear eventos de tipo (conferencias, talleres y hackathons)*  |
| **Precondiciones** | *Para que el sistema cumpla con este requerimiento, EventSync debe tener previamente todos los requisitos de registro llenos* |
| **Actor** | *Profesor* |
| **Flujo principal** | 1. El actor crea un evento <br>2. El sistema revisa que se cumplan requerimientos <br>3. El sistema notifica el evento |
| **Diagrama de caso de uso** | ![alt text](/docs/uml/CasoProfesor.png)|
| **Poscondiciones** | *Se espera como resultado un evento de cualquier tipo* |

### 2.2 Requerimiento Funcional 2

| Campo | Descripción |
|------|-------------|
| **ID** | RF-02 |
| **Nombre del requerimiento** | Incribir una conferencia |
| **Descripción** | *El sistema debe permitir la incripcion a los eventos* |
| **Precondiciones** | *Para que el sistema cumpla con este requerimiento, EventSync debe tener previamente el evento creado y el tipo de evento que es.* |
| **Actor** | *Estudiante* |
| **Flujo principal** | 1. El actor debe inscribirse al evento <br>2. El sistema debe validar la incripcion <br>3. El sistema notifica sobre la inscripcion |
| **Diagrama de caso de uso** | ![alt text](/docs/uml/CasoEstudiante.png)|
| **Poscondiciones** | *Se espera como resultado que el estudiante tenga acceso a el evento y pueda asistir* |