public class SpiderScarlet extends SpiderMan implements SpiderScarletActionCallbacks {

    public SpiderScarlet(String nombre, String origen, String universo, String descripcion){
        super(nombre, origen, universo, descripcion);
    }

    @Override
    public void Aguijones(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.BlueHorizon);
        s.showImage("1.JPEG");
        s.setBounds(200,100,900,100);
    }
}
