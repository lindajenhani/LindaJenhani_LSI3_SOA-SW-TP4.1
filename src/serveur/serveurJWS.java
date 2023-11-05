package serveur;

import jakarta.xml.ws.Endpoint;
import service.calculatriceWS;

public class serveurJWS {
    public static void main(String[] args) {
        // Spécifiez l'URL à laquelle le service web sera publié.
        String url = "http://localhost:8084/";

        // Publiez le service web à l'URL spécifiée et utilisez l'implémentation de CalculWS comme service.
        Endpoint.publish(url, new calculatriceWS());

        // Affichez un message indiquant que le service web a été déployé avec succès.
        System.out.println("Web service déployé sur " + url);
    }
}

