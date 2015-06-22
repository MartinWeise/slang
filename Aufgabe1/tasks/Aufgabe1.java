import slang.AtomScanner;
import slang.LexerException;

import java.io.*;

public class Aufgabe1 {

    public static final String filepath = System.getProperty("user.dir") + File.separator + "Aufgabe1" + File.separator + "tasks" + File.separator + "progs" + File.separator;
    public static final String filename = "00-dot-s-string" + ".slang";

    public static void main(String[] args) {

        AtomScanner as = null;
        InputStream is = null;

        is = readFile(filename);

        try {
            as = new AtomScanner(is);
        } catch (LexerException ex) {
            System.out.println(ex);
            return;
        }

        while (as.hasNext()) {
            if (as.hasNextString()) {
                System.out.println("STRING: " + as.nextString());
            }
            else if (as.hasNextInteger()) {
                System.out.println("INTEGER: " + as.nextInteger());
            }
            else if (as.hasNextAtom()) {
                System.out.println("ATOM: " + as.nextAtom());
            }
            else {
                System.out.println("UNKNOWN: " + as.next());
            }
        }

    }

    private static InputStream readFile(String filename) {
        InputStream is = null;

        try {
            is = new FileInputStream(filepath + filename);
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return is;
    }
}
