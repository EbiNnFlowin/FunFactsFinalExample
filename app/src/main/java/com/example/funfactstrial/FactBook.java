package com.example.funfactstrial;

import java.util.Random;

public class FactBook {
    private String[] facts = {
      "Miles Morales was first introduced in 2011",
      "Icemen was the second X-Man",
      "Malayalam is the language of Kerala",
      "India has the largest English speaking population",
      "India has more than 20 different languages"
    };

    public String getFact() {
        Random random = new Random();
        return facts[random.nextInt(facts.length)];
    }
}
