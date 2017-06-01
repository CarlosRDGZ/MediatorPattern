package mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MediadorChat{
    
    private List<Usuario> usuarios;
    
    
    public Chat() {
        usuarios = new ArrayList();
    }
    
    @Override
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    @Override
    public void enviarMensaje(String mnsj, Usuario emisor) {
        for(Usuario receptor:usuarios) {
            if(receptor != emisor)
                receptor.recibir(mnsj);
        }
    }
}
