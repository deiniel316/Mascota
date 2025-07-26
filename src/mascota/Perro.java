
package mascota;

// herencias de mascota 
 public class Perro extends Mascota implements Vacunable {
    @Override // sobreescritura de metodo para hacer sonido
    public void hacersonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }

    @Override
    public void vacunar() {
        System.out.println("El perro ha sido vacunado.");
    }
}