package noc;

public class StringTokenizer {

	private String[] tokens;
	
	private int tokenActual;
	
	private boolean returnDelims;
	
	private byte startsWithDelim = 0;
	
	private byte endsWithDelim = 0;
	
	public StringTokenizer(String str, String delim, boolean returnDelims) {
		if(str.startsWith(delim)) {
			startsWithDelim = 1;
		}
		if(str.endsWith(delim)) {
			endsWithDelim = 1;
		}
		tokens = str.split(delim);
		this.returnDelims = returnDelims;
		tokenActual = 0;
	}
	
	public int countTokens() {
		if(returnDelims) {
			return (tokens.length * 2 - 1) + startsWithDelim + endsWithDelim - tokenActual;
		} else {
			return tokens.length - tokenActual;
		}
	}
	
	public boolean hasMoreTokens() {
		if(returnDelims) {
			return (tokens.length * 2 - 1) + startsWithDelim + endsWithDelim - tokenActual <= 0;
		} else {
			return (tokens.length - tokenActual) <= 0;
		}
	}
}

