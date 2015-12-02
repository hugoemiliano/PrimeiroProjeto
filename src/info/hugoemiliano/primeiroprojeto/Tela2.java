package info.hugoemiliano.primeiroprojeto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Tela2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela2);
		Intent intent = getIntent();
		Bundle args = intent.getExtras();
		
		String nome = args.getString("nome");
		
		TextView viewNome = (TextView) findViewById(R.id.textViewAluno);
		viewNome.setText("Aluno: " + nome);
		
		Button btn = (Button) findViewById(R.id.buttonVoltar);
	    btn.setOnClickListener(clicklistener);
	}
private OnClickListener clicklistener = new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		finish();
	}
};

}
