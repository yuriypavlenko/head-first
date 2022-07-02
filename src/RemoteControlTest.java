import RemoteControl.*;
import RemoteControl.commands.GarageDoorOpenCommand;
import RemoteControl.commands.LightOnCommand;
import RemoteControl.elements.GarageDoor;
import RemoteControl.elements.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light(); // Получатель
        GarageDoor garageDoor = new GarageDoor(); // Получатель

        LightOnCommand lightOnCommand = new LightOnCommand(light); // Команда вместе с Получателем
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(); // Инициатор

        simpleRemoteControl.setCommand(lightOnCommand); // Передаем Команду Инициатору
        // Эмулируется нажатие на кнопку, Инициатор запускает команду: вызов определенного метода у Получателя
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageOpen);
        simpleRemoteControl.buttonWasPressed();
    }
}
