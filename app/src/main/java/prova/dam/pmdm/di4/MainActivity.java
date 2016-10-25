package prova.dam.pmdm.di4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.Opcion1 :
                Toast.makeText(getApplicationContext(), "Item1",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Opcion2 :
                Toast.makeText(getApplicationContext(), "Item2",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Opcion3 :
                Toast.makeText(getApplicationContext(), "Item3",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Opcion21:
                Toast.makeText(getApplicationContext(), "Submenu",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Opcion22:
                Toast.makeText(getApplicationContext(), "Submenu",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
