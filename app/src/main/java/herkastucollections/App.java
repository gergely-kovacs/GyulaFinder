/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package herkastucollections;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ret = RetGenerator.generaljRetet();
        String gyulaPozija = GyulaFinder.talaldMegGyulust(ret);
        System.out.println(gyulaPozija);
    }
}
