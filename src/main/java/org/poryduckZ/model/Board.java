package org.poryduckZ.model;

import java.util.List;

public class Board {
    private final List<BoardSpace> spaces;

    public Board(List<BoardSpace> spaces) {
        this.spaces = List.copyOf(spaces);
    }

    public BoardSpace getSpace(int position) {
        return spaces.get(position % spaces.size());
    }

    public int size() {
        return spaces.size();
    }
}