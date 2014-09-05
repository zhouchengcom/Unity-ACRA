package com.example.unityarca;

import android.app.Application;
import org.acra.*;
import org.acra.annotation.*;

@ReportsCrashes(
    formKey = "", // This is required for backward compatibility but not used
    formUri = "http://yoursurl/crashs"
)

public class ExtendedApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		ACRA.init(this);
	}
}
