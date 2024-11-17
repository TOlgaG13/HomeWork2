package main;

public class UpDownTransformer extends TextTransformer {

	@Override
	public String transform(String text) {
		StringBuilder transformedText = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i);

			if (i % 2 == 0) {
				transformedText.append(Character.toUpperCase(currentChar));
			} else {
				transformedText.append(Character.toLowerCase(currentChar));
			}
		}

		return transformedText.toString();
	}

	public static void main(String[] args) {
		UpDownTransformer upDownTransformer = new UpDownTransformer();
		String transformedText = upDownTransformer.transform("hello");
		System.out.println(transformedText);
	}
}
