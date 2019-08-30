
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class BucketNameParce {




    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello. Enter your regex");
        try {
            String regex = reader.readLine();
            Pattern p = Pattern.compile(regex);

            System.out.println("Enter input string to search: ");
            String input = reader.readLine();
            Matcher matcher = p.matcher(input);
            boolean found = false;
            while (matcher.find()){
                log.info("I found text {} starting at index  {}  and ending at index {} ",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                found = true;
            }
            if (!found){
                log.info("No match found!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
