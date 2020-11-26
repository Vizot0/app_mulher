package p.com.app_mulher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class depoimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depoimento);
    }
    public void dn1(View view){

        Toast.makeText(this,"Denuncia Feita com sucesso", Toast.LENGTH_SHORT).show();

    }
    public void dn2(View view){

        Toast.makeText(this,"Denuncia Feita com sucesso", Toast.LENGTH_SHORT).show();

    }
    public void dn3(View view){

        Toast.makeText(this,"Denuncia Feita com sucesso", Toast.LENGTH_SHORT).show();

    }
}

