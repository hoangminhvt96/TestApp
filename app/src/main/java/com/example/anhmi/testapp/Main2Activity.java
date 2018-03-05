package com.example.anhmi.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.anhmi.testapp.Model.Person;
import com.example.anhmi.testapp.myadapter;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private EditText editName;
    private EditText editAddress;
    private ListView list_item;
    private RadioButton radNormal;
    private RadioButton radDisable;
    private Button  btnAdd;
    private Button btnExit;
    private ArrayList<Person> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setControl();
        //final ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(this, android.R.layout.simple_list_item_1, data);
        final myadapter adapter = new myadapter(this, R.layout.layout1, data);
        list_item.setAdapter(adapter);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(getApplicationContext(), "Thêm", Toast.LENGTH_SHORT).show();
                Log.d(editName.getText().toString(), "test");
                editAddress.setText(editName.getText());*/
                Person person = new Person();
                person.setHoTen(editName.getText().toString());
                person.setDiaChi(editAddress.getText().toString());
                if (radNormal.isChecked())
                {
                    person.setTrangThai(radNormal.getText().toString());
                }
                else
                {
                    person.setTrangThai(radDisable.getText().toString());
                }
                Toast.makeText(getApplicationContext(),person.toString(),Toast.LENGTH_SHORT).show();
                data.add(person);
                adapter.notifyDataSetChanged();

            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    private void setControl()
    {
        editName = (EditText) findViewById(R.id.editName);
        editAddress = (EditText) findViewById(R.id.editAddress);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        radNormal = (RadioButton) findViewById(R.id.radNormal);
        radDisable = (RadioButton) findViewById(R.id.radDisable);
        list_item = (ListView) findViewById(R.id.list_item);
        btnExit = (Button) findViewById(R.id.btnExit);
    }

}
