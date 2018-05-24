public class Mommy {
    public String mommyify(String inputString) {
        int count=0;
        StringBuilder stringBuilder= new StringBuilder("");
        if(calculateVowelPercentage(inputString) >= 30.0) {
            for (int i = 0; i < inputString.length(); i++) {
                if (count == 0 && (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u')) {
                    stringBuilder.append("Momm");
                    count++;
                } else if (count > 0 && (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u')) {
                    count++;
                } else {
                    if (count == 1) {
                        stringBuilder.append("y");
                    } else if (count > 1) {
                        stringBuilder.append("ies");
                    }
                    stringBuilder.append(inputString.charAt(i));
                    count = 0;
                }
            }
            if (count == 1) {
                stringBuilder.append("y");
            } else if (count > 1) {
                stringBuilder.append("ies");
            }
            return stringBuilder.toString();
        }
        return inputString;
    }

    private double calculateVowelPercentage(String inputString) {
        double count=0;
        for(int i=0 ;i< inputString.length();i++) {
            if ((inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u')) {
                count++;
            }
        }
        return (count/inputString.length())*100.0;
    }
}
