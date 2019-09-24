package com.example.blue;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



     int enable=0;
     int discover=1;
    BluetoothAdapter bluetoothAdapter;

    public void onblue(View view){

    if(!bluetoothAdapter.isEnabled()){

        Intent onintent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(onintent,enable);
    }else{

        Toast.makeText(this, "bluetooth is on only !!", Toast.LENGTH_SHORT).show();
    }





    }



    public void offblue(View view){
      
        
        bluetoothAdapter.disable();
        Toast.makeText(this, "turning off ", Toast.LENGTH_SHORT).show();

    }

  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();






    }
}
