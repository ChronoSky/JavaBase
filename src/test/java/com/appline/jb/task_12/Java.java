package com.appline.jb.task_12;

public class Java {
    public static void main(String[] args) {
        String text = args[0];

        // 1-4
        if (text.contains("Java") && text.startsWith("I like") && text.endsWith("!!!")) {
            System.out.println(text.toUpperCase());
        }

        // 5
        System.out.println(text.replace("a", "o").substring(7,11));
    }
}
