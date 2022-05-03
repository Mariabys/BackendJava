public class SpiderGwen extends SpiderMan implements SpiderGwenActionCallbacks {

    public SpiderGwen(String nombre, String origen, String universo, String descripcion) {
        super(nombre, origen, universo, descripcion);
    }

    @Override
    public void reflejos(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.BlueHorizon);
        s.showImage("3.jpeg");
        s.setBounds(200,100,900,900);
    }
}
