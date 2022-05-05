package ua.lviv.iot.lab2.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.hierarchy.Bricks;
import ua.lviv.iot.lab2.hierarchy.Cables;
import ua.lviv.iot.lab2.hierarchy.Materials;
import ua.lviv.iot.lab2.hierarchy.Wallpapers;
import ua.lviv.iot.lab2.manager.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    private Manager manager1;
    private Bricks brick1;
    private Cables cable1;
    private Wallpapers wallpaper1;

    @BeforeEach
    void setUp() {
        wallpaper1 = new Wallpapers("Adolf", 45,12,41, true);
        cable1 = new Cables("Cable", 12, 13, 14,69);
        brick1 = new Bricks("Brick", 10, 10, 10, 1);
        Materials[] arrOfMaterials = {wallpaper1, cable1, brick1};
        manager1 = new Manager(arrOfMaterials);


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCreateRenovationPlan() {
        manager1.createRenovationPlan();
        Assertions.assertNotNull(manager1.getToDoList());
    }

    @Test
    void testSortArrayByPricePerKilo() {
        manager1.sortArrayByPricePerKilo();
        var arr = manager1.getArrOfMaterials();
        for (int i = 0; i < manager1.getArrOfMaterials().length - 1; i++) {
            int j = i + 1;
            boolean res;
            res = (arr[i].getPricePerKilo() - arr[j].getPricePerKilo() <= 0) ? (true) : (false);
            Assertions.assertTrue(res);
        }
    }

    @Test
    void testSortArrayByPricePerKiloReflected() {
        manager1.sortArrayByPricePerKiloReflected();
        var arr = manager1.getArrOfMaterials();
        for (int i = 0; i < manager1.getArrOfMaterials().length - 1; i++) {
            int j = i + 1;
            boolean res;
            res = (arr[j].getPricePerKilo() - arr[i].getPricePerKilo() <= 0) ? (true) : (false);
            Assertions.assertTrue(res);
        }
    }

    @Test
    void testSortArrayByQuantityInKg() {
        manager1.sortArrayByQuantityInKg();
        var arr = manager1.getArrOfMaterials();
        for (int i = 0; i < manager1.getArrOfMaterials().length - 1; i++) {
            int j = i + 1;
            boolean res;
            res = (arr[i].getQuantityInKg() - arr[j].getQuantityInKg() <= 0) ? (true) : (false);
            Assertions.assertTrue(res);
        }
    }

    @Test
    void testSortArrByQuantityInKgReflected() {
        manager1.sortArrByQuantityInKgReflected();
        var arr = manager1.getArrOfMaterials();
        for (int i = 0; i < manager1.getArrOfMaterials().length - 1; i++) {
            int j = i + 1;
            boolean res;
            res = (arr[j].getQuantityInKg() - arr[i].getQuantityInKg() <= 0) ? (true) : (false);
            Assertions.assertTrue(res);
        }

    }
}