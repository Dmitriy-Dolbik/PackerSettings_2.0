package com.delivery;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PacketSettingsService {

    public PacketSettingsService(List<PacketSetting> packetSettingList) {

    }

    public Set<PacketSetting> getSortedPacketSettings(PlaceToShow placeToShow) {
        return new HashSet<>();
    }

    public Optional<PacketSetting> getPacketSetting(String packetItem) {
        return Optional.empty();
    }

    public int getPacketQuantityLimit(String packetItem) {
        return 0;
    }

    public Integer getPacketOrder(String packetItem) {
        return 0;
    }

    public boolean isPacket(ProductEntity checkingProduct, PlaceToShow placeToShow) {
        return false;
    }

    public Set<String> getPacketItemSet(PlaceToShow placeToShow) {
        return new HashSet<>();
    }

    public Set<String> getPacketBarcodeSet(PlaceToShow placeToShow) {
        return new HashSet<>();
    }

    public boolean isPacket(ProductEntity checkingProduct) {
        return false;
    }

    public boolean isPacket(ProductEntity checkingProduct, Set<String> packetItems, Set<String> packetBarcodes) {
        return false;
    }

    public boolean isPacket(String packetCode) {
        return false;
    }

    public String getDisplayName(ProductEntity product) {
        return "";
    }

    public boolean hasPackets(PlaceToShow placeToShow) {
        return false;
    }

    public Set<String> getPacketItems() {
        return new HashSet<>();
    }
}
