public class Mommy {

    public String mommify(String inputString) {
        int numberOfContinuousVowels = 0;
        StringBuilder mommifiedString= new StringBuilder("");

        if(calculateVowelPercentage(inputString) >= 30.0) {
            for (int index = 0; index < inputString.length(); index++) {
                if (numberOfContinuousVowels == 0 && checkIfVowel(inputString,index) ) {
                    mommifiedString.append("Momm");
                    numberOfContinuousVowels++;
                } else if (numberOfContinuousVowels > 0 && checkIfVowel(inputString,index)  ) {
                    numberOfContinuousVowels++;
                } else {
                    mommifiedString = appendSuffix(numberOfContinuousVowels,mommifiedString);
                    mommifiedString.append(inputString.charAt(index));
                    numberOfContinuousVowels = 0;
                }
            }
            mommifiedString = appendSuffix(numberOfContinuousVowels,mommifiedString);
            return mommifiedString.toString();
        }
        return inputString;
    }

    private StringBuilder appendSuffix(int count,StringBuilder mommifiedString) {
        if (count == 1) {
            mommifiedString.append("y");
        } else if (count > 1) {
            mommifiedString.append("ies");
        }
        return mommifiedString;
    }

    private double calculateVowelPercentage(String inputString) {
        double numberOfVowels = 0;
        int lengthOfString = inputString.length();

        for(int index = 0 ;index < lengthOfString;index++) {
            if (checkIfVowel(inputString,index)) {
                numberOfVowels++;
            }
        }
        return (numberOfVowels / lengthOfString) * 100.0;
    }

    private boolean checkIfVowel(String inputString, int index) {
        return (inputString.charAt(index) == 'a' || inputString.charAt(index) == 'e' || inputString.charAt(index) == 'i' || inputString.charAt(index) == 'o' || inputString.charAt(index) == 'u');

    }
}
