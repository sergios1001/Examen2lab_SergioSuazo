
package examen2_sergiosuazo;

import java.util.Date;

public class Log {
    private String user,accion,fecha,hora;
    

    public Log() {
    }

    public Log(String user, String accion, String fecha, String hora) {
        this.user = user;
        this.accion = accion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }



    @Override
    public String toString() {
        return "Log{" + "user=" + user + ", accion=" + accion + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
}
