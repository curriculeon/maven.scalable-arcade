package com.github.curriculeon;

import com.github.curriculeon.casino.Casino;
import com.github.curriculeon.casino.CasinoInterface;

/**
 * Created by leon on 1/29/2017.
 * @ATTENTION_TO_STUDENTS - You are advised against modifying this class
 */
public class Main {
    public static void main(String[] args) {
        CasinoInterface casino = new Casino();
        casino.run();
    }
}
