package practicaHarry;

public class PruebaHermione {
    public static void main(String[] args) {
        def();
    }

    public static  void def(){
        Hermione bruja = new Hermione();
        bruja.setCasa("Gryffindor");
        bruja.setGenero("Femenino");
        bruja.setNombre("Hermione Granger");
        bruja.setBoggart("Al  Fracaso");
        bruja.setPatronus("Nutria");
        String msg = "Personaje de Harry Potter: ";
        msg += "\nCasa: "+bruja.getCasa();
        msg += "\nGenero: "+bruja.getGenero();
        msg += "\nNombre: "+bruja.getNombre();
        msg += "\nBoggart: "+bruja.getBoggart();
        msg += "\nPatronus: "+bruja.getPatronus();

        System.out.println(msg);
    }
}
