package cz.cvut.fel.omo.trackingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Heap {

    private List<Integer> list = new ArrayList<>();

    public void addToList(Integer item) {
        list.add(item);
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }


    public Heap deepCopy() {
        Heap heap = new Heap();

        heap.setList(new ArrayList<>(list));

        return heap;
    }

    public Heap shallowCopy() {
        Heap heap = new Heap();
        heap.setList(list);
        return heap;
    }
}
