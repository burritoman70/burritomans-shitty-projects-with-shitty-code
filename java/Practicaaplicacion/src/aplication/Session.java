package aplication;
import java.util.*;
import java.io.*;
public class Session {
	User user;
	Scanner scanner=Main.scanner;
	private static boolean logged=false;
	public void login() {
		scanner.nextLine();
		String userToBeLogged="";
		String passwordToBeLogged="";
		while (true) {
			userToBeLogged=scanner.nextLine();
			if (!(userToBeLogged.matches("^[A-Za-z0-9]{1,15}$"))) {
				System.out.print("Nombre de usuario "+userToBeLogged+" no es valido\n");
				continue;
			}
			break;
		}
		while (true) {
			passwordToBeLogged=scanner.nextLine();
			if (passwordToBeLogged.matches("^[A-Za-z0-9\\+\\-\\*\\?!\\^/\\$%]{8,15}$")) {				
				if (checkPassword(passwordToBeLogged,userToBeLogged)) {
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
		File loginData = new File("loginData.txt");
		try {
			Scanner fileScanner=new Scanner(loginData);
		} catch (Exception  e) {
			assert(false); 
		}
		return true;
	}
	public void setterLogged(boolean result) {
		logged=result;
	}
}