package mediatorpattern;

public abstract class Usuario {
    
    protected MediadorChat mediador;
    protected String nombre;
    
    public Usuario(MediadorChat mediador, String nombre) {
        this.mediador = mediador;
        this.nombre = nombre;
    }
    
    public abstract void enviar(String mensaje);
    
    public abstract void recibir(String mensaje);
}
