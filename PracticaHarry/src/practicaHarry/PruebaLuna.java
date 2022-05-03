package practicaHarry;

public class PruebaLuna {
    public static void main(String[] args) {
        def();
    }

    public static  void def(){
        Luna bruja = new Luna();
        bruja.setCasa("Ravenclaw");
        bruja.setGenero("Femenino");
        bruja.setNombre("Luna Lovegood");
        bruja.setBoggart("La muerte de su padre");
        bruja.setPatronus("Liebre");
        String msg = "Personaje de Harry Potter: ";
        msg += "\nCasa: "+bruja.getCasa();
        msg += "\nGenero: "+bruja.getGenero();
        msg += "\nNombre: "+bruja.getNombre();
        msg += "\nBoggart: "+bruja.getBoggart();
        msg += "\nPatronus: "+bruja.getPatronus();

        System.out.println(msg);
    }
}
