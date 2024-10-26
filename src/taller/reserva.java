package taller;

public class reserva {
    String nombre,apellido,idetificacion,ingreso,fin, niNo;
    String perso,habi,mes1,mes2,num;

    public reserva(String nombre, String apellido, String idetificacion, String ingreso, 
            String fin, String perso, String habi,String mes1,String mes2,String num, String niNo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idetificacion = idetificacion;
        this.ingreso = ingreso;
        this.fin = fin;
        this.perso = perso;
        this.habi = habi;
        this.mes1=mes1;
        this.mes2=mes2;
        this.num=num;
        this.niNo=niNo;
    }

    public String getNiNo() {
        return niNo;
    }

    public void setNiNo(String niNo) {
        this.niNo = niNo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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

    public String getPerso() {
        return perso;
    }

    public void setPerso(String perso) {
        this.perso = perso;
    }

    public String getHabi() {
        return habi;
    }

    public void setHabi(String habi) {
        this.habi = habi;
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
