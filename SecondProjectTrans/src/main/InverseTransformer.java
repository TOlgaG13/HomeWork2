package main;

public class InverseTransformer extends TextTransformer {

	@Override
    public String transform(String text) {
        return new StringBuilder(text).reverse().toString();
}
  public static void main(String[] args) {
        InverseTransformer inverseTransformer = new InverseTransformer(); 
        String reversedText = inverseTransformer.transform("hello"); 
        System.out.println(reversedText); 
    }
}