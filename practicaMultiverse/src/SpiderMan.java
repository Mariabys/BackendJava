public class SpiderMan {
    private String nombre;
    private String origen;
    private String universo;
    private String descripcion;

    public  SpiderMan(String nombre, String origen, String universo, String descripcion){
        this.nombre = nombre;
        this.origen = origen;
        this.universo = universo;
        this.descripcion = descripcion;
    }

    public String getNombre() {  return nombre;  }

    public String getOrigen() {  return origen;  }

    public String getUniverso() {  return universo;  }

    public String getDescripcion() {  return descripcion;  }


    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setOrigen(String origen){
        if(!origen.isEmpty()){
            this.origen = origen;
            return true;
        } else
            return false;
    }

    public boolean setUniverso(String universo){
        if(!universo.isEmpty()){
            this.universo = universo;
            return true;
        } else
            return false;
    }

    public boolean setDescripcion(String descripcion){
        if(!descripcion.isEmpty()){
            this.descripcion = descripcion;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "\nnombre: "+nombre+
                        "\norigen: "+origen+
                        "\nuniverso: "+universo+
                        "\ndescripcion: "+descripcion+"\n";
    }

}

