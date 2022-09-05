package com.sapient.bookMyShow.entity;

public enum BookingChannel {
    PVR("PVR", BookingChannelExecutorType.PVR_EXECUTOR),
    INOX("INOX", BookingChannelExecutorType.INOX_EXECUTOR),
    CINEPLEX("CINEPLEX", BookingChannelExecutorType.CINEPLEX_EXECUTOR),
    BMS("BMS", BookingChannelExecutorType.BMS_EXECUTOR);

    private final String value;
    private final String executorType;

    @Override
    public String toString() { return executorType;}

    BookingChannel(String value, String executorType) {
        this.value = value;
        this.executorType = executorType;
    }

    public String executorType() {
        return executorType;
    }

    public String value() {
        return value;
    }
}
