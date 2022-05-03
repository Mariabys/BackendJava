package practicaHarry;

public class PruebaRon {
    public static void main(String[] args) {
        def();
    }

    public static  void def(){
        Ron mago = new Ron();
        mago.setCasa("Gryffindor");
        mago.setGenero("Masculino");
        mago.setNombre("Ronald Weasley");
        mago.setBoggart("Araña Gigante");
        mago.setPatronus("Perro (Jack Russell Terrier)");
        String msg = "Personaje de Harry Potter: ";
        msg += "\nCasa: "+mago.getCasa();
        msg += "\nGenero: "+mago.getGenero();
        msg += "\nNombre: "+mago.getNombre();
        msg += "\nBoggart: "+mago.getBoggart();
        msg += "\nPatronus: "+mago.getPatronus();

        System.out.println(msg);
    }
}
