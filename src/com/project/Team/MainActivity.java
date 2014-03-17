package com.project.Team;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button btnMAaddaNote;
	EditText etAMtxtShopType;
	EditText etAMtxtItemName;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnMAaddaNote=(Button)findViewById(R.id.btnMAaddaNote);
		etAMtxtItemName=(EditText)findViewById(R.id.etAMtxtItemName);
		etAMtxtShopType=(EditText)findViewById(R.id.etAMtxtShopType);
		
	}



}
