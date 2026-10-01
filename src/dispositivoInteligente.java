public class dispositivoInteligente {

    private String nombre;
    private boolean encendido;
    private boolean conectado;

    public dispositivoInteligente(String nombre){

        this.nombre = nombre;
        this.conectado = true;
        this.encendido = false;

    }

    public String getNombre() {
        return nombre;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado){

        this.conectado = conectado;

    }

    public void encender(){

        encendido = true;

        System.out.println(nombre + ": encendido.");

    }

    public int apagar(){

        encendido = false;

        System.out.println(nombre + ": apagado");

       return 0;
    }

    public void configurar(String parametro) {

        System.out.println(nombre + ": configurado con parámetro " + parametro);

    }

}



