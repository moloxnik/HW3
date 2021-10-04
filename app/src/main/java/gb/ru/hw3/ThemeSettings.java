package gb.ru.hw3;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

public class ThemeSettings extends AppCompatActivity {
  private SwitchCompat switchTheme;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.darkTheme);
        }
        else setTheme(R.style.Theme_HW3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themesettings);
        switchTheme=(SwitchCompat) findViewById(R.id.switchTheme);
        if (AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            switchTheme.setChecked(true);
        }
        switchTheme.setOnClickListener(new CompoundButton.OnCheckedChangeListener()

        });
    }
}
