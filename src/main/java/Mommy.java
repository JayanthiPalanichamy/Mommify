public class Mommy {
    public String mommyify(String inputString) {
        StringBuilder stringBuilder= new StringBuilder("");
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u') {
                    stringBuilder.append("Mommy");
                } else {

                    stringBuilder.append(inputString.charAt(i));
                }
            }
        return stringBuilder.toString();
    }
}
