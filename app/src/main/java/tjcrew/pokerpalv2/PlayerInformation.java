package tjcrew.pokerpalv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PlayerInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_information);
    }

    public void Confirm(View v){
        Intent intent = new Intent(this, PokerTable.class);
        startActivity(intent);
    }
}
