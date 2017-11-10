
package ec.edu.ister.modelo;

/**
 *
 * Nombre: Cristian Calle
 */
public class Puntos {
    private String x;
    private String Y;

    public Puntos() {
    }

    public Puntos(String x, String Y) {
        this.x = x;
        this.Y = Y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return Y;
    }

    public void setY(String Y) {
        this.Y = Y;
    }
    
    
    @Override
    public String toString(){
        return "Eje x: " +getX() + "\nEje Y:" +getY();
        
    }
    

}
