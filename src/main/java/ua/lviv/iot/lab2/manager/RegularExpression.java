package ua.lviv.iot.lab2.manager;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public String input = "1 6 -10 11.5 110 320";
    public void findRegularExp(){
        String regex = "(?<!-)(\\s|^)(\\d+)([.]\\d+)?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(this.input);
        float sum = 0;
        while(m.find()) {
            System.out.println(m.group());
            sum += Float.parseFloat(m.group());
        }
        System.out.println(sum);
    }
}
