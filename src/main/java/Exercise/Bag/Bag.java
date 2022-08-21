package Exercise.Bag;

import java.util.HashMap;
import java.util.Map;

public class Bag {
    private String name;
    private Integer volume;
    private Integer leftVolume;
    private Map<String, Integer> items;

    public Bag(String name, Integer volume) {
        this.name = name;
        this.volume = volume;
        this.leftVolume = this.volume;
        this.items = new HashMap<>();
    }

    public boolean addItemIfPossible(String nameItem, Integer volumeItem) {
        boolean isAdded = false;
        if (this.leftVolume > volumeItem) {
            this.items.put(nameItem, volumeItem);
            this.leftVolume = this.leftVolume - volumeItem;
            isAdded = true;
            System.out.println("The item was added");
        } else {
            //todo throw error
            isAdded = false;
            System.out.println("The item was not added, not enough volume");
        }
        return isAdded;
    }

    public boolean deleteItemFromBag(String nameOfTheItemToBeDelete) {
        if (this.items.containsKey(nameOfTheItemToBeDelete)) {
            items.remove(nameOfTheItemToBeDelete);
            this.leftVolume = this.leftVolume + items.get(nameOfTheItemToBeDelete);
            return true;
        }
        return false;
    }


    //----------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }

    public Integer getLeftVolume() {
        return leftVolume;
    }

    public void setLeftVolume(Integer leftVolume) {
        this.leftVolume = leftVolume;
    }
}
