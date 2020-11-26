package p.com.app_mulher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class cadastro extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void cadastrarbtn(View view)
    {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);

        Toast.makeText(cadastro.this,"Cadastro Feito com Sucesso", Toast.LENGTH_SHORT).show();

    }
}
