public class Converter {
    public String convertToCurrency(int input) {
        
        // jika nilai yang dimasukkan adalah 0
        if(input == 0) {
            return "Rp. 0";
        }
        
        String before = String.valueOf(input);
        int strlen = before.length();
        String after = "Rp. ";
        int i = 0;
        
        // jika nilai yang dimasukkan adalah minus
        if(before.charAt(i) == '-') {
            after += "-";
            before = before.substring(1, strlen--);
        }
        
        for(; i < strlen; i++) {
            if(i == 0) {
                after += before.charAt(i);
            } else if(((strlen-i) % 3) == 0) {
                after += "."+ before.charAt(i);
            } else {
                after += before.charAt(i);
            }
        }
        
        return after;
    }

}
