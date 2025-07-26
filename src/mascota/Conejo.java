
package mascota;

// herencia
public class Conejo extends Mascota implements AtencionEspecial {
    @Override 
    public void hacersonido() {
        System.out.println("El conejo olfatea");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("El conejo recibe terapia postquirurgica");
    }
}
