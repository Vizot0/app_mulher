package p.com.app_mulher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class entrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);
    }
    public void entrarbtn(View view)
    {
        Intent i;
        i = new Intent(this, depoimento.class);
        startActivity(i);
        Toast.makeText(entrar.this,"Login Feito com Sucesso", Toast.LENGTH_SHORT).show();

    }
    public void anonibtn(View view)
    {
        Intent i;
        i = new Intent(this, depoimento.class);
        startActivity(i);
        Toast.makeText(entrar.this,"Voce utilizou o ususario anonimo", Toast.LENGTH_SHORT).show();

    }
}
