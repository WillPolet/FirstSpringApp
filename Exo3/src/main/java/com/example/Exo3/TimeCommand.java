package com.example.Exo3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCommand implements Command {
    @Override
    public void execute() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());
        System.out.println("Current time is: " + currentTime);
    }
}

