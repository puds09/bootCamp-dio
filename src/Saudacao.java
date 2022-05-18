import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Saudacao {

	static String hora;
	static List<String> manha = Arrays.asList("04", "05", "06", "07", "08", "09", "10", "11");
	static List<String> tarde = Arrays.asList("12", "13", "14", "15", "16", "17");
	static List<String> noite = Arrays.asList("18", "19", "20", "21", "22", "23", "24", "00", "01", "02", "03");
	
	static {
		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		hora = timeStamp.split(":")[0];	
		
	}
	 
	public static String saudacao() {
		if(manha.contains(hora)) {
			return "Bom dia!";
		}else if(tarde.contains(hora)) {
			return "Boa tarde!";
		}else if(noite.contains(hora)){
			return "Boa noite!";
		}
		return null;
		
	}
}
