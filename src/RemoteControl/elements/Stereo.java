package RemoteControl.elements;

public class Stereo {
    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCd() {
        System.out.println("Stereo set CD");
    }

    public void setDvd() {
        System.out.println("Stereo set DVD");
    }

    public void setRadio() {
        System.out.println("Stereo Radio");
    }

    public void setVolume(int i) {
        System.out.println("Stereo Volume to " + i);
    }
}
