import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
 
public class LDAP {
 
	public static void main(String[] args) {
 
		//Adresse du serveur sur lequel se trouve l'annuaire LDAP
		String serverIP = "172.17.10.250";
		//Pourt du serveur sur lequel se trouve l'annuaire LDAP
		String serverPort = "389";
		//Login de connexion à l'annuaire LDAP : Le login dois être sous forme de "distinguished name"
		//ce qui signifie qu'il dois être affiché sous la forme de son arborescence LDAP
		String serverLogin = "CN=CARRUESCO Valentin,OU=UTILISATEURS,DC=idleman,DC=fr";
		//Mot de passe de connexion à l'annuaire LDAP
		String serverPass = "motDePasseSecret";
 
		//On remplis un tableau avec les parametres d'environement et de connexion au LDAP
		Hashtable environnement = new Hashtable();
		environnement.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		environnement.put(Context.PROVIDER_URL, "ldap://"+serverIP+":"+serverPort+"/");
		environnement.put(Context.SECURITY_AUTHENTICATION, "simple");
		environnement.put(Context.SECURITY_PRINCIPAL, serverLogin);
		environnement.put(Context.SECURITY_CREDENTIALS, serverPass);
		try {
			//On appelle le contexte à partir de l'environnement
			DirContext contexte = new InitialDirContext(environnement);
			//Si ça ne plante pas c'est que la connexion est faite
			System.out.println("Connexion au serveur : SUCCES");
			try {
				//On recupere l'attribut de DUPONT JEAN
				Attributes attrs = contexte.getAttributes("CN=DUPONT JEAN,OU=UTILISATEURS,DC=idleman,DC=fr");
				System.out.println("Recuperation de dupont : SUCCES");
				//On affiche le nom complet de dupont
				System.out.println(attrs.get("name"));
				//On affiche le mail de dupont
				System.out.println(attrs.get("mail"));
				//On affiche le service de dupont
				System.out.println(attrs.get("department"));
 
			} catch (NamingException e) {
				System.out.println("Recuperation de dupont : ECHEC");
				e.printStackTrace();
			}
		} catch (NamingException e) {
			System.out.println("Connexion au serveur : ECHEC");
			e.printStackTrace();
		}
	}
}