package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell car");
		// 2. Catch the user's answer in a String
String answer=JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equalsIgnoreCase("car")) { //if statements have no semicolons
	speak("correct");
	// 4. Otherwise say "wrong"

}else {
	speak("wrong you are a failure at life");}
		
		// 5. repeat the process for other words
	//xxx	
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}}




