public abstract class Evento{
    public String tipo;
    public User creador;
    public String titulo;
    public int duracion;
    public int fecha;
    public int horaInicio;
    public int cupoMax;

    public String getTipo(){
        return (tipo);
    }
    public String getCreador(){
        return (User);
    }
    public String getTitulo(){
        return (String);
    }
    public String getDuracion(){
        return (integer);
    }
    public String getFecha(){
        return (integer);
    }
    public String getHoraInicio(){
        return (integer);
    }
    public String getCupoMax(){
        return (integer);
    }
}