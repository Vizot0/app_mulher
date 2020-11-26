package p.com.app_mulher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cadastrobtn(View view)
    {
        Intent i;
        i = new Intent(this, cadastro.class);
        startActivity(i);
    }
    public void loginbtn(View view)
    {
        Intent i;
        i = new Intent(this, entrar.class);
        startActivity(i);
    }
}
