package chat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chat.beans.*;

public class ServletCNX extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /*
         * Récupération des données saisies, envoyées en tant que paramètres de
         * la requête GET générée à la validation du formulaire de connexion
         */
        String username = request.getParameter( "username" );
        String password = request.getParameter( "password" );

        String message;
        /*
         * Initialisation du message à afficher : si un des champs obligatoires
         * du formulaire n'est pas renseigné, alors on affiche un message
         * d'erreur, sinon on affiche un message de succès
         */
        if ( username.trim().isEmpty() || password.trim().isEmpty() ) {
            message = "Erreur - Vous n'avez pas rempli tous les champs. <br> <a href=\"Connexion.jsp\">Cliquez ici</a> pour accéder au formulaire de connexion.";
        } else {
            message = "vous avez connecte !";
        }
        /*
         * Création du bean Cnnexion et initialisation avec les données récupérées
         */
        Connexion cnx = new Connexion();
        cnx.setUsername( username );
        cnx.setPassword( password );

        /* Ajout du bean et du message à l'objet requête */
        request.setAttribute( "cnx", cnx );
        request.setAttribute( "message", message );

        /* Transmission à la page JSP en charge de l'affichage des données */
        this.getServletContext().getRequestDispatcher( "/ChatPage.jsp" ).forward( request, response );
    }
}