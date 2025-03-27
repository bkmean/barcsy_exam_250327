package task04.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final String PATH;
    private static final String FS;
    private static final String HR;
    private static final Character DIV;
    private static String header = "";

    static {
        FS = File.separator;
        DIV = File.pathSeparatorChar;
        HR = "***************************************";
        PATH = System.getProperty("user.dir") + FS + "task04_data" + FS + "fit_shoes.csv";

    }

    public static void main(String[] args) {
        List<FootWear> shoes = getFootWearsFromFile(PATH);
        displayFootwears(shoes);

    }

    private static void displayFootwears(List<FootWear> shoes) {
        System.out.println(header);
        for (FootWear shoe : shoes) {
            System.out.println(shoe.getAllDataJoinedByDivider(DIV));
        }
        System.out.println(HR);
    }

    private static List<FootWear> getFootWearsFromFile(String file) {
        List<FootWear> shoes = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader)) {
            header = reader.readLine().toUpperCase();
            String row = reader.readLine();
            FootWear shoe = null;
            while (row != null) {
                shoe = getFootWearFromString(row);
                shoes.add(shoe);
                row = reader.readLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shoes;
    }

    private static FootWear getFootWearFromString(String row) {
        String divider = String.valueOf(DIV);
        String[] data = row.split(divider);
        FootWear shoe = new FootWear(
                Integer.valueOf(data[0]),
                data[1],
                data[2],
                Double.valueOf(data[3]),
                Byte.valueOf(data[4]),
                getIsSale(data[5]));
        return shoe;
    }

    private static Boolean getIsSale(String text) {
        boolean isSale = false;
        if (text.equals("1")) {
            isSale = true;
        }
        return isSale;
    }

}
