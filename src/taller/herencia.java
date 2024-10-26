package taller;
import javax.swing.*;
public class herencia extends reserva implements inter{
    String contra,usu;
    public herencia(String contra, String usu) {
        super();
        this.contra = contra;
        this.usu = usu;
    }
    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    @Override
    public void entrar() {
        if((contra.equals("monte"))&&(usu.equals("juan"))){
        JOptionPane.showMessageDialog(null, "la contraseña es correcta");
        jose op= new jose();
        op.setVisible(true);
        
        
        }else{
         JOptionPane.showMessageDialog(null, "Usuario o contraseña es incorrecta");
     }
    } 

    

    
        }

    

