package com.example.projetotig;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.telainicial);
		final EditText etemail = (EditText) findViewById(R.id.etemail);
		Button entrar = (Button) findViewById(R.id.etentrar);

		Button etcadastro = (Button) findViewById(R.id.etcadastro);

		etcadastro.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent Itelacadastro = new Intent(MainActivity.this,
						Tela_de_Cadastro.class);
				Itelacadastro.putExtra("email", etemail.getText().toString());
			startActivity(Itelacadastro);
			}
		});
		entrar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent ItelaSegunda = new Intent(MainActivity.this,
						SegundaTela.class);
				ItelaSegunda.putExtra("email", etemail.getText().toString());
				startActivity(ItelaSegunda);
			}
		});

	}

}
