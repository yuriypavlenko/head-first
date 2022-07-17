package HomeTheater;

public class HomeTheaterFacade {
    Light light;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade (Light light,
                              Projector projector,
                              Screen screen) {
        this.light = light;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie () {
        screen.down();
        projector.on();
        projector.fullscreen();
        light.off();
    }

    public void endMovie () {
        light.on();
        projector.off();
        screen.up();
    }
}
