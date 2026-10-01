import java.util.ArrayList;
import java.util.List;


public class hubCentral {

        private List<dispositivoInteligente> dispositivos;

        public hubCentral() {
            this.dispositivos = new ArrayList<>();
        }

        public void agregarDispositivo(dispositivoInteligente dispositivo) {
            dispositivos.add(dispositivo);
            System.out.println("Dispositivo agregado: " + dispositivo.getNombre());
        }
        public void activarModoNoche() {

            System.out.println("\n=== Activando modo noche ===");

            for (dispositivoInteligente d : dispositivos) {

                if (!d.isConectado()) {
                    System.out.println(d.getNombre() + ": desconectado, no se pudo enviar el comando.");
                    continue;
                }

                d.apagar();
            }

            System.out.println("=== Modo noche finalizado ===\n");
        }
}


