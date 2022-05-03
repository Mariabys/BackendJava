public class Pruebamultiverso {
    public static void main(String[] args) throws InterruptedException {
        Screen screen = new Screen();
        SpiderScarlet spiderScarlet = new SpiderScarlet(
                "Spider Scarlet",
                "Humano Mutado Clon de Peter Parker",
                "Tierra-616",
                "Creado a partir del ADN de Peter Parker por el Jackal, este clon fue hecho para luchar contra él como parte del tormento de Jackal hacia Spider-Man, a quien culpaba de la muerte de Gwen Stacy."
        );
        spiderScarlet.Aguijones(screen);
        Thread.sleep(1000);

        SpiderManNoir spiderManNoir = new SpiderManNoir(
                "Spider Man Noir",
                "versión alternativa de Peter Parker en la década de 1930",
                "Tierra-90214",
                "Adopta el periodismo como una fuerza para luchar contra el mal y darle el poder a los inocentes y necesitados."

        );
        spiderManNoir.fuerza(screen);
        Thread.sleep(1000);

        SpiderGwen spiderGwen = new SpiderGwen(
                "Spider Gwen",
                "Picadura por una araña radiactiva",
                "Tierra-65",
                "Después de ser mordida por una araña diseñada genéticamente, a Gwen se le otorgaron superpoderes similares a los de un arácnido y comenzó una carrera como luchadora contra el crimen, apodada por los medios como Spider-Woman."
        );
        spiderGwen.reflejos(screen);
    }
}
