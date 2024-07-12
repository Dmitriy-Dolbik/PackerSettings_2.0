package com.delivery;

public class PacketSetting {
    private static final long serialVersionUID = 1L;
    private String barcode;
    private String item;
    private String productName;
    private Integer quantityLimit;
    private String displayName;
    private PlaceToShow placeToShow;
    private Integer order;

    public String getBarcode() {
        return barcode;
    }

    public String getItem() {
        return item;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantityLimit() {
        return quantityLimit;
    }

    public String getDisplayName() {
        return displayName;
    }

    public PlaceToShow getPlaceToShow() {
        return placeToShow;
    }

    public Integer getOrder() {
        return order;
    }
}
