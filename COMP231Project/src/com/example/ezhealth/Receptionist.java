package com.example.ezhealth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Receptionist extends Activity {

	private Button btnRegisterPatient, btnSearchPatientInfo, btnSearchDoctorInfo, btnAllPatients, btnAllDoctors;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_receptionist);
		btnRegisterPatient = (Button) findViewById(R.id.btnRegisterPatient);
		btnRegisterPatient.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), PatientAccount.class);
				startActivity(i);
			}
		});
		
		btnSearchPatientInfo = (Button) findViewById(R.id.btnSearchPatientInfo);
		btnSearchPatientInfo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), ReceptionistPatientSearch.class);
				startActivity(i);
			}
		});
		
		btnSearchDoctorInfo = (Button) findViewById(R.id.btnSearchDoctorInfo);
		btnSearchDoctorInfo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), ReceptionistDoctorSearch.class);
				startActivity(i);
			}
		});
		
		btnAllPatients = (Button) findViewById(R.id.btnAllPatients);
		btnAllPatients.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), ReceptionistViewAllPatients.class);
				startActivity(i);
			}
		});
		
		btnAllDoctors = (Button) findViewById(R.id.btnAllDoctors);
		btnAllDoctors.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), ReceptionistViewAllDoctor.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.receptionist, menu);
		return true;
	}

}
