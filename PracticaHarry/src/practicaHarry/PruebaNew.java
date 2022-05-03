package practicaHarry;

public class PruebaNew {
    public static void main(String[] args) {
        def();
    }

    public static  void def(){
        Newton mago = new Newton();
        mago.setCasa("Hufflepuff");
        mago.setGenero("Masculino");
        mago.setNombre("Newton Scamander");
        mago.setBoggart("Tener que trabajar en una oficina");
        mago.setPatronus("Kelpie");
        String msg = "Personaje de Harry Potter: ";
        msg += "\nCasa: "+mago.getCasa();
        msg += "\nGenero: "+mago.getGenero();
        msg += "\nNombre: "+mago.getNombre();
        msg += "\nBoggart: "+mago.getBoggart();
        msg += "\nPatronus: "+mago.getPatronus();

        System.out.println(msg);
    }
}
