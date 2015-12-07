package info.hugoemiliano.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tela5 extends Activity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela5);
		
		Button btnOk = (Button) findViewById(R.id.buttonOK);
		btnOk.setOnClickListener(clickListener);
	}
	
	private OnClickListener clickListener = new OnClickListener() {
		
		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			TextView resposta = (TextView) findViewById(R.id.textViewResposta);
			
			RadioGroup grupo =(RadioGroup) findViewById(R.id.rdGroupCursos);
			
			int radioId = grupo.getCheckedRadioButtonId();
			
			String msg = "Curso Selecionado";
			
			if (radioId != -1){
				RadioButton rb = (RadioButton) findViewById(radioId);
				msg += rb.getText().toString() + " ";
			}else {
				msg = "Nenhum RadioButton selecionado";
			}
			resposta.setText(msg);
		}
	};
	
}
