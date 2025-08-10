package org.poryduckZ.model;

public sealed interface BoardSpace
        permits Property, TaxSpace, JailSpace, GoSpace, FreeParkingSpace,
        CardSpace, UtilitySpace, RailwaySpace {
    String name();
}
