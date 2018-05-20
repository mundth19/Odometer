package edu.hanover.odometer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Binder;


public class OdometerService extends Service {
    private final IBinder binder = new OdometerBinder();
    public OdometerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public class OdometerBinder extends Binder {
        OdometerService getOdometer() {
            return OdometerService.this;
        }
    }
}
