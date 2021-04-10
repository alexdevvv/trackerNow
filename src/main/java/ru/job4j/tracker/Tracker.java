package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(){
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return new Item();
    }

    public Item[] findByName(String key) {
        Item[] newArrayItemByName = new Item[size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                newArrayItemByName[num++] = item;
            }
        }
        return Arrays.copyOf(newArrayItemByName, num + 1);
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        for (int i = 0; i < size; i++) {
            Item item1 = items[i];
            if (id == item1.getId()) {
              items[indexOf(id)] = item;
              rsl = true;
            }
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if(item.getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

}