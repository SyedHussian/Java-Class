package ProductIO;

public class StringUtil {
	
	public static String Pad(String s, int length){
		
		if(s.length() < length){
			//append spaces until the string is the specified length
			StringBuilder sb = new StringBuilder(s);
			
			while(sb.length() < length){
				sb.append(" ");
			}
			return sb.toString();
		}
		else{
			//truncate the string to be specified length
			return s.substring(0, length);
		}
	}

}
