package zad2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

        String nazwaPliku = "dane.csv";
        String odczytanyTekst = odczytajPlik(nazwaPliku);
        System.out.println("Odczytany tekst:\n" + odczytanyTekst);

	}


 
    
    public static String odczytajPlik(String nazwaPliku) {
        File plikDane = new File(nazwaPliku);      
        String odczyt = "";
        try {
            
            Scanner skaner = new Scanner(plikDane);
            while (skaner.hasNextLine()) {
                odczyt = odczyt + skaner.nextLine() + "\n";
            }   
        } catch (FileNotFoundException e) {
            System.out.println("Brak Pliku do odczytania!");
        }
        return odczyt;
    }
}
