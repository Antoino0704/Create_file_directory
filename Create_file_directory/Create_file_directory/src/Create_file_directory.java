import java.io.*;			//importa tutte le librerie da java.io
import java.util.Scanner;	//importa libreria scanner
public class Create_file_directory {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String path, text, nome, estensione=".txt", back="\\";		//dichiara variabili
		
		System.out.println("dove vuoi salvare la cartella?");
		path = input.nextLine();			//percorso dove salvare cartella
		File dir = new File(path);
		System.out.println("come si chiama il file?");		
		nome = input.nextLine();		//percorso come si chiama file
		nome = path + back + nome + estensione;		//unire file col percorso della cartella
		File f = new File(nome);
		try
		{					//crea cartella e file di testo e scrive il contenuto acquisito da tastiera
			dir.mkdir();
			f.createNewFile();
			FileWriter fW = new FileWriter(f);
			BufferedWriter fB = new BufferedWriter(fW);
			System.out.println("inserisci contenuto file");
			text = input.nextLine();
			fB.write(text);
			fB.close();
			System.out.println("file creato correttamente");
		}
		catch (IOException eee)			//se l'operazione precedente da un errore IO stampa errore
		{
			System.out.println("ERROR");
		}
	}
}