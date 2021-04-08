package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNew2ItemThenTracker() {
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setName("item1");
        item2.setName("item2");
        tracker.add(item1);
        tracker.add(item2);
        Item rsl1 = tracker.findById(item2.getId());
        assertThat(rsl1.getName(), is(item2.getName()));
    }
}