package com.example.planes_rv;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Planes> planes = new ArrayList<>();

    private PlaneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        adapter = new PlaneAdapter(planes);
        RecyclerView recyclerView = findViewById(R.id.rv_main);
        recyclerView.setAdapter(adapter);
        loadData();
    }

    private void loadData() {
        planes.add(new Planes("МС-21 ","МС-21 " , "https://resizer.mail.ru/p/c31d53fb-7bab-51ef-808c-a22d81c3780b/AQAKn1j4893XM3xdsrjsosMHF9xsgkISa60wYIBNHW22ABjWf5ZovN8n2mOEDhYOPLYROwU_pDyV6koTxWXEUgSCi2U.webp"));
        planes.add(new Planes("Ту-214 ","Ту-214 ", "https://resizer.mail.ru/p/0e52b793-4667-52f9-88e9-32145686655d/AQAKM2lJT22sXwEyi1mDnz13RJWR3J_0JBTVD-E71cSuBc9verPlEbJu7BW25Vx4VkyL1H6Q6tUyHhwkpv9I_08eVC8.webp"));
        planes.add(new Planes("Boeing 737 MAX ","Boeing 737 MAX ", "https://resizer.mail.ru/p/9c3860a6-d268-5ae0-8d68-342250d338c8/dpr:120/AQAKlkdU2lGK2Y8IIqAZ24bzbKbcKysZmu_Q3ApZckvGPW-yiHVI6pDB2z31h9HF1cMrjJdFhw0LH7yrSdNZLrsByks.webp"));
        planes.add(new Planes("Boeing 777X ","Boeing 777X ", "https://resizer.mail.ru/p/627ab4db-63d4-5c8a-bc32-e1f0c49a8887/AQAKlUmoFn8kiKXrir_AQX_59pH-h4a8lZKkyRW9MGiaQiCKB2OBCY2-Ni6Hs0GjVBpthVqhAxZoAsq_FAZMJb_zlCg.webp"));
        planes.add(new Planes("Bombardier Cseries ","Bombardier Cseries ", "https://resizer.mail.ru/p/e33dded9-02a9-5f66-ad44-b4db07bdd4b7/dpr:120/AQAKMTsZV6R70FtboTSGoSyMMNtVvApulaDiglxElreRhrHIyyIO-wr9T7Ae58IE_1gFd1wpyvMWaRlrZVLgi_4UfU8.webp"));
    }
}