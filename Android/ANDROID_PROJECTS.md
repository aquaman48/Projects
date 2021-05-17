# Android Applications using Java

Compiler used: **Android Studios** v.4.1.3 <br />
OS: **Microsoft Windows 10**

# Welcome 

Here are some Android projects that I worked on. Simple and powerful applications that snapshot some of the core components of making good use of Java in our Android Applications.
Additional Android Sandbox files can be found [here](https://github.com/aquaman48/Android-Apps)

# Simple Pedometer

This application is just exactly what the title says. A very simple pedometer that uses `SharedPrefrences` and `SensorManager` Java utilities to function. The shared preferences are used to store the step count so when the application is restarted it will retain the most current step count. I could only test this on the emulator inside Android Studios, so the number only goes up on click. The code is still writtend and would function if the user was actually walking or running. In the code snippets below, you can see we make use of the Android Sensor Manager library. That is where we get the `float x_acceleration` variables and store them. The `Magnitude` variable is what we are saying the threshold is for what we consider to be a "step". So if the sensor finds an event over 6 it will add a step to the step counter. See below for code breakdown and screen shots.  


## Code Breakdown

### Variables 

    private TextView textView;
    private double MagnitudePrevious = 0;
    private Integer stepCount = 0;
    
    textView = findViewById(R.id.textView);
    SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    Sensor sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        
### Listeners
To listen for steps we must initialize the SensorEventListener. 

        SensorEventListener stepDetector = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                if(event != null) {
                    float x_acceleration = event.values[0];
                    float y_acceleration = event.values[1];
                    float z_acceleration = event.values[2];

                    double Magnitude = Math.sqrt(x_acceleration * x_acceleration +
                            y_acceleration * y_acceleration + z_acceleration + z_acceleration);
                    double MagnitudeDelta = Magnitude - MagnitudePrevious;
                    MagnitudePrevious = Magnitude;

                    if (MagnitudeDelta > 6) {
                        stepCount++;
                    }
                    textView.setText("You have taken " + stepCount.toString() + " steps!");

                }
            }

### Shared Preferences

This is how the steps are stored and then when app is opened up how the new steps are added. 

    protected void onPause() {
        super.onPause();

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.putInt("stepCount", stepCount);
        editor.apply();
    }

    protected void onStop() {
        super.onStop();

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.putInt("stepCount", stepCount);
        editor.apply();
    }

    protected void onResume() {
        super.onResume();

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        stepCount = sharedPreferences.getInt("stepCount", 0);
    }
    }
    
 ## Results
 
 ![main](https://github.com/aquaman48/Projects/blob/main/Android/Screenshots/Simple_Pedometer_Main.png) ![step](https://github.com/aquaman48/Projects/blob/main/Android/Screenshots/Simple_Pedometer_Step.png)
 
 # Ringtone Sampler Application
 
