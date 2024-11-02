package taller;

public class reserva {
    String nombre,apellido,idetificacion,ingreso,fin, niNo;
    String persona,habitacion,mes1,mes2,numero;

    public reserva(String nombre, String apellido, String idetificacion, String ingreso, 
            String fin, String persona, String habitacion,String mes1,String mes2,String numero, String niNo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idetificacion = idetificacion;
        this.ingreso = ingreso;
        this.fin = fin;
        this.persona = persona;
        this.habitacion = habitacion;
        this.mes1=mes1;
        this.mes2=mes2;
        this.numero=numero;
        this.niNo=niNo;
    }

    public String getNiNo() {
        return niNo;
    }

    public void setNiNo(String niNo) {
        this.niNo = niNo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdetificacion() {
        return idetificacion;
    }

    public void setIdetificacion(String idetificacion) {
        this.idetificacion = idetificacion;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getMes1() {
        return mes1;
    }

    public void setMes1(String mes1) {
        this.mes1 = mes1;
    }

    public String getMes2() {
        return mes2;
    }

    public void setMes2(String mes2) {
        this.mes2 = mes2;
    }
    
     //construtoooor

    public reserva() {
        
    }

    void entrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
