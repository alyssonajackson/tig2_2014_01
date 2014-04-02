package com.example.projetotig;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SegundaTela extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segundatela);
		TextView mostra = (TextView) findViewById(R.id.mostra);
		Intent IDadosRecebidos = getIntent();
		if (IDadosRecebidos != null) {
			String dadosRecebidos = IDadosRecebidos.getStringExtra("email");

			if (dadosRecebidos != null) {

				mostra.setText(dadosRecebidos);
			}
		}

	}

}
