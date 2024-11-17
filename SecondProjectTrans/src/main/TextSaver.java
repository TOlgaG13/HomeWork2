package main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {
	private TextTransformer transformer;
	private File file;

	public TextSaver(TextTransformer transformer, File file) {
		this.transformer = transformer;
		this.file = file;
	}

	public TextSaver() {
		super();
	}

	public TextTransformer getTransformer() {
		return transformer;
	}

	public void setTransformer(TextTransformer transformer) {
		this.transformer = transformer;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void saveTextToFile(String text) {
       
        String transformedText = transformer.transform(text);
        
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println(transformedText); 
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

	public static void main(String[] args) {

		TextTransformer transformer = new UpDownTransformer();
		File file = new File("output.txt");

		TextSaver textSaver = new TextSaver(transformer, file);
		textSaver.saveTextToFile("hello");
	}
}
