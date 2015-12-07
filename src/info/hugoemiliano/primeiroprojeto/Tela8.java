package info.hugoemiliano.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Tela8 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela8);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.activity_tela1, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		TextView tvResposta = (TextView) findViewById(R.id.textViewResposta8);
		String msg = "";
		switch(item.getItemId()) {
		case R.id.menu_archive:
			msg = "Selecionado a opção Arquivo";
			break;
		case R.id.menu_edit:
			msg = "Selecionado a opção Editar";
			break;
		case R.id.menu_save:
			msg = "Selecionado a opção Salvar";
			break;
		case R.id.menu_home:
			msg = "Selecionado a opção Home";
			break;
		case R.id.menu_delete:
			msg = "Selecionado a opção Delete";
			break;
		case R.id.menu_more:
			msg = "Selecionado a opção Mais";
			break;		
		}
		tvResposta.setText(msg);
		return true;
	}
}
