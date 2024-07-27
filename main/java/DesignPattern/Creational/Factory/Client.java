package DesignPattern.Creational.Factory;

import DesignPattern.Creational.Factory.button.AndroidButton;
import DesignPattern.Creational.Factory.button.Button;
import DesignPattern.Creational.Factory.button.IosButton;
import DesignPattern.Creational.Factory.menu.IosMenu;
import DesignPattern.Creational.Factory.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        flutter.refresh();

        //we need to create buttons as well as ther ui related work. but flutter can be used in multiple OS
        UiFactory ui = flutter.getUiFactory("Ios");
        Button b = new AndroidButton();
        b.click();
        Menu m = ui.createMenu();
        m.showMenu();
    }
}
