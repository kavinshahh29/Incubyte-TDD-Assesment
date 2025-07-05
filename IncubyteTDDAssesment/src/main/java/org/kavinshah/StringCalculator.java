package org.kavinshah;


public class StringCalculator {

    public int add(String number)
    {
        if(number.isEmpty())
            return 0;


        String[] num = number.split(",|\n");

        String delimeter = ",|\n";
        if(number.startsWith("//")){
            int NewLineIndex = number.indexOf("\n");
            delimeter = number.substring(2,NewLineIndex);
            number = number.substring(NewLineIndex + 1);
        }

        num=number.split(delimeter);
        StringBuilder negativeNumbers = new StringBuilder();
        int tot=0;

        for (String itr : num) {
            if (!itr.trim().isEmpty()) {
                int value = Integer.parseInt(itr.trim());
                if (value < 0) {
                    if (negativeNumbers.length() > 0) {
                        negativeNumbers.append(", ");
                    }
                    negativeNumbers.append(value);
                } else if (value <= 1000) {
                    tot += value;
                }
            }
        }

        if (negativeNumbers.length() > 0) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }
        return tot;





    }
}
