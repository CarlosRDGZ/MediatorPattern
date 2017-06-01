package mediatorpattern;

public class UsuarioChat extends Usuario {

    public UsuarioChat(MediadorChat mediador, String nombre) {
        super(mediador, nombre);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(nombre + " envio: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
       System.out.println(nombre + " recibio: " + mensaje);
    }
}
