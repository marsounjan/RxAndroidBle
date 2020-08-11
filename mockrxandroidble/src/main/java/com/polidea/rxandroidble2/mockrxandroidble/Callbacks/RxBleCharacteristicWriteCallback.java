package com.polidea.rxandroidble2.mockrxandroidble.Callbacks;

import android.bluetooth.BluetoothGattCharacteristic;

import com.polidea.rxandroidble2.mockrxandroidble.Callbacks.Results.RxBleGattWriteResultMock;
import com.polidea.rxandroidble2.mockrxandroidble.RxBleDeviceMock;

/**
 * An interface for a user callback for handling characteristic write requests
 */
public interface RxBleCharacteristicWriteCallback extends RxBleWriteCallback<BluetoothGattCharacteristic> {

    /**
     * Handles a write on a GATT characteristic
     * @param device the device being written to
     * @param characteristic the characteristic being written to
     * @param data the data being written
     * @param result the result handler
     * @throws Exception on error
     */
    @Override
    void handle(RxBleDeviceMock device,
                BluetoothGattCharacteristic characteristic,
                byte[] data,
                RxBleGattWriteResultMock result) throws Exception;
}
