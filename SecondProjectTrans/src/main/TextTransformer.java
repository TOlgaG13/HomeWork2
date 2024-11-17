package main;

public class TextTransformer {

	public void transformText(String text) {
		text = text.toUpperCase();
		System.out.println(text);
	}
	public String transform(String text) {
        return text; 
	}
	public static void main(String[] args) {
		TextTransformer transformer = new TextTransformer();
		transformer.transformText("Hello"); 
	}
	
}
