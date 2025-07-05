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
        int tot=0;
        for(String itr:num)
        {
            if(!itr.trim().isEmpty())
            tot+=Integer.parseInt(itr);
        }


        return tot;





    }
}
