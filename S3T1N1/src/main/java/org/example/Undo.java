package org.example;

import java.util.ArrayList;

public class Undo {
    private static Undo instance;

    private ArrayList<String> commands = new ArrayList<>();

    private Undo() {
    }


    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }


    public void writeCommand(String command) {
        commands.add(command);
    }

    public void showCommands() {
        for (int i = 0; i < commands.size(); i++) {
            System.out.println(i + " " + commands.get(i));
        }
    }

    public void deleteCommand(String s) {
        int varPosicion = s.lastIndexOf(' ');
        String forParce = s.substring(varPosicion + 1);
        int index = Integer.parseInt(forParce);
        commands.remove(index);
        showCommands();
    }


}
