import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {

    public static String[] inputUser() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] result = br.readLine().split(" ");

        if (result.length != 3) {
            System.out.println("Error! Unavailable amount of arguments");
            System.exit(0);
        }

        return result;
    }

}
