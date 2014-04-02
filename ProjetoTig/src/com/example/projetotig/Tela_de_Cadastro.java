package com.example.projetotig;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Tela_de_Cadastro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_teste);

//		EditText campoEmail=(EditText)findViewById(R.id.etemail);
//		
//		Intent IDadosRecebidos = getIntent();
//		if(IDadosRecebidos != null)
//		{
//			String dadosRecebidos=IDadosRecebidos.getStringExtra("email");
//
//			if(dadosRecebidos != null)
//			{
//				
//				campoEmail.setText(dadosRecebidos);
//			}
//		}
//		
	
	
	}

	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_de__cadastro, menu);
		return true;
	}

}
