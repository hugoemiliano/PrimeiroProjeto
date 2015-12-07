package info.hugoemiliano.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Tela4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela4);
		
		Button btnOk = (Button) findViewById(R.id.buttonOK);
		btnOk.setOnClickListener(clicklistener);
	}

	private OnClickListener clicklistener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			TextView resp = (TextView) findViewById(R.id.textViewResp);
			CheckBox chkAndroid = (CheckBox) findViewById(R.id.checkBoxAndroidBasico);
			CheckBox chkJava = (CheckBox) findViewById(R.id.checkBoxJavaBasico);
			CheckBox chkCSharp = (CheckBox) findViewById(R.id.checkBoxCSharpBasico);
			
			String msg = "Curso(s) selecionado(s): ";
			if (chkAndroid.isChecked())
				msg += chkAndroid.getText().toString() + " ";
			if (chkJava.isChecked())
				msg += chkJava.getText().toString() + " ";
			if (chkCSharp.isChecked())
				msg += chkCSharp.getText().toString() + " ";
			
			resp.setText(msg);
		}
	};
	



}
