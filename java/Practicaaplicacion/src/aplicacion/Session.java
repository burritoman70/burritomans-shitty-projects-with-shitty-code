package aplicacion;
public class Session {
	User user;
	private static boolean logged=false;
	public void login() {
		String userToBeLogged="";
		String passwordToBeLogged=""; 
		while (true) {
			System.out.print("a");
			userToBeLogged=Main.scanner.nextLine();
			if (!(userToBeLogged.matches("^[A-Za-z0-9]{1,15}$"))) {
				System.out.print("Nombre de usuario "+userToBeLogged+" no es valido\n");
				continue;
			}
			break;
		}
		while (true) {
			passwordToBeLogged=Main.scanner.nextLine();
			if (passwordToBeLogged.matches("^[A-Za-z0-9\\+\\-\\*\\?!\\^/\\$%]{8,15}$")) {				if (checkPassword(passwordToBeLogged,userToBeLogged)) {
					break;
				} else {
					logged=false;
					return;
				}
			}
		}
		logged=true;
		user=new User(userToBeLogged);
		return;
	}
	public boolean getterLogged() {
		return logged;
	}
	private static boolean checkPassword (String password,String user) {
		return true;
	}
}