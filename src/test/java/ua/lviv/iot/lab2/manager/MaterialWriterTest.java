package ua.lviv.iot.lab2.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.hierarchy.Bricks;
import ua.lviv.iot.lab2.hierarchy.Cables;
import ua.lviv.iot.lab2.hierarchy.Materials;
import ua.lviv.iot.lab2.hierarchy.Wallpapers;
import ua.lviv.iot.lab2.manager.RenovationCompany;
import ua.lviv.iot.lab2.manager.Manager;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MaterialWriterTest extends Manager {
    private Manager manager;
    private Bricks brick1;
    private Cables cable1;
    private Wallpapers wallpaper1;
    private RenovationCompany renovationCompany;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void writeToFile() throws IOException {
        brick1 = new Bricks("brick", 3,1,1,1);
        cable1 = new Cables("cable", 1,1,1,1);
        wallpaper1 = new Wallpapers("wallpaper",1,1,8,true);
        Materials[] materials = {brick1, cable1, wallpaper1};
        manager = new Manager(materials);
        MaterialWritter writter = new MaterialWritter();
        writter.writeToFile(materials , "src\\test\\resources\\expected.csv");
    }
}