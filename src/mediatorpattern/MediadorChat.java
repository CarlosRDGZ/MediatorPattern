package mediatorpattern;

public interface MediadorChat {
   public void enviarMensaje(String mnsj, Usuario usuario);
   
   void agregarUsuario(Usuario usuario);
}
