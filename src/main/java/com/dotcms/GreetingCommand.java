package com.dotcms;

import picocli.CommandLine;

@CommandLine.Command
public class GreetingCommand implements Runnable {

    public static void main(String[] args) {
        CommandLine.run(new GreetingCommand(), args);
    }

    @CommandLine.Option(names = {"-n", "--name"}, description = "Who will we greet?", defaultValue = "World")
    String name;

    @Override
    public void run() {
        System.out.println("Hello " + name + "!");
    }
}

