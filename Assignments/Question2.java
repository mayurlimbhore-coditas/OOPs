package Assignments;
/*
    Q2. Create an abstract class Instrument which has the abstract function play.
    - Create three more subclasses from Instrument which are Piano, Flute, Guitar.
    - Override the play method inside all three classes printing a message.
        "Piano is playing tan tan tan tan" for Piano class.
        "Flute is playing toot toot toot toot" for Flute class.
        "Guitar is playing tin tin tin" for Guitar class.
    You must not allow the user to declare an object of Instrument class. Create an array of
    10 Instruments. Assign different types of instrument to Instrument reference. Check for
    the polymorphic behavior of the play method. Use the instanceof operator to print which
    object stored at which index of instrument array.
*/
abstract class Instrument {
    abstract void play();
}
class Flute extends Instrument {
    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}
class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];
        for (int index = 0; index < instruments.length; index++) {
            if (index % 3 == 0) {
                instruments[index] = new Piano();
            } else if (index % 3 == 1) {
                instruments[index] = new Flute();
            } else {
                instruments[index] = new Guitar();
            }
        }
        for (int index = 0; index < instruments.length; index++) {
            if (instruments[index] instanceof Piano) {
                System.out.print("Instrument at index " + index + " is a Piano. ");
            } else if (instruments[index] instanceof Flute) {
                System.out.print("Instrument at index " + index + " is a Flute. ");
            } else if (instruments[index] instanceof Guitar) {
                System.out.print("Instrument at index " + index + " is a Guitar. ");
            }
            instruments[index].play();
        }
    }
}