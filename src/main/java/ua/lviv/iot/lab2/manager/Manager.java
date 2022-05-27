package ua.lviv.iot.lab2.manager;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ua.lviv.iot.lab2.hierarchy.Materials;
import java.util.*;

@NoArgsConstructor
@Getter

public class Manager {
    private Materials[] arrOfMaterials;
    ArrayList<String> toDoList = new ArrayList<String>();
    public Manager(Materials[] arrOfMaterials){
        this.arrOfMaterials=arrOfMaterials;
        sortArrayByPricePerKilo();
        sortArrayByQuantityInKg();
        sortArrayByPricePerKiloReflected();
        sortArrByQuantityInKgReflected();
        createRenovationPlan();
        printToDoList();
    }
    public void createRenovationPlan(){
        for (int i = 0; i<getArrOfMaterials().length; i++) {
            toDoList.add(getArrOfMaterials()[i].Renovate());
        }
    }
    public void printToDoList(){
        System.out.println("To do list:");
        for (int i=0; i<toDoList.size();i++) {
            System.out.println(toDoList.get(i));
        }
        System.out.println("End.");
    }
    Comparator PricePerKiloComparator= Comparator.comparing(Materials::getPricePerKilo);
    Comparator QuantityInKgComparator = Comparator.comparing(Materials::getQuantityInKg);

    public void sortArrayByPricePerKilo(){
        Arrays.sort(arrOfMaterials, PricePerKiloComparator);
        System.out.println("Sorted by Price: ");
        for (int i = 0; i < arrOfMaterials.length; i++)
        {
            System.out.println(arrOfMaterials[i].toString());
        }
        System.out.println();

    }
    public void sortArrayByPricePerKiloReflected(){
        Arrays.sort(arrOfMaterials, PricePerKiloComparator.reversed());
        System.out.println("Sorted(R) by Price: ");
        for (int i = 0; i < arrOfMaterials.length; i++)
        {
            System.out.println(arrOfMaterials[i].toString());
        }
        System.out.println();

    }
    public void sortArrayByQuantityInKg(){
        Arrays.sort(arrOfMaterials, QuantityInKgComparator);
        System.out.println("Sorted by Quantity: ");
        for (int i = 0; i < arrOfMaterials.length; i++)
        {
            System.out.println(arrOfMaterials[i].toString());
        }
        System.out.println();

    }
    public void sortArrByQuantityInKgReflected(){
        Arrays.sort(arrOfMaterials, QuantityInKgComparator.reversed());
        System.out.println("Sorted(R) by Quantity: ");
        for (int i = 0; i < arrOfMaterials.length; i++)
        {
            System.out.println(arrOfMaterials[i].toString());
        }
        System.out.println();
    }

}

