import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Сумма?");
            int volume = Integer.parseInt(reader.readLine());
            System.out.println("Из какого года?");
            int soursrYear = Integer.parseInt(reader.readLine());
            System.out.println("В какой год");
            int destYear = Integer.parseInt(reader.readLine());
            Converter converter = new Converter();
            Float res = converter.convert(volume, soursrYear, destYear);
            System.out.println(res);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
