package practicaHarry;

public class PruebaSnape {
    public static void main(String[] args) {
        def();
    }

    public static  void def(){
        Snape mago = new Snape();
        mago.setCasa("Slytherin");
        mago.setGenero("Masculino");
        mago.setNombre("Severus Snape");
        mago.setBoggart("Voldemort");
        mago.setPatronus("Ciervo");
        String msg = "Personaje de Harry Potter: ";
        msg += "\nCasa: "+mago.getCasa();
        msg += "\nGenero: "+mago.getGenero();
        msg += "\nNombre: "+mago.getNombre();
        msg += "\nBoggart: "+mago.getBoggart();
        msg += "\nPatronus: "+mago.getPatronus();

        System.out.println(msg);
    }
}
