package SALPD10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static String[] getRandomWords(Map<String, String> dictionary, int numberOfWords) {
		List<String> palabras = new ArrayList<>(dictionary.keySet());
        Collections.shuffle(palabras);
        return palabras.subList(0, numberOfWords).toArray(new String[0]);
	}

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("gato", "cat");
        dictionary.put("perro", "dog");
        dictionary.put("casa", "house");
        dictionary.put("libro", "book");
        dictionary.put("hola", "hello");
        dictionary.put("amigo", "friend");
        dictionary.put("sol", "sun");
        dictionary.put("luna", "moon");
        dictionary.put("agua", "water");
        dictionary.put("ciudad", "city");
        dictionary.put("rojo", "red");
        dictionary.put("verde", "green");
        dictionary.put("amarillo", "yellow");
        dictionary.put("coche", "car");
        dictionary.put("computadora", "computer");
        dictionary.put("musica", "music");
        dictionary.put("juego", "game");
        dictionary.put("tiempo", "weather");
        dictionary.put("trabajo", "work");
        dictionary.put("escuela", "school");
        
        
        String[] words = getRandomWords(dictionary, 5);
        
        int correctAnswers = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        
        for(String spanishWord: words) {
            System.out.print("Traduce al inglés " + spanishWord + " : ");
            
            String wordToTranslate = scanner.nextLine();
            
            String translatedWord = dictionary.get(spanishWord);
                        
            boolean isCorrect = translatedWord != null && wordToTranslate.equalsIgnoreCase(translatedWord);
            
            correctAnswers += isCorrect ? 1 : 0;
        }
        
        scanner.close();
        
        System.out.println("Respuestas correctas: " + correctAnswers);
        System.out.println("Respuestas incorrectas: " + (5 - correctAnswers));
	}
}
