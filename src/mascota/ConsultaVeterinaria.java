
package mascota;

import java.util.ArrayList;
// clase principal que simula la consulta veterinaria
public class ConsultaVeterinaria {
    public static void main(String[] args) {
       
        // se crea una lista polimorfica
        ArrayList<Mascota> mascotas = new ArrayList<>();

        // se crean las subclases 
        mascotas.add(new Perro());
        mascotas.add(new Gato());
        mascotas.add(new Conejo());
        mascotas.add(new Tortuga());

        for (Mascota m : mascotas) {
            m.hacersonido(); // ejecula el metodo especifico de cada clase
            m.descansar();

            // Atención especial uso controlado  para saber si tiene atencion
            //especial
            if (m instanceof AtencionEspecial) {
                ((AtencionEspecial) m).recibirAtencionEspecial();
            }

            //  para saber si se puede vacunar 
            if (m instanceof Vacunable) {
                ((Vacunable) m).vacunar();
            }

            System.out.println("........");
        }
    }
}
