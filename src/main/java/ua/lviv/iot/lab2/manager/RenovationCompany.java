package ua.lviv.iot.lab2.manager;
import ua.lviv.iot.lab2.hierarchy.Cables;
import ua.lviv.iot.lab2.hierarchy.Materials;
import ua.lviv.iot.lab2.hierarchy.Wallpapers;
import ua.lviv.iot.lab2.hierarchy.Bricks;

public class RenovationCompany {
    Wallpapers wallpapers_one = new Wallpapers("Classic", 1000, 1, 10, false);
    Cables cables_one = new Cables("Optical Fiber", 3000, 1,20,300);
    Bricks brick_one = new Bricks("Moonlight bricks", 200, 12, 60,300);
    Materials[] arrOfMaterials = {wallpapers_one, cables_one, brick_one};
    Manager manager = new Manager(arrOfMaterials);
}
