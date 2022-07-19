package com.voicerecog.test;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

public class VirtualAI {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		Configuration config = new Configuration();
		
		config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		config.setDictionaryPath("src\\9027.dic");
		config.setLanguageModelPath("src\\9027.lm");
		
		LiveSpeechRecognizer rec = new LiveSpeechRecognizer(config);
		
		rec.startRecognition(true);
		
		Desktop des = Desktop.getDesktop();
		
		while(rec.getResult() != null) {
			String s = rec.getResult().getHypothesis();
			System.out.println(s);
			if(s.toLowerCase().equals("google")) {
				URI uri = new URI("https://www.google.com/");
				des.browse(uri);
			}
			else if(s.toLowerCase().equals("youtube")) {
				URI uri = new URI("https://www.youtube.com/");
				des.browse(uri);
			}
		}
	}

}
