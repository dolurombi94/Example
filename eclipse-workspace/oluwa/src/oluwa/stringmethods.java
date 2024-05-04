package oluwa;

public class stringmethods {
	public static void main(String[] args) {
		String s1="Oluwadamilola";
		String s2="will be sucessful";
		
		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("Oluwa"));
		System.out.println(s1.substring(3,6));
		System.out.println(s1.replace("O", "o"));
	}

}
