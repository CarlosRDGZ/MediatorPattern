package mediatorpattern;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        MediadorChat chat = new Chat();
        
        Usuario usuario1 = new UsuarioChat(chat, "Daniel");
        Usuario usuario2 = new UsuarioChat(chat, "Maricruz");
        Usuario usuario3 = new UsuarioChat(chat, "Carlos");
        
        chat.agregarUsuario(usuario1);
        chat.agregarUsuario(usuario2);
        chat.agregarUsuario(usuario3);
        
        usuario1.enviar("¡Hola a todos!");
    }
}
