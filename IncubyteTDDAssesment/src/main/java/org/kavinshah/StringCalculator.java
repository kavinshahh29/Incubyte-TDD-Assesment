package org.kavinshah;


public class StringCalculator {

    public int add(String number)
    {
        if(number.isEmpty())
            return 0;

        String []num=number.split(",");
        int tot=0;
        for(String itr:num)
            tot+=Integer.parseInt(itr);


        return tot;





    }
}
