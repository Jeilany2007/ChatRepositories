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
         * R�cup�ration des donn�es saisies, envoy�es en tant que param�tres de
         * la requ�te GET g�n�r�e � la validation du formulaire de connexion
         */
        String username = request.getParameter( "username" );
        String password = request.getParameter( "password" );

        String message;
        /*
         * Initialisation du message � afficher : si un des champs obligatoires
         * du formulaire n'est pas renseign�, alors on affiche un message
         * d'erreur, sinon on affiche un message de succ�s
         */
        if ( username.trim().isEmpty() || password.trim().isEmpty() ) {
            message = "Erreur - Vous n'avez pas rempli tous les champs. <br> <a href=\"Connexion.jsp\">Cliquez ici</a> pour acc�der au formulaire de connexion.";
        } else {
            message = "vous avez connecte !";
        }
        /*
         * Cr�ation du bean Cnnexion et initialisation avec les donn�es r�cup�r�es
         */
        Connexion cnx = new Connexion();
        cnx.setUsername( username );
        cnx.setPassword( password );

        /* Ajout du bean et du message � l'objet requ�te */
        request.setAttribute( "cnx", cnx );
        request.setAttribute( "message", message );

        /* Transmission � la page JSP en charge de l'affichage des donn�es */
        this.getServletContext().getRequestDispatcher( "/ChatPage.jsp" ).forward( request, response );
    }
}