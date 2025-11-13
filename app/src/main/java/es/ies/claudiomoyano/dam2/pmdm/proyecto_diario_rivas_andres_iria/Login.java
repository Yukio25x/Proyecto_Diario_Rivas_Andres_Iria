package es.ies.claudiomoyano.dam2.pmdm.proyecto_diario_rivas_andres_iria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity  implements View.OnClickListener {

    //variables
    private ImageView image;
    private TextView info;
    private EditText user, password;
    private Button accept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //relacionar variables y elementos en el layout
        image = findViewById(R.id.iv_login);
        info = findViewById(R.id.tv_info);
        user = findViewById(R.id.et_user);
        password = findViewById(R.id.et_password);
        accept = findViewById(R.id.btn_login);

        accept.setOnClickListener(this);

        //image.setImage();
    }

    //Acción del botón para verificar al usuario
    @Override
    public void onClick(View v) {
        if (!(user.getText().toString().isEmpty() || password.getText().toString().isEmpty()) && user.getText().toString().equals("user") && password.getText().toString().equals("pass")) {
            info.setText("ole ole");
        } else {
            info.setText(R.string.wrong_login);
        }
    }
}