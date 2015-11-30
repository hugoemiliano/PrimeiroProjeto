package info.hugoemiliano.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Tela1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);
		
		Button btn = (Button) findViewById(R.id.buttonProximo);
		btn.setOnClickListener(clickListener);
		
	}
	
	private OnClickListener clickListener = new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			TextView tvResultado = (TextView) findViewById(R.id.textViewResposta);
			EditText txtNome = (EditText) findViewById(R.id.editTextNome);
			
		
			String msg = "Nome: " + txtNome.getText().toString();
		tvResultado.setText(msg);
			
		}

		};	

}
