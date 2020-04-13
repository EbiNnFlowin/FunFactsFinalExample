package com.example.funfactstrial;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private String[] colors = {
            "#3079ab",
            "#c25975",
            "#e15258",
            "#838cc7",
            "#51b46d",
            "#b7c0c7"
    };

    public int getColor() {
        Random random = new Random();
        return Color.parseColor(colors[random.nextInt(colors.length)]);
    }
}
