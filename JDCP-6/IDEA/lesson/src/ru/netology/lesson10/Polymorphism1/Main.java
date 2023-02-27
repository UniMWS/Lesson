package ru.netology.lesson10.Polymorphism1;

public class Main {

    public static void main(String[] args) throws Exception {
        Instrument[] instruments = {
                new Guitar(),
                new Piano(),
                new Flute(),
                new Guitar()
        };
        boolean[][] shouldPlay = {
                {false, true, true, true, true, false},
                {true, false, true, false, true, false},
                {false, false, true, true, false, false},
                {false, true, true, true, true, false}
        };
        Song song = new Song(instruments, shouldPlay);

        song.play();
    }
}