import RemoteControl.RemoteControl;
import RemoteControl.commands.*;
import RemoteControl.elements.GarageDoor;
import RemoteControl.elements.Light;
import RemoteControl.elements.Stereo;

/**
 * Пример реализации паттерна "Команда"
 *
 * Есть Клиент, который создает Инициатора, Получателей и Команду
 * Дальше Команда назначается Инициатору
 * Дальше Инициатор вызывает общедоступный метод execute() у Команды, не зная при этом ничего про Получателей запросов,
 * а знает об этом Команда, именно она в свою очередь и обращается к Получателям, вызывает у них соответствующие методы
 *
 * Таким образом Получатель (запроса) отделен от Инициатора (запроса) Командой
 */

// Тот, кто использует пульт для управления устройствами (Клиент)
public class RemoteLoader {
    public static void main(String[] args) {
        // Создаем пульт (Инициатор)
        RemoteControl remoteControl = new RemoteControl();

        // Создаем все устройства (Получатели)
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();
        Stereo stereo = new Stereo();

        // Создаем команды (Команды)
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] pattyOn = {lightOff, stereoOnWithCD};
        Command[] pattyOff = {lightOn, stereoOff};
        PattyCommand pattyOnCommand = new PattyCommand(pattyOn);
        PattyCommand pattyOffCommand = new PattyCommand(pattyOff);

        // Назначаем команды для каждого слота (кнопки) Пульта
        remoteControl.setCommand(1, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(2, lightOn, lightOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, pattyOnCommand, pattyOffCommand);

        // Смотрим, как сконфигурирован пульт
        System.out.println(remoteControl);

        // Пользуемся пультом
        remoteControl.onButtonWasPushed(1); // Открываем гараж
        remoteControl.onButtonWasPushed(2); // Включаем свет
        remoteControl.offButtonWasPushed(1); // Закрываем гараж
        remoteControl.onButtonWasPushed(3); // Включаем стерео
        remoteControl.offButtonWasPushed(3); // Выключаем стерео
        remoteControl.offButtonWasPushed(2); // Выключаем свет
        System.out.println("\nUndo last command...");
        remoteControl.undoButtonWasPushed(); // Отменили выключение света, свет включился
        System.out.println("\nLet's patty...");
        remoteControl.onButtonWasPushed(4);
        System.out.println("\nPatty end...");
        remoteControl.offButtonWasPushed(4);
    }
}
