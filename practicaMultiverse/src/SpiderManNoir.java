public class SpiderManNoir extends SpiderMan implements SpiderManNoirActionCallbacks {

    public SpiderManNoir(String nombre, String origen, String universo, String description){
        super(nombre, origen, universo, description);
    }

    @Override
    public void fuerza(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",18,Colors.BlueHorizon);
        s.showImage("2.jpeg");
        s.setBounds(200,100,900,100);
    }
}
