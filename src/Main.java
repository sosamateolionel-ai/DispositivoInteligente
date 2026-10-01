//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

hubCentral central = new hubCentral();

dispositivoInteligente dispositivo1 = new dispositivoInteligente("foco");
dispositivoInteligente dispositivo2 = new dispositivoInteligente("aire");
dispositivoInteligente dispositivo3 = new dispositivoInteligente("televisor");

//agregamos dispositivos a la central
central.agregarDispositivo(dispositivo1);
central.agregarDispositivo(dispositivo2);
central.agregarDispositivo(dispositivo3);

//encendemos los dispostivos
dispositivo1.encender();
dispositivo2.encender();
dispositivo3.encender();

//el dispositivo1 no esta vinculado
dispositivo1.setConectado(false);

dispositivo2.configurar("24");
dispositivo3.configurar("40");

central.activarModoNoche();
}
