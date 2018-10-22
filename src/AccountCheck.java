import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AccountCheck {
	
	public boolean checkname(String name) {
		int underscore = 0;
		for(int i=0;i<=name.length()-1;i++) {
			if(!Character.isAlphabetic(name.charAt(i))) {
				return false;
			}
		    if (name.charAt(i) == '_') {
		        underscore++;
		    }
		}
		if (underscore > 1) {
		    return false;
	    }	
		return true;
	}
	
	public boolean checkusername(String name) {
		if(name.length()>15) {
			return false;
		}
	    for(int i=0;i<=name.length()-1;i++) {
			if(!Character.isAlphabetic(name.charAt(i)) && !Character.isDigit(name.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public boolean checkpassword(String pass) {
		if(pass.length()<8) {
			return false;
		}
		return true;
	}
	public boolean checksamepassword(String pass1, String pass2) {
		for(int i=0;i<=pass1.length()-1;i++) {
			if(pass1.charAt(i) != pass2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public boolean checkdate (String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
        try {
           sdf.parse(date);
      
        }catch (ParseException e) {
        	return false;
        }
        return true;
	}
	
	public boolean checkStreetadress(String name) {
		if(name.length()>15) {
			return false;
		}
		for(int i=0;i<=name.length()-1;i++) {
			if(!Character.isAlphabetic(name.charAt(i)) && !Character.isDigit(name.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkcity(String name) {
		for(int i=0;i<=name.length()-1;i++) {
			if(!Character.isAlphabetic(name.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public boolean checkpostalcode(String name) {
		for(int i=0;i<=name.length()-1;i++) {
			if(!Character.isDigit(name.charAt(i)) && (name.charAt(i)!= '-')) {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkcountry(String name) {
		for(int i=0;i<=name.length()-1;i++) {
			if(!Character.isAlphabetic(name.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
