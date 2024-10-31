package taller;
import javax.swing.*;
public class herencia extends reserva implements inter{
    String contraseña,usuario;
    public herencia(String contraseña, String usuario) {
        super();
        this.contraseña = contraseña;
        this.usuario = usuario;
    }
    public String getContra() {
        return contraseña;
    }

    public void setContra(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsu() {
        return usuario;
    }

    public void setUsu(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void entrar() {
        if((contraseña.equals("monte"))&&(usuario.equals("juan"))){
        JOptionPane.showMessageDialog(null, "la contraseña es correcta");
        jose objeto= new jose();
        objeto.setVisible(true);
        
        
        }else{
         JOptionPane.showMessageDialog(null, "Usuario o contraseña es incorrecta");
     }
    } 
}

    

