package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

// Déclarez la classe en tant que service web avec le nom "CalculWS".
@WebService(name = "CalculWS")
public class calculatriceWS {

    // Déclarez une méthode web avec l'opération "Somme".
    @WebMethod(operationName = "Somme")
    
    public double Somme(@WebParam(name = "val1") double a, @WebParam(name = "val2") double b) {
        // Cette méthode effectue une somme des deux valeurs a et b et renvoie le résultat.
        return a + b;
    }

    
   
    
}
