package noc;

import java.util.Scanner;

public class Programa {


	public static void main(String[] args) {
		
		System.out.println("Holi");
		String str = "@article{hopcroft79,\n"
				+ "Author = {Hopcroft , John E . and Ullman , Jefferey},";
		StringTokenizer st = new StringTokenizer(str, "\n", false);

		
		String[] tipo = st.nextToken().split("{");
		tipo[0] = tipo[0].substring(1, tipo[0].length());

		try {
			switch(tipo[0]) {
			case "article":
				tokencito("Author", st);
				break;
			case "book":
				break;
			case "booklet":
				break;
			case "conference":
				break;
			case "inbook":
				break;
			case "incollection":
				break;
			case "inproceedings":
				break;
			case "manual":
				break;
			case "mastersthesis":
				break;
			case "misc":
				break;
			case "phdthesis":
				break;
			case "proceedings":
				break;
			case "techreport":
				break;
			case "unpublished":
				break;
			default:
				System.out.println("C muri�");;
			}
			System.out.println("No se muri�");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void tokencito(String tipo, StringTokenizer st) throws Exception {
		if(st.nextToken().equals(tipo) && st.nextToken().equals("=")
				&& st.nextToken().substring(0,1).equals("{")) {
			String string = st.nextToken();
			while(!string.substring(string.length() - 2, string.length() - 1).equals("}")) {
				string = st.nextToken();
			}
		} else {
			throw new Exception("Est� mal");
		}
	}

}
